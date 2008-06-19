package org.mod4j.businessdomain.xtext.wizards;
/*******************************************************************************
 * Copyright (c) 2007 Dennis H�bner and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare
 *******************************************************************************/

import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResourceStatus;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.ide.undo.CreateProjectOperation;
import org.eclipse.ui.ide.undo.WorkspaceUndoUtil;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.ide.StatusUtil;
import org.eclipse.ui.internal.wizards.newresource.ResourceMessages;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.StatusManager;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.XtextLog;
// import org.openarchitectureware.xtext.editor.wizards.ProjectCreator;

public abstract class Mod4jAbstractNewProjectWizard extends Wizard implements
			INewWizard {

		protected Mod4jGenericNewProjectWizardPage mainPage;
		private String langName;
		private String fileExtension;
		private String packageName;

		public String getLangName() {
			return langName;
		}

		public void setLangName(String langName) {
			this.langName = langName;
		}

		public String getFileExtension() {
			return fileExtension;
		}

		public void setFileExtension(String fileExtension) {
			this.fileExtension = fileExtension;
		}

		public String getPackageName() {
			return packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		/**
		 * Constructor for AbstractNewProjectWizard.
		 */
		public Mod4jAbstractNewProjectWizard() {
			super();
			setNeedsProgressMonitor(true);
		}

		@Override
		public void addPages() {
			super.addPages();
			mainPage = createMainPage();
			addPage(mainPage);
		}

		private Mod4jGenericNewProjectWizardPage createMainPage() {
			Mod4jGenericNewProjectWizardPage page = new Mod4jGenericNewProjectWizardPage(getLangName());
			page.setImageDescriptor(ImageDescriptor.createFromImage(getUtilities()
					.getImage("newprj_wiz.png")));
			return page;
		}
		abstract protected LanguageUtilities getUtilities();
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.jface.wizard.Wizard#performFinish()
		 */
		@Override
		public boolean performFinish() {

			try {
				new WorkspaceModifyOperation() {

					@Override
					protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException,
							InterruptedException {
						try {
//							IProject pr = mainPage.getProjectHandle();
//							pr.create(monitor);
							IProject pr = createNewProject();
							pr.open(monitor);
							String modelFileName = "model." + getFileExtension();
//							Mod4jProjectCreator.create(pr, new String[] { getDslProjectName(), getGeneratorProjectName() }, monitor);
							Mod4jProjectCreator.create(pr, new String[] { 
									"BusinessDomain.mm",
									"BusinessDomain.validation",
									"BusinessDomain.generator",
									"BusinessDomain.xtext"
							}, monitor);
							IContainer modelFolder = pr.getFolder("model");
							IContainer workflowFolder = pr.getFolder("workflow");
							Mod4jProjectCreator
									.createFile(
											modelFileName,
											modelFolder,
											sampleModelContents(),
											monitor);
							Mod4jProjectCreator
							.createFile(
									"BusinessDomainGenerator.oaw",
									workflowFolder,
									workflowContents(), 
									monitor);
							Mod4jProjectCreator
							.createFile(
									"workflow.properties",
									workflowFolder,
									propertiesContents(), 
									monitor);
						} catch (CoreException e) {
							mainPage.setErrorMessage(e.getLocalizedMessage());
						}
					}
				}.run(null);
			} catch (InvocationTargetException e) {
				XtextLog.logError(e);
				return false;
			} catch (InterruptedException e) {
				XtextLog.logError(e);
				return false;
			}
			return true;
		}
		
		private String dslProjectName;
		
		public String getDslProjectName() {
			return dslProjectName;
		}
		
		public void setDslProjectName(String dslProjectName) {
			this.dslProjectName = dslProjectName;
		}
		
		private String generatorProjectName;

		private String getGeneratorProjectName() {
			return generatorProjectName;
		}

		public void setGeneratorProjectName(String generatorProjectName) {
			this.generatorProjectName = generatorProjectName;
		}
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
		 *      org.eclipse.jface.viewers.IStructuredSelection)
		 */
		public void init(IWorkbench workbench, IStructuredSelection selection) {
			// does nothing
		}

		public String propertiesContents () {
			String LF = "\n";
			
			return "#Model properties" + LF +
					"modelFile=model.busmod" + LF +
					"outputSlot=OutputBusModel" + LF +
					"fileEncoding=ISO-8859-1" + LF +
					" " + LF +
					"# Appliation properties" + LF +
					"appPropFilePath=workflow/workflow.properties" + LF +
					"applicationName="+ mainPage.getApplicationNameFieldValue() + LF +
					"applicationVersion=1.0-SNAPSHOT" + LF +
					"applicationPath=../" + LF +
					"domainModuleName=" + mainPage.getApplicationNameFieldValue() + "-domain" + LF +
					"dataModuleName=" + mainPage.getApplicationNameFieldValue() + "-data" + LF +
					"rootPackage=" + mainPage.getPackageNameFieldValue() + LF +
					"domainRootPackage=" + mainPage.getPackageNameFieldValue() + ".domain" + LF +
					"dataRootPackage=" + mainPage.getPackageNameFieldValue() + ".data" + LF +
					"" + LF +
					"srcGenPath=target/generated-sources" + LF +
					"resourceGenPath=target/generated-resources" + LF +
					"srcManPath=src/main/java" + LF +
					"resourceManPath=src/main/resources" + LF ;
        }

		public String sampleModelContents() {
			String LF = "\n";
			
			return "Model SampleModel" + LF +
					"" + LF +
					"Class SampleClass [" + LF +
					"    string name;" + LF +
					"]" + LF;
        }

		public String workflowContents () {
			String LF = "\n";
			return "<?xml version=\"1.0\" encoding=\"windows-1252\"?>" + LF +
			"<workflow>" + LF + 

			"    <property file=\"workflow.properties\" />"+ LF + 
			"" + LF +
			"    <bean class=\"org.eclipse.mwe.emf.StandaloneSetup\"/>" + LF +
			"    <bean class=\"org.mod4j.businessdomain.xtext.MetaModelRegistration\"/>" + LF +
			"    <bean id=\"bm\" class=\"oaw.type.emf.EmfMetaModel\">" + LF +
			"        <metaModelPackage value=\"BusinessDomainDsl.BusinessDomainDslPackage\" />" + LF +  
			"	</bean>" + LF +
			"" + LF +
			"    <!--" + LF +
			"        Parse the BusinessDomain model file and validate syntax and model constraints" + LF +
			"    -->" + LF +
			"	<component id=\"BusinessDomainWorkflow-Parser\" class=\"org.mod4j.businessdomain.xtext.parser.ParserComponent\">" + LF +
			"		<modelFile value=\"${modelFile}\"/>" + LF +
			"		<outputSlot value=\"${outputSlot}\"/>" + LF +
			"	</component>" + LF +
			"    <component id=\"BusinessDomainWorkflow-XtextChecks\" class=\"org.openarchitectureware.check.CheckComponent\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <checkFile value=\"org::mod4j::businessdomain::xtext::GenChecks\" />" + LF +
			"        <emfAllChildrenSlot value=\"${outputSlot}\" />" + LF +
			"    </component>" + LF +
			"    <component id=\"BusinessDomainWorkflow-ModelChecks\" class=\"org.openarchitectureware.check.CheckComponent\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <checkFile value=\"BusinessDomainDsl::validation::BusinessModelChecks\" />" + LF +
			"        <emfAllChildrenSlot value=\"${outputSlot}\" />" + LF +
			"    </component>" + LF +
			"" + LF +
			"    <!--" + LF +
			"        Cleaning of output directories before generation." + LF +
			"   -->" + LF +
			"    <component id=\"BusinessDomainWorkflow-DirCleaner\" class=\"org.openarchitectureware.workflow.common.DirectoryCleaner\">" + LF +
			"        <directories value=\"${applicationPath}/${domainModuleName}/${srcGenPath}, ${applicationPath}/${dataModuleName}/${srcGenPath}\"/>" + LF +
			"    </component>" + LF +
			"" + LF +
			"    <!--" + LF +
			"        Generation of Domain sources and resources" + LF +
			"    -->" + LF +
			"    <component id=\"BusinessDomainWorkflow-DomainGenerator\" class=\"org.openarchitectureware.xpand2.Generator\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <expand value=\"BusinessDomain::Root('${domainRootPackage}') FOR ${outputSlot}\" />" + LF +
			"        <outlet path=\"${applicationPath}/${domainModuleName}/${srcGenPath}/\">" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.JavaBeautifier\" />" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.XmlBeautifier\" />" + LF +
			"        </outlet>" + LF +
			"        <globalVarDef name=\"appPropFilePath\" value=\"'${appPropFilePath}'\" />" + LF +
			"    </component>" + LF +
			"" + LF +
			"    <!-- " + LF +
			"        Generation of Extions Points for Domain sources" + LF +
			"    -->" + LF +
			"    <component id=\"BusinessDomainWorkflow-DomainEextensionPointsGenerator\" class=\"org.openarchitectureware.xpand2.Generator\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <expand value=\"BusinessDomain::ExtensionPointGeneration FOR ${outputSlot}\" />" + LF +
			"        <outlet path=\"${applicationPath}/${domainModuleName}/${srcManPath}/\">" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.JavaBeautifier\" />" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.XmlBeautifier\" />" + LF +
			"        </outlet>" + LF +
			"        <globalVarDef name=\"appPropFilePath\" value=\"'${appPropFilePath}'\" />" + LF +
			"    </component>" + LF +
			"" + LF +
			"    <!-- " + LF +
			"        Generation of Hibernate resources." + LF +
			"    -->  " + LF +
			"     <component id=\"BusinessDomainWorkflow-DataLayerResourcesGenerator\" class=\"org.openarchitectureware.xpand2.Generator\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <expand value=\"Datalayer::genResources FOR ${outputSlot}\" />" + LF +
			"        <outlet path=\"${applicationPath}/${dataModuleName}/${resourceGenPath}/\">" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.JavaBeautifier\" />" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.XmlBeautifier\" />" + LF +
			"        </outlet>" + LF +
			"         <globalVarDef name=\"appPropFilePath\" value=\"'${appPropFilePath}'\" />" + LF +
			"    </component>" + LF +
			"" + LF +
			"    <!-- " + LF +
			"        Generation of Dao sources." + LF +
			"    -->  " + LF +
			"    <component id=\"BusinessDomainWorkflow-DataLayerDaoGenerator\" class=\"org.openarchitectureware.xpand2.Generator\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <expand value=\"Datalayer::genDao FOR ${outputSlot}\" />" + LF +
			"        <outlet path=\"${applicationPath}/${dataModuleName}/${srcGenPath}/\">" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.JavaBeautifier\" />" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.XmlBeautifier\" />" + LF +
			"        </outlet>" + LF +
			"        <globalVarDef name=\"appPropFilePath\" value=\"'${appPropFilePath}'\" />" + LF +
			"    </component>" + LF +
			"" + LF +
			"    <!-- " + LF +
			"        Generation of Extention Points for Dao\'s." + LF +
			"    -->  " + LF +
			"    <component id=\"BusinessDomainWorkflow-DataLayerExtentionPointsGenerator\" class=\"org.openarchitectureware.xpand2.Generator\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <expand value=\"Datalayer::genDaoExtensions FOR ${outputSlot}\" />" + LF +
			"        <outlet path=\"${applicationPath}/${dataModuleName}/${srcManPath}/\">" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.JavaBeautifier\" />" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.XmlBeautifier\" />" + LF +
			"        </outlet>" + LF +
			"         <globalVarDef name=\"appPropFilePath\" value=\"'${appPropFilePath}'\" />" + LF +
			"    </component>" + LF +
			"" + LF +
			"    <!-- " + LF +
			"        Generation of Maven configuration files." + LF +
			"    -->  " + LF +
			"    <component id=\"BusinessDomainWorkflow-MavenConfigGenerator\" class=\"org.openarchitectureware.xpand2.Generator\">" + LF +
			"        <metaModel idRef=\"bm\" />" + LF +
			"        <expand value=\"BusinessDomain::CreateMavenConfiguration FOR ${outputSlot}\"/>" + LF +
			"        <outlet path=\"${applicationPath}\">" + LF +
			"            <postprocessor class=\"org.openarchitectureware.xpand2.output.XmlBeautifier\" />" + LF +
			"        </outlet>" + LF +
			"         <globalVarDef name=\"appPropFilePath\" value=\"'${appPropFilePath}'\" />" + LF +
			"    </component>" + LF +
			" " + LF +
			"</workflow>" + LF;
		}
		
		/**
		 * Creates a new project resource with the selected name.
		 * <p>
		 * In normal usage, this method is invoked after the user has pressed Finish
		 * on the wizard; the enablement of the Finish button implies that all
		 * controls on the pages currently contain valid values.
		 * </p>
		 * <p>
		 * Note that this wizard caches the new project once it has been
		 * successfully created; subsequent invocations of this method will answer
		 * the same project resource without attempting to create it again.
		 * </p>
		 * 
		 * @return the created project resource, or <code>null</code> if the
		 *         project was not created
		 */
		private IProject createNewProject() {
			IProject newProject = null;
			if (newProject != null) {
				return newProject;
			}

			// get a project handle
			final IProject newProjectHandle = mainPage.getProjectHandle();

			// get a project descriptor
			URI location = null;
			if (!mainPage.useDefaults()) {
				location = mainPage.getLocationURI();
			}

			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			final IProjectDescription description = workspace
					.newProjectDescription(newProjectHandle.getName());
			description.setLocationURI(location);

			// update the referenced project if provided
//			if (referencePage != null) {
//				IProject[] refProjects = referencePage.getReferencedProjects();
//				if (refProjects.length > 0) {
//					description.setReferencedProjects(refProjects);
//				}
//			}

			// create the new project operation
			IRunnableWithProgress op = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException {
					CreateProjectOperation op = new CreateProjectOperation(
							description, ResourceMessages.NewProject_windowTitle);
					try {
						PlatformUI.getWorkbench().getOperationSupport()
								.getOperationHistory().execute(
										op,
										monitor,
										WorkspaceUndoUtil
												.getUIInfoAdapter(getShell()));
					} catch (ExecutionException e) {
						throw new InvocationTargetException(e);
					}
				}
			};

			// run the new project creation operation
			try {
				getContainer().run(false, true, op);
			} catch (InterruptedException e) {
				return null;
			} catch (InvocationTargetException e) {
				Throwable t = e.getTargetException();
				if (t instanceof ExecutionException
						&& t.getCause() instanceof CoreException) {
					CoreException cause = (CoreException) t.getCause();
					StatusAdapter status;
					if (cause.getStatus().getCode() == IResourceStatus.CASE_VARIANT_EXISTS) {
						status = new StatusAdapter(
								StatusUtil
										.newStatus(
												IStatus.WARNING,
												NLS
														.bind(
																ResourceMessages.NewProject_caseVariantExistsError,
																newProjectHandle
																		.getName()),
												cause));
					} else {
						status = new StatusAdapter(StatusUtil.newStatus(cause
								.getStatus().getSeverity(),
								ResourceMessages.NewProject_errorMessage, cause));
					}
					status.setProperty(StatusAdapter.TITLE_PROPERTY,
							ResourceMessages.NewProject_errorMessage);
					StatusManager.getManager().handle(status, StatusManager.BLOCK);
				} else {
					StatusAdapter status = new StatusAdapter(new Status(
							IStatus.WARNING, IDEWorkbenchPlugin.IDE_WORKBENCH, 0,
							NLS.bind(ResourceMessages.NewProject_internalError, t
									.getMessage()), t));
					status.setProperty(StatusAdapter.TITLE_PROPERTY,
							ResourceMessages.NewProject_errorMessage);
					StatusManager.getManager().handle(status,
							StatusManager.LOG | StatusManager.BLOCK);
				}
				return null;
			}

			newProject = newProjectHandle;

			return newProject;
		}


	}
