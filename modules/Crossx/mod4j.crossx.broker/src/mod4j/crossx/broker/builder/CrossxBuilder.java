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

import java.net.URL;
import java.util.Map;

import org.eclipse.jdt.core.*;

import mod4j.crossx.broker.repository.CrossxRepository;
import mod4j.crossx.broker.views.CrossxView;

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
import org.osgi.framework.BundleContext;

import crossx.util.EclipseUtil;
import crossx.util.RunWorkflow;
import crossx.util.XmlUtil;

/** This class contains two builders, one to build the crossx symbols from a DSL model,
 *  one to generate the code from a model
 * 
 * @author jwa11799
 *
 */
public class CrossxBuilder extends IncrementalProjectBuilder {

	static boolean initialized = false;
	
	private static final String DSL_EXTENSION = "busmod";
	public  static final String SYM_EXTENSION = "busmod.xml";
	private static String bundleName = "mod4j.crossx.broker";
	private static String wfpath = "src/busmod2crossxTest.oaw";
	private static String genpath = "src/businessGenerator2.oaw";
	
	class CrossxDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
//			System.err.println("visit [" + resource.getName() + "]");
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkDSL(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				checkDSL(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class CrossxGenerateSymbolDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
//			System.err.println("visit [" + resource.getName() + "]");
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
			checkDSL(resource);
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
//		System.err.println("checkSymbols START [" + resource.getName() + "]");
		if (resource instanceof IFile && resource.getName().endsWith(SYM_EXTENSION)) {
			try {
				// Check whether the resource is inside a binary folder, if so skip it
				IJavaProject jp = JavaCore.create(getProject());
				IPath outPath = jp.getOutputLocation();
				if( outPath.isPrefixOf(resource.getFullPath()) ){
					System.err.println("checkSymbols skipping binary [" + resource.getFullPath() + "]");
					return;
				}
			} catch( Exception e ){
				System.err.println("checkSymbols Exception [" + e.getMessage() + "]");
			}
			System.err.println("checkSymbols running on [" + resource.getName() + "]");
			Document doc = XmlUtil.readXmlDocument(EclipseUtil.toFile(resource), true);
			CrossxRepository.addInfo(doc);
		} 
	}

	public static final String BUILDER_ID = "mod4j.crossx.broker.CrossxBuilder";

//	private static final String MARKER_TYPE = "mod4j.crossx.broker.xmlProblem";

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

	/** Load the Crossx symbols from all crossx files in the project.
	 * 
	 */
	private void loadCrossxInfo() {
		CrossxFindSymbolsResourceVisitor visitor = new CrossxFindSymbolsResourceVisitor();
		try {
			getProject().accept(visitor);
		} catch (Exception e) {
			System.err.println("CrossxBuilder ERROR loadCrossxInfo [" + e.getMessage() + "]");// TODO: handle exception
		}
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		System.err.println("CrossxBuilder: full build");
		try {
			getProject().accept(new CrossxSymbolGeneratorVisitor());
			getProject().accept(new CrossxCodeGeneratorVisitor());
		} catch (CoreException e) {
			System.err.println("CrossxBuilder ERROR fullBuild [" + e.getMessage() + "]");// TODO: handle exception
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
		System.err.println("CrossxBuilder: startupOnInitialize()");
		if( ! initialized ) {
			System.err.println("CrossxBuilder build called ==>  FIST TIME FIRST TIME");
			initialized = true;
			start();
		}
	}
	
    public void start() {
		System.err.println("=========================>>>>>      START");
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
			System.err.println("CrossxBuilder ERROR loadCrossxInfo [" + e.getMessage() + "]");// TODO: handle exception
		}
	}


	/** If this is a DSL model, run the workflow.
	 * 
	 * @param resource
	 */
	private void checkDSL(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(DSL_EXTENSION)) {
			try {
				// Check whether the resource is inside a binary folder, if so skip it
				IJavaProject jp = JavaCore.create(getProject());
				IPath outPath = jp.getOutputLocation();
				if( outPath.isPrefixOf(resource.getFullPath()) ){
					System.err.println("checkDSL skipping [" + resource.getFullPath() + "]");
					return;
				}
			} catch( Exception e ){
				System.err.println("checkDSL Exception [" + e.getMessage() + "]");
			}
			System.err.println("checkDSL running on [" + resource.getName() + "]");
			IFile file = (IFile) resource;
			
//			printResource(file);
			RunWorkflow wf = new RunWorkflow();
			String modelfile = "";
			URL modelURL =null;
			try {
				modelURL = file.getLocationURI().toURL();
				modelfile = Platform.asLocalURL( file.getLocationURI().toURL()).toExternalForm();
			} catch( Exception e ){
				
			}
			String xmlfile = file.getRawLocation().toOSString() + ".xml";
			String crossxmodelfile = modelfile + ".crossx";
			
//			IPath wfPath = getWorkflowPath();
//			String wfName = wfPath.toOSString();
//			wf.runWorkflow(wfName, modelfile, xmlfile, crossxmodelfile);
			
			// TRY TO GET GEBNERATOR RUNNING
			System.err.println("checkDSL generating for [" + resource.getName() + "]");
			IPath genFile = getGeneratorPath();
			String genName = genFile.toOSString();
			RunGeneratorWorkflow genWf = new RunGeneratorWorkflow();
			genWf.runWorkflow(genName, "workflow2.properties");
			System.err.println("checkDSL DONE generating for [" + resource.getName() + "]");
			
		}
	}
	
