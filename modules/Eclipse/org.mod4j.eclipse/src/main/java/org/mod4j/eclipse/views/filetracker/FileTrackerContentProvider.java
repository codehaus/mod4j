package org.mod4j.eclipse.views.filetracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.FileTracker;
import org.mod4j.common.generator.admin.GeneratedFile;
import org.mod4j.common.generator.admin.ProjectTrack;

/**
 * JDomContentProvider :
 */
public class FileTrackerContentProvider implements ITreeContentProvider {

    public Object[] getChildren(Object element) {
        if (element instanceof ProjectTrack) {
            ProjectTrack ft = (ProjectTrack) element;
            return ft.getTracks().toArray();
        } else if (element instanceof FileTracker) {
            FileTracker ft = (FileTracker) element;
            return ft.getProjects().toArray();
        } else if (element instanceof FileTrack) {
            FileTrack f = (FileTrack) element;
            List<GeneratedFile> children = new ArrayList<GeneratedFile>();
            for (GeneratedFile file : f.getGeneratedFiles()) {
                children.add(file);
            }
            for (GeneratedFile file : f.getExtensionFiles()) {
                children.add(file);
            }
            return children.toArray();
        }
        return new Object[0];
    }

    public Object[] getElements(Object element) {
        return getChildren(element);
    }

    public boolean hasChildren(Object element) {
        return getChildren(element).length > 0;
    }

    public Object getParent(Object element) {
        return null;
    }

    public void dispose() {
    }

    public void inputChanged(Viewer viewer, Object old_input, Object new_input) {
        viewer.refresh();
    }
}
