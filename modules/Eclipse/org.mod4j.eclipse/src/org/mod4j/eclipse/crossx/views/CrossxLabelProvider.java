/*
 * Created on Jan 24, 2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */

package org.mod4j.eclipse.crossx.views;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;
import org.jdom.Attribute;
import org.jdom.Element;
import org.mod4j.crossx.broker.CrossxLocation;
import org.mod4j.crossx.mm.crossx.LiteralSymbolProperty;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.crossx.mm.crossx.SymbolProperty;

/**
 * @author jos
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class CrossxLabelProvider extends LabelProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
	 */
	public String getText(Object element) {
        if (element instanceof Map) {
            return "Map";
        } else if (element instanceof CrossxLocation) {
            CrossxLocation loc = (CrossxLocation) element;
            return "Project: " + loc.getName();
        } else if (element instanceof ModelInfo) {
            ModelInfo info = (ModelInfo) element;
            return info.getName(); // Set<CossxLocation>
        } else if (element instanceof Symbol) {
            Symbol sym = (Symbol) element;
            return sym.getName() + " : "+ sym.getType();
        } else if (element instanceof LiteralSymbolProperty) {
            LiteralSymbolProperty sym = (LiteralSymbolProperty) element;
            return sym.getValue() + " : " + sym.getName();
        } else if (element instanceof ReferenceSymbolProperty) {
            ReferenceSymbolProperty sym = (ReferenceSymbolProperty) element;
            return "Reference to " + sym.getName() + " : " + sym.getReferredType();
        }
        return element.toString();

	}
}
