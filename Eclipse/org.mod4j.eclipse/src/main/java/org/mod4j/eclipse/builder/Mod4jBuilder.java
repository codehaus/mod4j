/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
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
import org.eclipse.core.resources.IMarker;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.console.MessageConsoleStream;
import org.mod4j.common.generator.admin.Mod4jTracker;
import org.mod4j.common.generator.admin.ProjectTrack;
import org.mod4j.crossx.broker.CrossxEnvironment;
import org.mod4j.crossx.mm.crossx.CrossxPackage;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.openarchitectureware.DslExtension;
import org.mod4j.dslcommon.openarchitectureware.Mod4jWorkflowException;
import org.mod4j.dslcommon.openarchitectureware.Mod4jWorkflowRunner;
import org.mod4j.dslcommon.openarchitectureware.OutletDirectoryCleaner;
import org.mod4j.dslcommon.openarchitectureware.RunCrossxWorkflow;
import org.mod4j.eclipse.crossx.views.CrossxView;
import org.mod4j.eclipse.util.EclipseUtil;
import org.mod4j.eclipse.views.filetracker.FileTrackerView;

/**
 * This class contains two builders, one to build the crossx symbols from a DSL model, one to generate the code from a
 * model
 * 
 * @author jwa11799
 * 
 */
public class Mod4jBuilder extends IncrementalProjectBuilder {

    private static final String MOD4J_BUILDER_CONSOLE = "mod4j.projectbuilder";

	protected MessageConsoleStream console = null;

    /**
	 * @return the console
	 */
	protected MessageConsoleStream getConsole() {
		if( console == null ){
			console = EclipseUtil.findConsole(MOD4J_BUILDER_CONSOLE);
	        System.setErr(new PrintStream(console));
	        System.setOut(new PrintStream(console));
		}
		return console;
	}

	protected static List<DslExtension> dslExtensions = null;

    public static final String BUILDER_ID = "org.mod4j.eclipse.Mod4jBuilder";

    public static final String bundleName = "org.mod4j.eclipse";

    public static final String CROSSX_EXTENSION = ".crossx";

    public static final String MODEL_DIR = "src/model";

    public static final String DSL_EXTENSION_ID = Mod4jBuilder.bundleName + ".dsl";

    private static boolean initialized = false;

