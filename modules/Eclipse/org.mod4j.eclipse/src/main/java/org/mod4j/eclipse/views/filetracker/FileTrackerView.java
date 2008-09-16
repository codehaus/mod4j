package org.mod4j.eclipse.views.filetracker;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.mod4j.common.generator.admin.FileTracker;

/**
 * This defines the view of the CrosssxRepository.
 * <p>
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model objects should be presented in the view.
 * <p>
 */
public class FileTrackerView extends ViewPart {

    public TreeViewer viewer;

    private Object input;

    private DrillDownAdapter drillDownAdapter;

    private Action doubleClickAction;

    class NameSorter extends ViewerSorter {
    }

    public static FileTrackerView theView = null;

    static int i = 1;

    /**
     * The constructor.
     */
    public FileTrackerView() {
        theView = this;
    }

    /**
     * This is a callback that will allow us to create the viewer and initialize it.
     */
    public void createPartControl(Composite parent) {
        viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
        drillDownAdapter = new DrillDownAdapter(viewer);
        // viewer.setContentProvider(new CrossxContentProvider());
        // viewer.setLabelProvider(new CrossxLabelProvider());
        viewer.setContentProvider(new FileTrackerContentProvider());
        viewer.setLabelProvider(new FileTrackerLabelProvider());
        viewer.setSorter(new NameSorter());
        input = FileTracker.getFileTracker();
        viewer.setInput(input);
        // viewer.setInput(getViewSite());
//        hookDoubleClickAction();
        viewer.refresh();
        this.setPartName("etracker repository" + i);
        i++;
    }

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                doubleClickAction.run();
            }
        });
    }

    /**
     * Passing the focus request to the viewer's control.
     */
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    /**
     * Refresh the view with the latest CrossxBroker information.
     * 
     */
    public static void myrefresh() {
        if (theView == null) {
            return;
        }
        if (Display.getCurrent() != null) {
            theView.setPartName("filetracker  " + 1);
            i++;
            theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input, FileTracker.getFileTracker());
            theView.viewer.refresh();
        } else {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    theView.setPartName("filetracker  " + 1);
                    i++;
                    theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input,
                            FileTracker.getFileTracker());
                    theView.viewer.refresh();
                }
            });
        }
    }

}