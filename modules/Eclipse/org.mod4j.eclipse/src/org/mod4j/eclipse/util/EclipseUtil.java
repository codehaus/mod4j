package org.mod4j.eclipse.util;

import java.io.File;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
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
	static public String resource2UriString(IResource resource) {
		System.err.println(resource.getLocationURI().toString());
		return resource.getLocationURI().toString();
	}

	/** Get the full local pathname corresponding to a resource.
	 * 
	 * @param resource
	 * @return
	 */
	static public String resource2FullPathnameString(IResource resource) {
		return resource.getLocation().toString();
	}

	
	static public void printResource(IFile file){
		System.err.println("resource getFullPath() [" + file.getFullPath() + "]");
		System.err.println("resource getLocation().toString [" + file.getLocation().toString() + "]");
		System.err.println("resource getLocationPortable() [" + file.getLocation().toPortableString() + "]");
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
            if( bundlename.equals("org.mod4j.dsl.businessdomain.generator")) {
                myPathname = "src/main/templates/"+pathname;
            }
            if( bundlename.equals("org.mod4j.dsl.datacontract.generator")) {
                myPathname = "src/main/oaw/"+pathname;
            }
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

}
