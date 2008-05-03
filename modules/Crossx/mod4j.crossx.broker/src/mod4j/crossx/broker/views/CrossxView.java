package mod4j.crossx.broker.views;

import java.util.ArrayList;

import mod4j.crossx.broker.builder.CrossxBuilder;
import mod4j.crossx.broker.builder.RunWorkflow;
import mod4j.crossx.broker.repository.CrossxRepository;
import mod4j.crossx.util.eclipse.xml.JDomContentProvider;
import mod4j.crossx.util.eclipse.xml.JDomLabelProvider;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.runtime.IAdaptable;


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
	
	private TreeViewer viewer;
	private DrillDownAdapter drillDownAdapter;
	private Action doubleClickAction;

	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public CrossxView() {
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
		viewer.setInput(CrossxRepository.getAll());
//		viewer.setInput(getViewSite());
		hookDoubleClickAction();
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
	

}