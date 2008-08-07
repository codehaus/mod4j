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
package mod4j.crossx.broker.builder;

import java.io.PrintStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jdt.core.*;
import org.eclipse.ui.console.MessageConsoleStream;

import mod4j.crossx.broker.repository.CrossxRepository;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.QualifiedName;
import org.jdom.Document;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;

import crossx.util.EclipseUtil;
import crossx.util.RunCrossxWorkflow;
import crossx.util.XmlUtil;

/** This class contains two builders, one to build the crossx symbols from a DSL model,
 *  one to generate the code from a model
 * 
 * @author jwa11799
 *
 */
public class CrossxBuilder extends IncrementalProjectBuilder {

	private MessageConsoleStream console = null;
	
	private static List<DslExtension> dslExtensions = null;

	// TODO put code generator properties file somewhere else
	private static final String BUSMOD_PROPERTIES = "src/workflow/busmod.properties";
	// TODO put code generator oAW workflow file somewhere else
	private static final String SRC_WORKFLOW_BUSMOD_OAW = "src/workflow/busmod.oaw";
	private static final String XML_EXTENSION = ".xml";
	private static final String CROSSX_EXTENSION = ".crossx";
	private static boolean initialized = false;
	private static final String SYM_EXTENSION = "busmod.xml";
	public  static String bundleName = "mod4j.crossx.broker";
	
	class CrossxDeltaVisitor implements IResourceDeltaVisitor {
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
	class CrossxGenerateSymbolDeltaVisitor implements IResourceDeltaVisitor {
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

