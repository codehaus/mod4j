/*
 * Created on Jan 24, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

package org.mod4j.eclipse.views.filetracker;
import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.FileTracker;
import org.mod4j.crossx.broker.CrossxLocation;
import org.mod4j.crossx.mm.crossx.LiteralSymbolProperty;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.eclipse.util.UiHelper;

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
    public Image getImage(Object element) {
        if (element instanceof FileTracker) {
            return UiHelper.projectImg;
        } else if (element instanceof FileTrack) {
             return UiHelper.mod4jImage;
        } else if (element instanceof ModelInfo) {
            ModelInfo info = (ModelInfo)element;
            if( info.getDslname().equals("BusinessDomainDsl") ){
                return UiHelper.mod4jBusinessImage;
            } else if( info.getDslname().equals("ServiceDsl") ){
                return UiHelper.mod4jServiceImage;
            } else if( info.getDslname().equals("DataContractDsl") ){
                return UiHelper.mod4jDataContractImage;
            } else {
                return UiHelper.mod4jImage; 
            }
        } else if( element instanceof String ) {
            String s = (String)element;
            if( s.endsWith(".java")) {
                return UiHelper.javaFileImage;
            } else if( s.endsWith(".xml")) {
                return UiHelper.xmlFileImage;
            }
        }
         return UiHelper.fileImg;
     }
}
