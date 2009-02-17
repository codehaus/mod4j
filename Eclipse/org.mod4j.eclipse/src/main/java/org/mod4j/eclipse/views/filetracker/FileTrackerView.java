package org.mod4j.eclipse.views.filetracker;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;
import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.FileTracker;
import org.mod4j.common.generator.admin.GeneratedFile;
import org.mod4j.common.generator.admin.ProjectTrack;
import org.mod4j.dslcommon.generator.helpers.ProjectProperties;
import org.mod4j.eclipse.util.EclipseUtil;

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

    class NameSorter extends ViewerSorter {
    }

    public static FileTrackerView theView = null;

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
        viewer.setContentProvider(new FileTrackerContentProvider());
        viewer.setLabelProvider(new FileTrackerLabelProvider());
        viewer.setSorter(new NameSorter());
        input = FileTracker.getFileTracker();
        viewer.setInput(input);
        // viewer.setInput(getViewSite());
        hookDoubleClickAction();
        viewer.refresh();
    }

    private void hookDoubleClickAction() {
        viewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                Object elem = event.getSelection();
                if (!(elem instanceof TreeSelection)) {
                    return;
                }
                TreeSelection sel = (TreeSelection) elem;
                Object selection = sel.getFirstElement();
                if (selection instanceof FileTrack) {
                    FileTrack ft = (FileTrack) selection;
                    String name = ft.getResource();
                    name = ft.getProject().getProjectPath() + "/" + name;
                    EclipseUtil.openFile(name);
                } else if (selection instanceof ProjectTrack) {
                    ProjectTrack proj = (ProjectTrack) selection;
                    // EclipseUtil.showInformation("ProjectTrack: " + proj.getProjectPath());
                } else if (selection instanceof GeneratedFile) {
                    GeneratedFile gen = (GeneratedFile) selection;
                    String name = gen.getSourcePath();
                    name = gen.getOwner().getProject().getApplicationPath() + "/" + name;
                    EclipseUtil.openFile(name);
                } else {
                    EclipseUtil.showInformation("DoubleC;lick on unknown object: " + selection.toString());
                }
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
     * Refresh the view with the latest information.
     * 
     */
    public static void myrefresh() {
        if (theView == null) {
            return;
        }
        if (Display.getCurrent() != null) {
            theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input,
                    FileTracker.getFileTracker());
            theView.viewer.refresh();
        } else {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    theView.viewer.getContentProvider().inputChanged(theView.viewer, theView.input,
                            FileTracker.getFileTracker());
                    theView.viewer.refresh();
                }
            });
        }
    }

}