	class CrossxCodeGeneratorVisitor implements IResourceVisitor {
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
	class CrossxSymbolGeneratorVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			generateCrossxSymbols(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	class CrossxFindSymbolsResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkSymbols(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	private void checkSymbols(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(SYM_EXTENSION)) {
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
			CrossxRepository.addInfo(doc);
		} 
	}

	public static final String BUILDER_ID = "mod4j.crossx.broker.CrossxBuilder";
	final static QualifiedName CROSSX_REPOSITORY = new QualifiedName("mod4j.cxrossx.broker", "crossxrepository");
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		System.err.println("CrossxBuilder build called");
//		CrossxRepository repo = (CrossxRepository) getProject().getSessionProperty(CROSSX_REPOSITORY);
//		if( repo == null){
//			System.err.println("CrossxBuilder build called ==>  FIST TIME FIRST TIME");
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
		return null;
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		System.err.println("CrossxBuilder: full build");
		try {
			getProject().accept(new CrossxSymbolGeneratorVisitor());
			getProject().accept(new CrossxCodeGeneratorVisitor());
		} catch (CoreException e) {
			System.err.println("CrossxBuilder ERROR fullBuild [" + e.getMessage() + "]");
			// TODO: handle exception
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		System.err.println("CrossxBuilder: incremental build");
		delta.accept(new CrossxGenerateSymbolDeltaVisitor());
		delta.accept(new CrossxDeltaVisitor());
	}
	
	protected void startupOnInitialize() {
//		System.err.println("CrossxBuilder: startupOnInitialize()");
		if( ! initialized ) {
			console = EclipseUtil.findConsole("crossx.projectbuilder");
			System.setErr(new PrintStream(console));
//			System.err.println("CrossxBuilder build called ==>  FIST TIME FIRST TIME");
			initialized = true;
			start();
		}
	}
	
    public void start() {
		System.err.println("=========================>>>>>      START");
		dslExtensions = DslExtension.getExtensions();
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
		try {
			if ( !project.hasNature(CrossxNature.NATURE_ID)){
				return;
//			EclipseUtil.showMessage("Project '" + selProject.getName() + "' does not have a Mod4j Nature.");
			}
		} catch (CoreException e1) {
			System.err.println("CrossxBuilder ERROR requesting nature [" + e1.getMessage() + "]");
			e1.printStackTrace();
		} 
		CrossxFindSymbolsResourceVisitor visitor = new CrossxFindSymbolsResourceVisitor();
		try {
			project.accept(visitor);
		} catch (Exception e) {
			System.err.println("CrossxBuilder ERROR loadCrossxInfo [" + e.getMessage() + "]");
			// TODO: handle exception
			e.printStackTrace();
		}
	}


	/** If this is a DSL model, run the workflow.
	 * 
	 * @param resource
	 */
	private void generateCode(IResource resource) {
		DslExtension dsl = isModelFile(resource);
		if ( dsl != null ) {
			try {
				// Check whether the resource is inside a binary folder, if so skip it
				IJavaProject jp = JavaCore.create(getProject());
				IPath outPath = jp.getOutputLocation();
				if( outPath.isPrefixOf(resource.getFullPath()) ){
					return;
				}
			} catch( Exception e ){
				System.err.println("checkDSL Exception [" + e.getMessage() + "]");
			}
	
			// properties files
			IResource propertiesFile = getProject().findMember(BUSMOD_PROPERTIES);
			
//			System.err.println("checkDSL generating for     [" + resource.getName() + "]");
//			System.err.println("         workflow [" + propertiesFile.getRawLocation().toOSString() + "]");
			IPath genFile = getGeneratorPath();
			if( genFile == null ){
				return ;
			}
			String genName = genFile.toOSString();
			RunGeneratorWorkflow genWf = new RunGeneratorWorkflow();

	// setup the properties for the generator workflow

			// Need to double all backslahes because of an error in ANTLR
            String propertiesFilePath = propertiesFile.getRawLocation().toOSString();
            String modelFilePath     = EclipseUtil.resource2fullpath(resource);
			// error message: ERROR - 06 no viable alternative at character '\' on line 4
			String propertiesFilePathFix = StringHelpers.replaceAllSubstrings(propertiesFilePath, "\\", "\\\\");
			Map<String, String> properties = ModelHelpers.getProperties(propertiesFilePath);
			properties.put("modelFile", modelFilePath );
			properties.put("appPropFilePath", propertiesFilePathFix);
			
			// Get the relative applicationPath property and make it absolute
			String applicationPath = properties.get("applicationPath");
			String workDir = getProject().getLocation().toOSString() ;
			String newAppPath = workDir + "/" + applicationPath;
			properties.put("applicationPath", newAppPath );
			properties.put("workDir", workDir);

			System.err.println("applicationPath [" + newAppPath + "]");
			// WORKS IN GENERATOR PROJECT
			genWf.runWorkflow(genName, properties);
//			genWf.runWorkflow(genName, EclipseUtil.resource2fullpath(resource), 
//	                   propertiesFile.getRawLocation().toOSString());

			// TRU nested
//			String mainWf = EclipseUtil.getPath(bundleName, "src/mod4j/crossx/broker/builder/Aworkflow2crossx.oaw").toOSString();
//			genWf.runWorkflowNested(mainWf,  genName, EclipseUtil.resource2fullpath(resource), 
//	                   propertiesFile.getRawLocation().toOSString());
//			System.err.println("checkDSL DONE generating for [" + resource.getName() + "]");
			
		}
	}
	
	/** If this is a DSL model, generate the crossx symbols
	 * 
	 * @param resource
	 */
	private void generateCrossxSymbols(IResource resource) {
		DslExtension dsl = isModelFile(resource);
		if ( dsl != null ) {
			try {
				// Check whether the resource is inside a binary folder, if so skip it
				IJavaProject jp = JavaCore.create(getProject());
				IPath outPath = jp.getOutputLocation();
				if( outPath.isPrefixOf(resource.getFullPath()) ){
					return;
				}
			} catch( Exception e ){
				System.err.println("generateCrossxSymbols Exception [" + e.getMessage() + "]");
				e.printStackTrace();
			}
			IFile file = (IFile) resource;
			
			RunCrossxWorkflow wf = new RunCrossxWorkflow();
			String modelfile = "";
			URL modelURL =null;
			try {
				modelURL = file.getLocationURI().toURL();
				modelfile = Platform.asLocalURL( modelURL).toExternalForm();
			} catch( Exception e ){
				System.err.println("generateCrossxSymbols Exception [" + e.getMessage() + "]");
				e.printStackTrace();
			}
			String xmlfile = file.getRawLocation().toOSString() + XML_EXTENSION;
			String crossxfile = modelfile + CROSSX_EXTENSION;
			
			IPath wfPath = getWorkflowPath(dsl);
			String wfName = wfPath.toOSString();
    		wf.runWorkflow(wfName, modelfile, xmlfile, crossxfile);

			// TRY nested
//			String mainWf = EclipseUtil.getPath(bundleName, "src/mod4j/crossx/broker/builder/Aworkflow2crossx.oaw").toOSString();
//			wf.runWorkflowNested(mainWf, wfName, modelfile, xmlfile, crossxfile);
			
//			wf.runWorkflow(wfName, modelfile, crossxfile, dsl.getDslXtendModule(),dsl.getDslMetamodelPackage());
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

	/** The path of the workflowfile for generating the code 
	 * 
	 * @return 
	 */
	private IPath getGeneratorPath() {
		// TODO generate error message when oaw file is not available
		IResource resource = getProject().findMember(SRC_WORKFLOW_BUSMOD_OAW);
		if( resource == null ) {
			EclipseUtil.showWarning("Mod4j: cannot open code generation workflow ["+ SRC_WORKFLOW_BUSMOD_OAW +
					                "] for project [" + getProject().getName() + "] no code is generated");
			return null;
		}
 		IPath path = resource.getLocation();
		return path;		
	}

	private DslExtension isModelFile(IResource resource){
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
	
}
