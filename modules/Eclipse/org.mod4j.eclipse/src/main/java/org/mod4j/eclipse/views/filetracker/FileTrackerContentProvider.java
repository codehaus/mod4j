package org.mod4j.eclipse.views.filetracker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.jdom.Element;
import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.FileTracker;
import org.mod4j.crossx.broker.CrossxLocation;
import org.mod4j.crossx.mm.crossx.LiteralSymbolProperty;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.crossx.mm.crossx.SymbolProperty;

/**
 * JDomContentProvider :
 */
public class FileTrackerContentProvider implements ITreeContentProvider {
    
    public Object[] getChildren(Object element) {
        if (element instanceof FileTracker) {
            FileTracker ft = (FileTracker) element;
            return ft.getTracks().toArray();
        } else if (element instanceof FileTrack) {
            FileTrack f = (FileTrack) element;
            List children = new ArrayList<String>();
            for (String file : f.getGeneratedFiles()) {
                children.add("Generated: " + file);
            }
            for (String file : f.getExtensionFiles()) {
                children.add("Extension: " + file);
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
