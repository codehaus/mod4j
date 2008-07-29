package mod4j.crossx.broker.views;

import java.util.ArrayList;

import mod4j.crossx.broker.builder.CrossxBuilder;
import mod4j.crossx.broker.repository.CrossxRepository;
import mod4j.crossx.util.eclipse.xml.JDomContentProvider;
import mod4j.crossx.util.eclipse.xml.JDomLabelProvider;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.runtime.IAdaptable;

import crossx.util.RunWorkflow;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. 
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. 
 * <p>
 */
public class CrossxView extends ViewPart {
	
	public  TreeViewer viewer;
	private Object input;
	private DrillDownAdapter drillDownAdapter;
	private Action doubleClickAction;

	class NameSorter extends ViewerSorter {
	}

	public  static CrossxView theView = null;
	
	static int i = 1;
	
	/**
	 * The constructor.
	 */
	public CrossxView() {
		theView = this;
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
//		viewer.setContentProvider(new CrossxContentProvider());
//		viewer.setLabelProvider(new CrossxLabelProvider());
		viewer.setContentProvider(new JDomContentProvider() );
		viewer.setLabelProvider(new JDomLabelProvider() );
		viewer.setSorter(new NameSorter());
		input = CrossxRepository.getAll();
		viewer.setInput(input);
//		viewer.setInput(getViewSite());
		hookDoubleClickAction();
		viewer.refresh();
		// System.err.println("CrosssxView getAll: " + CrossxRepository.getAll().getName());
		this.setPartName("crossx repository" + i);
		i++;
	}


	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Crossx View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public static void myrefresh() {
		if( Display.getCurrent() != null ) {
			theView.setPartName("crossx  "+ 1);
			i++;
			theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input, CrossxRepository.getAll());
			theView.viewer.refresh();
		} else {
			Display.getDefault().asyncExec( new Runnable() {
				public void run() {
					theView.setPartName("crossx  "+ 1);
					i++;
					theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input, CrossxRepository.getAll());
					theView.viewer.refresh();
				}
			});
		}
	}
	

}