    /**
     * Visitor to run the crossx symbol extractor on the model files.
     * 
     * @author "Jos Warmer"
     * 
     */
    class Mod4jDeltaVisitor implements IResourceDeltaVisitor {
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
            // return true to continue visiting children.
            return true;
        }
    }

    /**
     * Generate crossx symbol information for all visited model files.
     * 
     * @author "Jos Warmer"
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
                files.add(resource);
//                generateCrossxSymbols(resource);
                break;
            case IResourceDelta.REMOVED:
                // handle removed resource
                break;
            case IResourceDelta.CHANGED:
                // handle changed resource
                files.add(resource);
//                generateCrossxSymbols(resource);
                break;
            }
            // return true to continue visiting children.
            return true;
        }
    }

    List<IResource> files = new ArrayList<IResource>();
    /**
     * Visitor to generate code from the models
     * 
     * @author Jos Warmer
     * 
     */
    class Mod4jCodeGeneratorVisitor implements IResourceVisitor {
        public boolean visit(IResource resource) {
            generateCode(resource);
            // return true to continue visiting children.
            return true;
        }
    }

    /**
     * Visit all resources and generates the crossx symboltable
     * 
     * @author Jos Warmer
     * 
     */
    class CrossxSymbolGeneratorVisitor implements IResourceVisitor {
        public boolean visit(IResource resource) {
            files.add(resource);
//            generateCrossxSymbols(resource);
            // return true to continue visiting children.
            return true;
        }
    }

    /**
     * Visitor that reads all .crossx files to get already defined symbols
     * 
     * @author Jos Warmer
     * 
     */
    class CrossxFindSymbolsResourceVisitor implements IResourceVisitor {
        public boolean visit(IResource resource) {
            checkSymbols(resource);
            // return true to continue visiting children.
            return true;
        }
    }

    /**
     * If this is a .crossx resource, adds the contents to the CrossxBroker
     * 
     * @param resource
     *            The resource to check
     */
    private void checkSymbols(IResource resource) {
        if (resource instanceof IFile && resource.getName().endsWith(CROSSX_EXTENSION)) {
            if (!inModelDir(resource)) {
                return;
            }
            ModelInfo crossxInfo = readCrossx(resource);
            CrossxEnvironment.addModelInfo(resource.getProject().getName(), crossxInfo);

        }
    }

    public ModelInfo readCrossx(IResource resource) {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the default resource factory -- only needed for stand-alone!
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Register the package -- only needed for stand-alone!
        CrossxPackage crossxPackage = CrossxPackage.eINSTANCE;

        // Get the URI of the model file.
        // URI fileURI = URI.createFileURI(new File("mylibrary.xmi").getAbsolutePath());
        URI fileURI = URI.createFileURI(resource.getLocation().toPortableString());

        // Demand load the resource for this file.
        Resource emfResource = resourceSet.getResource(fileURI, true);
        EList<EObject> tmp = emfResource.getContents();
        if (!tmp.isEmpty()) {
            EObject first = tmp.get(0);
            return (ModelInfo) first;
        }
        return null;

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.internal.events.InternalBuilder#build(int, java.util.Map,
     * org.eclipse.core.runtime.IProgressMonitor)
     */
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException {
        if (kind == FULL_BUILD) {
            fullBuild(monitor);
        } else if (kind == CLEAN_BUILD) {
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

    /**
     * Do a full build of the project. Will run both crossx and the codegenerator
     * 
     * @param monitor
     * @throws CoreException
     */
    protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
        System.err.println("Mod4jBuilder: full build");
        cleanOutputDirectories();
        try {
            files.clear();
            getProject().accept(new CrossxSymbolGeneratorVisitor());
            generateCrossxForAllFiles(monitor);
            getProject().accept(new Mod4jCodeGeneratorVisitor());
            FileTrackerView.myrefresh();
        } catch (CoreException e) {
            System.err.println("Mod4jBuilder ERROR fullBuild [" + e.getMessage() + "]");
            // TODO: handle exception
        }
    }

    /**
     * Perform an incremental build of the project
     * 
     * @param delta
     *            The changes in the projects resources for which rebuild need to be performed
     * @param monitor
     *            The monitor
     * @throws CoreException
     *             see Eclipse documentation
     */
    protected void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) throws CoreException {
        // the visitor does the work.
        System.err.println("Mod4jBuilder: incremental build");
        files.clear();
        delta.accept(new CrossxGenerateSymbolDeltaVisitor());
        generateCrossxForAllFiles(monitor);
        delta.accept(new Mod4jDeltaVisitor());
        FileTrackerView.myrefresh();
    }

    private void generateCrossxForAllFiles(IProgressMonitor monitor) {
//        for (IResource resource : files) {
//            generateCrossxSymbols(resource);
//        }
        for (IResource resource : files) {
            if( resource.getName().endsWith(".busmod")){
                generateCrossxSymbols(resource);
            }
        }
        for (IResource resource : files) {
            if( resource.getName().endsWith(".dtcmod")){
                generateCrossxSymbols(resource);
            }
        }
        for (IResource resource : files) {
            if( resource.getName().endsWith(".sermod")){
                generateCrossxSymbols(resource);
            }
        }
        for (IResource resource : files) {
            if( resource.getName().endsWith(".pmfmod")){
                generateCrossxSymbols(resource);
            }
        }
        try {
			getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    /**
     * Initializes the infomative output console for Crossx and the code generation. Also redirect the standard error
     * output to a console.
     */
    protected void startupOnInitialize() {
        System.err.println("Mod4jBuilder.startupOnInitialize");
        if (!initialized) {
//            CrossxEnvironment.setPrintStream(getConsole());
            initialized = true;
            startX();
            CrossxEnvironment.setStarted(true);
            FileTrackerView.myrefresh();
        }
    }

    public static void initCrossx(String from) {
        System.err.println("Mod4jBuilder.initCrossx from [" + from + "]");
//        if (!CrossxEnvironment.isStarted()) {
        if (!initialized) {
     		initialized = true;
            Mod4jBuilder b = new Mod4jBuilder();
            b.startX();
            CrossxEnvironment.setStarted(true);
     		FileTrackerView.myrefresh();
        }

    }
    
    public void startX() {
    	getConsole();
    	System.err.println("Mod4jBuilder.startX()");
        CrossxEnvironment.setPrintStream(getConsole());
        dslExtensions = getExtensions();
        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
        System.err.println("Number of projects [" + projects.length + "]");
        for (int i = 0; i < projects.length; i++) {
            IProject project = projects[i];
            System.err.println("startX Projects [" + project.getName() + "]");
            // Make sure the project is open and has the Mod4j nature.
            try {
                if ((!project.isAccessible()) || (!project.hasNature(Mod4jNature.NATURE_ID)) || (!project.isOpen())) {
                } else {
                    myloadCrossxInfo(project);
                    readFileTracker(project);
                }
            } catch (CoreException e1) {
                System.err.println("Mod4jBuilder ERROR requesting nature [" + e1.getMessage() + "]");
                e1.printStackTrace();
            }
        }
        CrossxView.myrefresh();
    }
    
//    public void start() {
//    	System.err.println("Mod4jBuilder.start()");
//        dslExtensions = Mod4jBuilder.getExtensions();
//        IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
//        for (int i = 0; i < projects.length; i++) {
//            IProject project = projects[i];
//            myloadCrossxInfo(project);
//        }
//    }

    public static QualifiedName PROJECT_TRACKER = new QualifiedName("org.mod4j.eclipse", "filetracker");

	private void readFileTracker(IProject project) {
//        Mod4jTracker.getFileTracker().readTracker(project.getWorkspace().getRoot().getLocation().toString()
//				+ "/" + "mod4jgenerator.xml");
        ProjectTrack projectTrack = new ProjectTrack();
        projectTrack.readProjectTracker(project.getLocation().toString() + "/" + "mod4jproject.xml");
        Mod4jTracker.getFileTracker().addProjectTrack(projectTrack);
	}
    
    IProject currentProject = null;
    /**
     * Load the Crossx symbols from all crossx files in the project.
     * 
     */
    private void myloadCrossxInfo(IProject project) {
        // Run the visitor over the project to collect all Crossx information
        CrossxFindSymbolsResourceVisitor visitor = new CrossxFindSymbolsResourceVisitor();
        try {
            currentProject = project;
            project.accept(visitor);
            currentProject = null;
        } catch (Exception e) {
            System.err.println("Mod4jBuilder ERROR loadCrossxInfo [" + e.getMessage() + "]");
            e.printStackTrace();
        }
    }

    /**
     * Check whether a resource is inside a model directory
     * 
     * @param resource
     *            The resource to check
     * @return True if resource is inside a model directory, false otherwise.
     */
    protected boolean inModelDir(IResource resource) {
        IPath resourcePath = resource.getProjectRelativePath();
        IProject thisProject = getProject();
        if( thisProject == null ) {
        	thisProject = currentProject;
        }
        if( thisProject == null ) {
            System.err.println("found model [" + resource.getName() + "] in NO project ");
            return false;
        }
        IResource modeldir = thisProject.findMember(MODEL_DIR);
        if( modeldir == null ) {
            System.err.println("found model [" + resource.getName() + "] in project without MDOELDIR");
            return false;
        } 
        IPath modelPath = modeldir.getProjectRelativePath();
        return modelPath.isPrefixOf(resourcePath);
}

    private void cleanOutputDirectories() {
        System.err.println("START clean directories");
        for (DslExtension dsl : dslExtensions) {
            // properties files
            String propertyFilename = MODEL_DIR + "/" + dsl.getDslCodegenProperties();
            IResource propertiesFile = getProject().findMember(propertyFilename);
            if (propertiesFile == null) {
                EclipseUtil.showWarning("Mod4j: code generation properties file [" + propertyFilename
                        + "] in project [" + getProject().getName() + "] not found, cannot generate code.");
                return;
            }

            // Setup the properties for the generator workflow
            String propertiesFilePath = EclipseUtil.resource2FullPathnameString(propertiesFile);

            String workDir = getProject().getLocation().toString();
            OutletDirectoryCleaner genWf = new OutletDirectoryCleaner();
            try {
                genWf.clean(workDir, propertiesFilePath);
            } catch (Mod4jWorkflowException e) {
                System.err.println("Mod4j: workflow error while cleaning directory for project ["
                        + getProject().getName() + "]");
            }
        }
        System.err.println("END clean directories");
    }

    /**
     * If this is a DSL model, run the workflow to generate code.
     * 
     * @param resource
     */
    protected void generateCode(IResource resource) {
        DslExtension dsl = isDslFile(resource);
        if (dsl != null) {
            try {
                if (!inModelDir(resource)) {
                    return;
                }
            } catch (Exception e) {
                System.err.println("Mod4j Builder Exception in generateCode [" + e.getMessage() + "]");
                e.printStackTrace();
            }
            
            if( hasProblems(resource) ){
                return;
            }

            // properties files
            String propertyFilename = MODEL_DIR + "/" + dsl.getDslCodegenProperties();
            IResource propertiesFile = getProject().findMember(propertyFilename);
            if (propertiesFile == null) {
                EclipseUtil.showWarning("Mod4j: code generation properties file [" + propertyFilename
                        + "] in project [" + getProject().getName() + "] not found, cannot generate code.");
                return;
            }

            IPath genFile = getGeneratorPath(dsl);
            if (genFile == null) {
                return;
            }
            String genName = genFile.toString();

            // Setup the properties for the generator workflow
            String propertiesFilePath = EclipseUtil.resource2FullPathnameString(propertiesFile);
            String modelFilePath = EclipseUtil.resource2UriString(resource);

            Map<String, String> properties = ModelHelpers.getProperties(propertiesFilePath);
            properties.put("modelFile", modelFilePath);
            properties.put("appPropFilePath", propertiesFilePath);

            // Get the relative applicationPath property and make it absolute
            String applicationPath = properties.get("applicationPath");
            String workDir = getProject().getLocation().toString();
            String newAppPath ;
        	if( applicationPath.startsWith("..")){
        		int last = workDir.lastIndexOf("/");
        		newAppPath = workDir.substring(0, last) + applicationPath.substring(2) ;
        	} else {
        		newAppPath = workDir + "/" + applicationPath;
        	}
            properties.put("applicationPath", newAppPath);
            properties.put("workDir", workDir);
            properties.put("project", resource.getProject().getName());

            resource.getFullPath().toPortableString();
            // Notigy filetracker
            String projectPath = resource.getProject().getLocation().toString();
            Mod4jTracker.getFileTracker().initResource(modelFilePath, newAppPath, projectPath);

            // Run the workflow
            Mod4jWorkflowRunner genWf = new Mod4jWorkflowRunner();
            try {
                genWf.runWorkflow(genName, properties);
            } catch (Mod4jWorkflowException e) {
                System.err.println("Mod4j: workflow error while generating code for DSL Model [" + resource.getName()
                        + "] error: [" + e.getMessage() + "]");
                EclipseUtil.showError("Mod4j: workflow error while generating code for DSL Model ["
                        + resource.getName() + "] \nerror: [" + e.getMessage() + "]");
            }
            
            // Tell filetracker to close current resource and save the current project track to file.
            Mod4jTracker.getFileTracker().finishResource(modelFilePath, newAppPath, projectPath);
            Mod4jTracker.getFileTracker().getCurrentProject().writeProjectTrack(
            		getProject().getLocation().toString() + "/" + "mod4jproject.xml");

        }
    }

    /**
     * @param resource
     */
    private boolean hasProblems(IResource resource) {
        IMarker[] problems = null;
        int depth = IResource.DEPTH_ONE;
        try {
           problems = resource.findMarkers(IMarker.PROBLEM, true, depth);
           if( problems.length > 0) {
               return true;
           }
        } catch (CoreException e) {
            System.err.println("Mod4j Builder Exception in generateCode [" + e.getMessage() + "]");
            e.printStackTrace();
        }
        return false;
    }

    /**
     * If this is a DSL model, generate the crossx symbols
     * 
     * @param resource
     */
    private void generateCrossxSymbols(IResource resource) {
        DslExtension dsl = isDslFile(resource);
        if (dsl != null) {
            if (!inModelDir(resource)) {
                return;
            }
            if( hasProblems(resource) ){
                return;
            }

            String crossx = dsl.getDsl2crossxWorkflow();
            if ((crossx == null) || (crossx.length() == 0)) {
                // no crossx, stop
                return;
            }
            IFile file = (IFile) resource;

            String modelfile = EclipseUtil.resource2UriString(resource);
            String tmp = EclipseUtil.resource2FullPathnameString(file);
            String crossxfile = tmp.substring(0, tmp.lastIndexOf(dsl.getDslFileExtension())) + CROSSX_EXTENSION;

            IPath wfPath = getWorkflowPath(dsl);
            String wfName = wfPath.toString();

            RunCrossxWorkflow wf = new RunCrossxWorkflow();
            try {
                wf.runWorkflow(wfName, resource.getProject().getName(), modelfile, crossxfile, false);
            } catch (Mod4jWorkflowException m4jwe) {
                System.err.println("[" + m4jwe.getMessage() + "]");
            }
        }
    }

    /**
     * The path of the workflowfile for generating the crossx symbols
     * 
     * @return
     */
    private IPath getWorkflowPath(DslExtension dsl) {
        IPath result = EclipseUtil.getPath(dsl.getDslContributor(), dsl.getDsl2crossxWorkflow());
        if (result == null) {
            EclipseUtil.showError("Mod4j internal: cannot open crossx workflow [" + dsl.getDsl2crossxWorkflow() + "]"
                    + "in plugin [" + dsl.getDslContributor() + "]");
            return null;
        }
        return result;
    }

    /**
     * The path of the workflowfile for generating the crossx symbols
     * 
     * @return
     */
    private IPath getGeneratorPath(DslExtension dsl) {
        IPath result = EclipseUtil.getPath(dsl.getDslContributor(), dsl.getDslCodegenWorkflow());
        if (result == null) {
            EclipseUtil.showError("Mod4j internal: cannot open code generation workflow ["
                    + dsl.getDslCodegenWorkflow() + "]" + "from plugin [" + dsl.getDslContributor() + "]");
            return null;
        }
        return result;
    }

    /**
     * The path of the workflowfile for generating the code
     * 
     * @return
     */
    private IPath getGeneratorPathFromProject(DslExtension dsl) {
        // TODO generate error message when oaw file is not available
        // IResource resource = getProject().findMember(SRC_WORKFLOW_BUSMOD_OAW);
        IResource resource = getProject().findMember(dsl.getDslCodegenWorkflow());
        if (resource == null) {
            EclipseUtil.showWarning("Mod4j: cannot open code generation workflow [" + dsl.getDslCodegenWorkflow()
                    + "] for project [" + getProject().getName() + "] no code is generated");
            return null;
        }
        IPath path = resource.getLocation();
        return path;
    }

    /**
     * Checks whether <code>resource</code> is a Dsl file of a DSl in the extension list. If so, return the
     * corresponding DslExtension, if not returns null.
     * 
     * @param resource
     * @return
     */
    private DslExtension isDslFile(IResource resource) {
        if (!(resource instanceof IFile)) {
            return null;
        }
        for (DslExtension dsl : dslExtensions) {
            if (resource.getName().endsWith(dsl.getDslFileExtension())) {
                return dsl;
            }
        }
        return null;
    }

    private DslExtension getForExtension(String extension) {
        for (DslExtension dsl : dslExtensions) {
            if (extension.equals(dsl.getDslFileExtension())) {
                return dsl;
            }
        }
        return null;
    }

    public static List<DslExtension> getExtensions() {
        List<DslExtension> result = new ArrayList<DslExtension>();

        IExtensionRegistry reg = Platform.getExtensionRegistry();
        // IExtensionPoint[] allextensions = reg.getExtensionPoints();
        // for (int i = 0; i < allextensions.length; i++) {
        // IExtensionPoint p = allextensions[i];
        // System.err.println("Extension: "+ p.getUniqueIdentifier());
        // }
        IConfigurationElement[] extensions = reg.getConfigurationElementsFor(DSL_EXTENSION_ID);
        for (int i = 0; i < extensions.length; i++) {
            IConfigurationElement element = extensions[i];
            String name = element.getAttribute("dslName");
            String metamodelPackage = element.getAttribute("dslMetamodelPackage");
            String fileExtension = element.getAttribute("dslFileExtension");
            String crossxWorkflow = element.getAttribute("dsl2crossxWorkflow");
            String contributor = element.getContributor().getName();

            String codegenWorkflow = element.getAttribute("dslCodegenWorkflow");
            String codegenProperties = element.getAttribute("dslCodegenProperties");

            System.err.println("DSL [" + name + "] CONTRIBUTED BY [" + contributor + "]");

            DslExtension dsl = new DslExtension(contributor, name, metamodelPackage, fileExtension, crossxWorkflow,
                    codegenWorkflow, codegenProperties);
            if (dsl.validate()) {
                result.add(dsl);
            } else {
                EclipseUtil.showError("Mod4j: crossx extension point [is invalid");
            }
        }
        return result;
    }

}