	/** If this is a DSL model, generate the crossx symbols
	 * 
	 * @param resource
	 */
	private void generateCrossxSymbols(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(DSL_EXTENSION)) {
			try {
				// Check whether the resource is inside a binary folder, if so skip it
				IJavaProject jp = JavaCore.create(getProject());
				IPath outPath = jp.getOutputLocation();
				if( outPath.isPrefixOf(resource.getFullPath()) ){
					System.err.println("generateCrossxSymbols skipping [" + resource.getFullPath() + "]");
					return;
				}
			} catch( Exception e ){
				System.err.println("generateCrossxSymbols Exception [" + e.getMessage() + "]");
			}
			System.err.println("generateCrossxSymbols running on [" + resource.getName() + "]");
			IFile file = (IFile) resource;
			
//			printResource(file);
			RunWorkflow wf = new RunWorkflow();
			String modelfile = "";
			URL modelURL =null;
			try {
				modelURL = file.getLocationURI().toURL();
				modelfile = Platform.asLocalURL( file.getLocationURI().toURL()).toExternalForm();
			} catch( Exception e ){
				
			}
			String xmlfile = file.getRawLocation().toOSString() + ".xml";
			String crossxmodelfile = modelfile + ".crossx";
			
			IPath wfPath = getWorkflowPath();
			String wfName = wfPath.toOSString();
			wf.runWorkflow(wfName, modelfile, xmlfile, crossxmodelfile);
			
			// TRY TO GET GEBNERATOR RUNNING
//			System.err.println("checkDSL generating for [" + resource.getName() + "]");
//			IPath genFile = getGeneratorPath();
//			String genName = genFile.toOSString();
//			RunGeneratorWorkflow genWf = new RunGeneratorWorkflow();
//			genWf.runWorkflow(genName, "workflow2.properties");
//			System.err.println("checkDSL DONE generating for [" + resource.getName() + "]");
			
		}
	}

	/** The path of the workflowfile for generating the crossx symbols
	 * 
	 * @return 
	 */
	private IPath getWorkflowPath() {
		return EclipseUtil.getPath(bundleName, wfpath);
	}

	/** The path of the workflowfile for generating the code 
	 * 
	 * @return 
	 */
	private IPath getGeneratorPath() {
		return EclipseUtil.getPath(bundleName, genpath);
	}

}
