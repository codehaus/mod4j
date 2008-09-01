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

    private static String MODEL_DIR = "src/model";
    
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
							String modelFileName = "SampleModel." + getFileExtension();
//							Mod4jProjectCreator.create(pr, new String[] { getDslProjectName(), getGeneratorProjectName() }, monitor);
							Mod4jProjectCreator.create(pr, new String[] { 
									"BusinessDomain.mm",
									"BusinessDomain.validation",
									"BusinessDomain.generator",
									"BusinessDomain.xtext",
									"org.mod4j.crossx.mm",
									"org.mod4j.crossx.broker",
									"org.mod4j.eclipse"
							}, monitor);
							IContainer modelFolder = pr.getFolder(MODEL_DIR + "/businessDomain");
							Mod4jProjectCreator
									.createFile(
											modelFileName,
											modelFolder,
											sampleModelContents(),
											monitor);
							Mod4jProjectCreator
							.createFile(
									"BusinessDomainDsl.properties",
									modelFolder,
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
		
//		private String dslProjectName;
//		
//		public String getDslProjectName() {
//			return dslProjectName;
//		}
//		
//		public void setDslProjectName(String dslProjectName) {
//			this.dslProjectName = dslProjectName;
//		}
		
		
		protected String getModelProjectName() {
			return mainPage.getApplicationNameFieldValue() + "-DslModels" ;
		}

//		private String generatorProjectName;
//
//		private String getGeneratorProjectName() {
//			return generatorProjectName;
//		}
//
//		public void setGeneratorProjectName(String generatorProjectName) {
//			this.generatorProjectName = generatorProjectName;
//		}
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
			
			return 	"# Application properties" + LF +
			        "fileEncoding=UTF-8" + LF +
			        "applicationName="+ mainPage.getApplicationNameFieldValue() + LF +
					"applicationVersion=1.0-SNAPSHOT" + LF +
					"applicationPath=.." + LF +
                    "dslModelsModuleName=" + getModelProjectName() + LF +
					"srcModelPath=src/model" + LF +
                    "srcGenPath=generated-sources" + LF +
                    "resourceGenPath=generated-resources" + LF +
                    "srcManPath=src/main/java" + LF +
                    "resourceManPath=src/main/resources" + LF +
					"" + LF +
					"# BusinessDomain model properties" + LF +
                    "outputSlot=OutputBusModel" + LF +
                    "domainModuleName=" + mainPage.getApplicationNameFieldValue() + "-domain" + LF +
                    "dataModuleName=" + mainPage.getApplicationNameFieldValue() + "-data" + LF +
                    "rootPackage=" + mainPage.getPackageNameFieldValue() + LF +
                    "domainRootPackage=" + mainPage.getPackageNameFieldValue() + ".domain" + LF +
                    "dataRootPackage=" + mainPage.getPackageNameFieldValue() + ".data" + LF;
        }

		public String sampleModelContents() {
			String LF = "\n";
			
			return "Model SampleModel" + LF +
					"" + LF +
					"Class SampleClass [" + LF +
					"    string name;" + LF +
					"]" + LF;
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
				String tmp = location.toASCIIString();
				tmp = tmp + "/" + getModelProjectName();
				location = URI.create(tmp);
				
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
