package crossx.util;

import java.io.File;
import java.net.URL;

import mod4j.crossx.broker.builder.CrossxNature;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.osgi.framework.Bundle;

public class EclipseUtil {

	/** Return a java.io.File correcponsing to a resource
	 * 
	 * @param resource The resource
	 * @return
	 */
	static public File toFile(IResource resource) {
		if( (resource == null) 
            || (! (resource instanceof IFile)))
//            ||  ! resource.exists() )
		{
			return null;
		}
		IFile file = (IFile) resource;
		IPath p = file.getRawLocation();
		File f = p.toFile();
		return f;
	}
	
	/** Get the full local pathname corresponding to a resource.
	 * 
	 * @param resource
	 * @return
	 */
	static public String resource2fullpath(IResource resource) {
		System.err.println(resource.getLocationURI().toString());
		return resource.getLocationURI().toString();
	}

	
	static public void printResource(IFile file){
		System.err.println("resource getFullPath() [" + file.getFullPath() + "]");
		System.err.println("resource getLocation() [" + file.getLocation() + "]");
		System.err.println("resource getLocationURI() [" + file.getLocationURI() + "]");
		System.err.println("resource getRawLocation() [" + file.getRawLocation() + "]");
		System.err.println("resource getRawLocationURI()[" + file.getRawLocationURI()+ "]");
		System.err.println("resource getWorkspace()[" + file.getWorkspace() + "]");
		System.err.println("resource getProjectRelativePath()  [" + file.getProjectRelativePath() + "]");
		System.err.println("resource getProject() [" + file.getProject() + "]");
	}
	
	/** return the Ipath for a resource named 'pathname'in bundle 'bundlename'.
	 * 
	 * @param bundlename
	 * @param pathname path, relative to the bundle root.
	 * @return
	 */
	static public IPath getPath(String bundlename, String pathname) {
		String myPathname = null;
		if( Platform.inDevelopmentMode() ){ 
			myPathname = "src/main/templates/"+pathname;
		} else {
			myPathname = pathname;
		}
		System.err.println("EclipseUtil.getPath(" + bundlename + ", " + myPathname + ")");
		IPath result = null;
		try {
			System.err.println("dev mode : "+ Platform.inDevelopmentMode());
						
			
			URL installURL = Platform.getBundle(bundlename).getEntry("/" + myPathname);
			System.err.println("installURL [" + installURL.toString() + "]");
			
			URL fromLocation = FileLocator.toFileURL(installURL);
			System.err.println("fromLocation [" + fromLocation.toString() + "]");

			result = new Path(fromLocation.getPath());
		} catch(Exception e){
			System.err.println("EclipseUtils.getPath [" + e.getMessage() + "]");
			e.printStackTrace(System.err);
			return null;
	// OctopusCodegenPlugin.getDefault().logError(this.getClass().getName(), e);
		}
		return result;
	}
	/** return the Ipath for a resource named 'pathname'in bundle 'bundlename'.
	 * 
	 * @param bundlename
	 * @param pathname path, relative to the bundle root.
	 * @return
	 */
	static public IPath agetPath(String bundlename, String pathname) {
		System.err.println("EclipseUtil.getPath(" + bundlename + ", " + pathname + ")");
		IPath result = null;
		try {
			URL installURL = Platform.getBundle(bundlename).getEntry("/");
			System.err.println("installURL [" + installURL.toString() + "]");
			URL fromLocation = new URL(installURL, pathname);
			System.err.println("fromLocation [" + fromLocation.toString() + "]");
			fromLocation = FileLocator.resolve(fromLocation);
			System.err.println("fromLocation [" + fromLocation.toString() + "]");
			fromLocation = Platform.resolve(fromLocation);
			result = new Path(fromLocation.getPath());
		} catch(Exception e){
			System.err.println("EclipseUtils.getPath [" + e.getMessage() + "]");
			e.printStackTrace(System.err);
	// OctopusCodegenPlugin.getDefault().logError(this.getClass().getName(), e);
		}
		return result;
	}

	/** Log an error to the Log connected with the plugin 'bundleName'
	 * @param className
	 * @param exception
	 */
	static public void logError(String bundlename, String className, Exception exception) {
		Bundle bundle = Platform.getBundle(bundlename);
		Platform.getLog(bundle).log(
				new Status(IStatus.ERROR,
						bundle.getSymbolicName(),
						IStatus.ERROR,
						"Error detected in class: " + className,
						exception));
		showError("Fatal error occurred (" + exception.getMessage() + "), see Error Log.");
	}
	
