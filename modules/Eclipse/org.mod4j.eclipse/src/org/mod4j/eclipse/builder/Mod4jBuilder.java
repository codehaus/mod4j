/*******************************************************************************
 * Copyright (c) 2008 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mod4j.eclipse.builder;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.console.MessageConsoleStream;
import org.jdom.Document;

import org.mod4j.crossx.broker.CrossxBroker;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.openarchitectureware.DslExtension;
import org.mod4j.dslcommon.openarchitectureware.Mod4jWorkflowException;
import org.mod4j.dslcommon.openarchitectureware.RunCrossxWorkflow;
import org.mod4j.dslcommon.openarchitectureware.RunGeneratorWorkflow;
import org.mod4j.dslcommon.xml.XmlUtil;

import org.mod4j.eclipse.crossx.views.CrossxView;
import org.mod4j.eclipse.util.EclipseUtil;

/** This class contains two builders, one to build the crossx symbols from a DSL model,
 *  one to generate the code from a model
 * 
 * @author jwa11799
 *
 */
public class Mod4jBuilder extends IncrementalProjectBuilder {

	private MessageConsoleStream console = null;
	
	private static List<DslExtension> dslExtensions = null;

	public  static final String bundleName = "org.mod4j.eclipse";
	private static final String CROSSX_EXTENSION = ".crossx";
	private static boolean initialized = false;
	private static final String DSL_EXTENSION_ID = Mod4jBuilder.bundleName + ".dsl";
	
