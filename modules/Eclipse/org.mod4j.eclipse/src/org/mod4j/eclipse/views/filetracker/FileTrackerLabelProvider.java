/*
 * Created on Jan 24, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

package org.mod4j.eclipse.views.filetracker;
import org.eclipse.jface.viewers.LabelProvider;
import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.FileTracker;

/**
 * @author jos
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class FileTrackerLabelProvider extends LabelProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
        if (element instanceof FileTracker) {
            return "Generation overview";
        } else if (element instanceof FileTrack) {
            FileTrack f = (FileTrack) element;
            return "Model: " + f.getResource();
        } else if (element instanceof String) {
            String file = (String) element;
            return file;
        }
        return element.toString();

	}
}
