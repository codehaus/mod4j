/*
 * Created on Jan 24, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

package org.mod4j.eclipse.util.xml;
import java.util.Iterator;

import org.eclipse.jface.viewers.LabelProvider;
import org.jdom.Attribute;
import org.jdom.Element;

/**
 * @author jos
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class JDomLabelProvider extends LabelProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object o) {
		Element elem = ((Element)o);
//		String result = "<" + elem.getName()  ;
		String result = "<" + elem.getName() + "> "  ;
		Iterator atts = elem.getAttributes().iterator();
		while( atts.hasNext() ){
			Attribute a = (Attribute)atts.next();
//			result = result + " " + a.getName() + "=\"" + a.getValue() + "\"";
			result = result + " " + a.getName() + ": [ " + a.getValue() + " ] ";
		}
//		result = result + ">";
		return result;
	}
}