	/** Displays a message dialog with message <code>mess</code>.
	 * It synchronizes the execution of the message dialog with the
	 * current display, in order to prevent thread errors.
	 * 
	 * @param mess
	 */
	static public void showError(String mess) {
		final String myMessage = mess;
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				MessageDialog.openError(null, "Mod4j message", myMessage); 
			}
		});
	}

	/** Displays a message dialog with message <code>mess</code>.
	 * It synchronizes the execution of the message dialog with the
	 * current display, in order to prevent thread errors.
	 * 
	 * @param mess
	 */
	static public void showInformation(String mess) {
		final String myMessage = mess;
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				MessageDialog.openInformation(null, "Mod4j message", myMessage); 
			}
		});
	}
	/** Displays a message dialog with message <code>mess</code>.
	 * It synchronizes the execution of the message dialog with the
	 * current display, in order to prevent thread errors.
	 * 
	 * @param mess
	 */
	static public void showWarning(String mess) {
		final String myMessage = mess;
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				MessageDialog.openWarning(null, "Mod4j message", myMessage); 
			}
		});
	}

	/** Show a question in a modal dialog box and return the user's answer.
	 * 
	 * @param title Text for the title bar of the dialog window
	 * @param message The text of the message
	 * @return true if users selects ok, false if he selected Cancel
	 */
	static public boolean showQuestion(String title, String message) {
		boolean goThrough;
		final MessageDialog dialog = new MessageDialog(
					null,
					title, 
					null,	// accept the default window icon
					message, 
					//TODO error in SWT cannot find WARNING icon
					MessageDialog.NONE, 
					new String[] {IDialogConstants.OK_LABEL, IDialogConstants.CANCEL_LABEL}, 
					0); 	// ok is the default
				
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				dialog.open();
			}
		});
		if (dialog.getReturnCode() == Window.OK) {
			goThrough = true;
		} else { 
			goThrough = false;
		}
		return goThrough;
	}

	/** Find the OutputStream connected with the Eclipse Console View.
	 * 
	 * @param name
	 * @return
	 */
	static public MessageConsoleStream findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		MessageConsole myConsole = null;
		for (int i = 0; i < existing.length; i++) {
		    if (name.equals(existing[i].getName())) {
		        myConsole = (MessageConsole) existing[i];
		    }
		}
		//no console found, so create a new one
		if( myConsole == null ){
		    myConsole = new MessageConsole(name, null);
		}
		conMan.addConsoles(new IConsole[]{myConsole});
		   
		MessageConsoleStream out = myConsole.newMessageStream();
		out.println("Opening console " + name + " ...");
		    
		return out;
	}
	
	/** Find the project of the 'currentSelection'
	 * 
	 * @param currentSelection
	 * @return
	 */
	static public IProject findSelectedProject(IStructuredSelection currentSelection) {
		IResource selResource = null;
		IProject selProject = null;
		if (currentSelection == null) {
			EclipseUtil.showError("No project selected.");
			return null;
		} 
		if (currentSelection.getFirstElement() instanceof IFile ) {
			selResource = (IResource) currentSelection.getFirstElement();
			selProject = selResource.getProject();
		} else if (currentSelection.getFirstElement() instanceof IFolder ) {
			selResource = (IResource) currentSelection.getFirstElement();
			selProject = selResource.getProject();
		} else if (currentSelection.getFirstElement() instanceof IProject ) {
			selProject = (IProject) currentSelection.getFirstElement();
		// now try the Java variants
		} else {
			EclipseUtil.showError("Cannot find selected project.");
			return null; 
		}
		try {
			if (selProject != null && !selProject.isOpen()) {
				EclipseUtil.showError("Project '" + selProject.getName() + "' is not open.");
				selProject = null;
			}
			if (selProject != null && !selProject.hasNature(CrossxNature.NATURE_ID)){
				EclipseUtil.showError("Project '" + selProject.getName() + "' does not have an Octopus Nature.");
				selProject = null;
			}
		} catch (CoreException e) {
			EclipseUtil.logError("UiHelper", "EMPTY", e);
			e.printStackTrace();
		} 
		return selProject;
	}

	/** Find the resource of çurrentSelection'
	 * 
	 * @param currentSelection
	 * @return
	 */
	static public IResource findSelectedResource(IStructuredSelection currentSelection) {
		IResource selResource = null;
		if (currentSelection == null) {
			EclipseUtil.showError("No project selected.");
			return null;
		} 
		if (currentSelection.getFirstElement() instanceof IFile ) {
			selResource = (IResource) currentSelection.getFirstElement();
		} else if (currentSelection.getFirstElement() instanceof IFolder ) {
			selResource = (IResource) currentSelection.getFirstElement();
		} else if (currentSelection.getFirstElement() instanceof IProject ) {
			selResource = (IProject) currentSelection.getFirstElement();
		} else {
			EclipseUtil.showError("Cannot find selected project.");
			return null; 
		}
		return selResource;
	}

}