	class CrossxDeltaVisitor1 implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				generateCode(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				generateCode(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	/** Generate crossx symbol information for all visited model files.
	 * 
	 * @author jwa11799
	 *
	 */
	class CrossxGenerateSymbolDeltaVisitor1 implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				generateCrossxSymbols(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				generateCrossxSymbols(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class CrossxCodeGeneratorVisitor1 implements IResourceVisitor {
		public boolean visit(IResource resource) {
			generateCode(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	/** Visit all resources and generates the crossx symboltable
	 * 
	 * @author Jos Warmer
	 *
	 */
	class CrossxSymbolGeneratorVisitor1 implements IResourceVisitor {
		public boolean visit(IResource resource) {
			generateCrossxSymbols(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	class CrossxFindSymbolsResourceVisitor1 implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkSymbols(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	private void checkSymbols(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(CROSSX_EXTENSION)) {
			try {
				// Check whether the resource is inside a binary folder, if so skip it
				IJavaProject jp = JavaCore.create(getProject());
				IPath outPath = jp.getOutputLocation();
				if( outPath.isPrefixOf(resource.getFullPath()) ){
//					System.err.println("checkSymbols skipping binary [" + resource.getFullPath() + "]");
					return;
				}
			} catch( Exception e ){
				System.err.println("checkSymbols Exception [" + e.getMessage() + "]");
				e.printStackTrace();
			}
//			System.err.println("checkSymbols running on [" + resource.getName() + "]");
			Document doc = XmlUtil.readXmlDocument(EclipseUtil.toFile(resource), true);
			CrossxBroker.addInfo(doc);
		} 
	}

	public static final String BUILDER_ID = "org.mod4j.eclipse.Mod4jBuilder";
	final static QualifiedName CROSSX_REPOSITORY = new QualifiedName("mod4j.cxrossx.broker", "crossxrepository");
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		System.err.println("Mod4jBuilder build called");
//		CrossxBroker repo = (CrossxBroker) getProject().getSessionProperty(CROSSX_REPOSITORY);
//		if( repo == null){
//			System.err.println("Mod4jBuilder build called ==>  FIST TIME FIRST TIME");
//			initialized = true;
//			loadCrossxInfo();
//		}
		
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else if( kind == CLEAN_BUILD ) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		CrossxView.myrefresh();
		return null;
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		System.err.println("Mod4jBuilder: full build");
		try {
			getProject().accept(new CrossxSymbolGeneratorVisitor1());
			getProject().accept(new CrossxCodeGeneratorVisitor1());
		} catch (CoreException e) {
			System.err.println("Mod4jBuilder ERROR fullBuild [" + e.getMessage() + "]");
			// TODO: handle exception
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		System.err.println("Mod4jBuilder: incremental build");
		delta.accept(new CrossxGenerateSymbolDeltaVisitor1());
		delta.accept(new CrossxDeltaVisitor1());
	}
	
	protected void startupOnInitialize() {
		System.err.println("Mod4jBuilder: startupOnInitialize()");
		if( ! initialized ) {
			console = EclipseUtil.findConsole("crossx.projectbuilder");
			CrossxBroker.setPrintStream(EclipseUtil.findConsole("crossx.repository")) ;  
			System.setErr(new PrintStream(console));
//			System.err.println("Mod4jBuilder build called ==>  FIST TIME FIRST TIME");
			initialized = true;
			start();
		}
	}
	
    public void start() {
		System.err.println("=========================>>>>>      START");
		dslExtensions = Mod4jBuilder.getExtensions();
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];	
			myloadCrossxInfo(project);
		}
		System.err.println("=========================>>>>>      END");
    }
    
	
	/** Load the Crossx symbols from all crossx files in the project.
	 * 
	 */
	private void myloadCrossxInfo(IProject project) {
		// Make sure the project is open and has the Mod4j nature.
		try {
			if ( (!project.isAccessible()) || (!project.hasNature(Mod4jNature.NATURE_ID)) ){
				return;
//			EclipseUtil.showMessage("Project '" + selProject.getName() + "' does not have a Mod4j Nature.");
			}
		} catch (CoreException e1) {
			System.err.println("Mod4jBuilder ERROR requesting nature [" + e1.getMessage() + "]");
			e1.printStackTrace();
		} 
		// Run the visitor over the project to collect all Crossx information
		CrossxFindSymbolsResourceVisitor1 visitor = new CrossxFindSymbolsResourceVisitor1();
		try {
			project.accept(visitor);
		} catch (Exception e) {
			System.err.println("Mod4jBuilder ERROR loadCrossxInfo [" + e.getMessage() + "]");
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	private static String MODEL_DIR = "src/model";
	
	/** If this is a DSL model, run the workflow to generate code.
	 * 
	 * @param resource
	 */
	private void generateCode(IResource resource) {
		DslExtension dsl = isDslFile(resource);
		if ( dsl != null ) {
            System.err.println("CODEGEN trying [" + resource.getFullPath().toString() + "]");
			try {
				// Check whether the resource is inside a binary folder, if so skip it
//				IJavaProject jp = JavaCore.create(getProject());
//				if( jp == null ){
//					EclipseUtil.showWarning("Mod4j: model file ["+ resource.getName() +
//			                "] is not in a Java project [" + getProject().getName() + "]");
//					return;
//				}
//              IPath outPath = jp.getOutputLocation();
//              if( outPath.isPrefixOf(resource.getFullPath()) ){
//                  return;
//              }
              System.err.println(MODEL_DIR + "/" + dsl.getDslCodegenProperties());
              IPath resourcePath = resource.getProjectRelativePath();
              IPath modelPath = getProject().findMember(MODEL_DIR).getProjectRelativePath();
              System.err.println("MODEL_PATH    [" + modelPath.toString() + "]");
              System.err.println("RESOURCE_PATH [" + resourcePath.toString() + "]");
              if( ! modelPath.isPrefixOf(resourcePath) ){
//                EclipseUtil.showWarning("Mod4j: model file ["+ resource.getName() +
//                "] is not in a Java project [" + getProject().getName() + "]");
                  return;
              }
			} catch( Exception e ){
				System.err.println("checkDSL Exception [" + e.getMessage() + "]");
				e.printStackTrace();
			}
	
			// properties files
			IResource propertiesFile = getProject().findMember(MODEL_DIR + "/"+ dsl.getDslCodegenProperties());
			if( propertiesFile == null ){
				EclipseUtil.showWarning("Mod4j: code generation properties file ["+ dsl.getDslCodegenProperties() +
		                "] in project [" + getProject().getName() + "] not found, cannot generate code.");
			}
			
			IPath genFile = getGeneratorPath(dsl);
			if( genFile == null ){
				return ;
			}
			String genName = genFile.toString();

         	// Setup the properties for the generator workflow
            String propertiesFilePath = EclipseUtil.resource2FullPathnameString(propertiesFile);
            String modelFilePath     = EclipseUtil.resource2UriString(resource);

			Map<String, String> properties = ModelHelpers.getProperties(propertiesFilePath);
			properties.put("modelFile", modelFilePath );
			properties.put("appPropFilePath", propertiesFilePath);
			
			// Get the relative applicationPath property and make it absolute
			String applicationPath = properties.get("applicationPath");
			String workDir = getProject().getLocation().toString() ;
			String newAppPath = workDir + "/" + applicationPath;
			properties.put("applicationPath", newAppPath );
			properties.put("workDir", workDir);

//			System.err.println("applicationPath [" + newAppPath + "]");
			RunGeneratorWorkflow genWf = new RunGeneratorWorkflow();
			try {
                genWf.runWorkflow(genName, properties);
            } catch (Mod4jWorkflowException e) {
                System.err.println("Workflow ERROR while processing the DSL Model located at:" + workDir);
            }
		} else {
		    System.err.println("CODGEN skipping [" + resource.getFullPath().toString() + "]");
		}
	}
	
	/** If this is a DSL model, generate the crossx symbols
	 * 
	 * @param resource
	 */
	private void generateCrossxSymbols(IResource resource) {
		DslExtension dsl = isDslFile(resource);
		if ( dsl != null ) {
			try {
				// Check whether the resource is inside a binary folder, if so skip it
				IJavaProject jp = JavaCore.create(getProject());
				if( jp == null ){
					EclipseUtil.showWarning("Mod4j: model file ["+ resource.getName() +
			                "] is not in a Java project [" + getProject().getName() + "]");
					return;
				}
				IPath outPath = jp.getOutputLocation();
				if( outPath.isPrefixOf(resource.getFullPath()) ){
					return;
				}
			} catch( Exception e ){
				System.err.println("generateCrossxSymbols Exception [" + e.getMessage() + "]");
				e.printStackTrace();
			}
			IFile file = (IFile) resource;
			
			String modelfile = EclipseUtil.resource2UriString(resource);
			String tmp = EclipseUtil.resource2FullPathnameString(file) ;
			String crossxfile = tmp.substring(0, tmp.lastIndexOf(dsl.getDslFileExtension())) +
	        CROSSX_EXTENSION;

			IPath wfPath = getWorkflowPath(dsl);
			String wfName = wfPath.toString();

			RunCrossxWorkflow wf = new RunCrossxWorkflow();
    		try {
                wf.runWorkflow(wfName, modelfile, crossxfile);
            } catch (Mod4jWorkflowException m4jwe) {
                System.err.println("[" + m4jwe.getMessage() + "]");
            }
		}
	}

    /** The path of the workflowfile for generating the crossx symbols
     * 
     * @return 
     */
    private IPath getWorkflowPath(DslExtension dsl) {
        IPath result = EclipseUtil.getPath(dsl.getDslContributor(), dsl.getDsl2crossxWorkflow());
        if( result == null ) {
            EclipseUtil.showError("Mod4j internal: cannot open crossx workflow ["+ dsl.getDsl2crossxWorkflow() + "]" +
                                  "in plugin [" + dsl.getDslContributor() + "]");
            return null;
        }
        return result;
    }

    /** The path of the workflowfile for generating the crossx symbols
     * 
     * @return 
     */
    private IPath getGeneratorPath(DslExtension dsl) {
        IPath result = EclipseUtil.getPath(dsl.getDslContributor(), dsl.getDslCodegenWorkflow());
        if( result == null ) {
            EclipseUtil.showError("Mod4j internal: cannot open code generation workflow ["+ dsl.getDslCodegenWorkflow() + "]" +
                                  "in plugin [" + dsl.getDslContributor() + "]");
            return null;
        }
        return result;
    }

	/** The path of the workflowfile for generating the code 
	 * 
	 * @return 
	 */
	private IPath getGeneratorPathFromProject(DslExtension dsl) {
		// TODO generate error message when oaw file is not available
//		IResource resource = getProject().findMember(SRC_WORKFLOW_BUSMOD_OAW);
		IResource resource = getProject().findMember(dsl.getDslCodegenWorkflow());
		if( resource == null ) {
			EclipseUtil.showWarning("Mod4j: cannot open code generation workflow ["+ dsl.getDslCodegenWorkflow() +
					                "] for project [" + getProject().getName() + "] no code is generated");
			return null;
		}
 		IPath path = resource.getLocation();
		return path;		
	}

	/** Checks whether <code>resource</code> is a Dsl file of a DSl in the extension list.
	 *  If so, return the corresponding DslExtension, if not returns  null.
	 * 
	 * @param resource
	 * @return
	 */
	private DslExtension isDslFile(IResource resource){
		if ( ! (resource instanceof IFile) ) {
			return null;
		}
		for (DslExtension dsl : dslExtensions) {
			if ( resource.getName().endsWith(dsl.getDslFileExtension())) {
				return dsl;
			}
		}
		return null;
	}
	
	public static List<DslExtension> getExtensions() {
		List<DslExtension> result = new ArrayList<DslExtension>();
		
		IExtensionRegistry reg = Platform.getExtensionRegistry();
//		IExtensionPoint[] allextensions = reg.getExtensionPoints();
//		for (int i = 0; i < allextensions.length; i++) {
//			IExtensionPoint p = allextensions[i];
//			System.err.println("Extension: "+ p.getUniqueIdentifier());
//		}
		IConfigurationElement[] extensions = reg.getConfigurationElementsFor(DSL_EXTENSION_ID);
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement element = extensions[i];
			String name = element.getAttribute("dslName");
			String metamodelPackage = element.getAttribute("dslMetamodelPackage");
			String fileExtension = element.getAttribute("dslFileExtension");
			String crossxWorkflow = element.getAttribute("dsl2crossxWorkflow");
			String contributor= element.getContributor().getName();
			
			String codegenWorkflow = element.getAttribute("dslCodegenWorkflow");
			String codegenProperties = element.getAttribute("dslCodegenProperties");

			System.err.println("DSL [" + name + "] CONTRIBUTED BY [" + contributor + "]" );

			DslExtension dsl = new DslExtension(contributor, name, metamodelPackage, 
					                            fileExtension, crossxWorkflow,
					                            codegenWorkflow, codegenProperties);
			if( dsl.validate() ){
				result.add( dsl );
			} else {
				EclipseUtil.showError("crossx extension point [is invalid");
			}
		}
		return result;
	}

}
