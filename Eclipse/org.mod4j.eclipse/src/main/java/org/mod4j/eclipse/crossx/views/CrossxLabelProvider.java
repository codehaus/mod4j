/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package org.mod4j.eclipse.crossx.views;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.jdom.Attribute;
import org.jdom.Element;
import org.mod4j.crossx.broker.CrossxLocation;
import org.mod4j.crossx.mm.crossx.LiteralSymbolProperty;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.crossx.mm.crossx.SymbolProperty;
import org.mod4j.eclipse.util.UiHelper;

/**
 * @author jos
 * 
 *         To change the template for this generated type comment go to Window&gt;Preferences&gt;Java&gt;Code
 *         Generation&gt;Code and Comments
 */
public class CrossxLabelProvider extends LabelProvider {

    /*
     * (non-Javadoc)
     * 
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
            return info.getDslname() + " : " + info.getModelname(); // Set<CossxLocation>
        } else if (element instanceof Symbol) {
            Symbol sym = (Symbol) element;
            String display = sym.getName() + " : " + sym.getType();
            boolean first = true;
            if( ! sym.getProperties().isEmpty()){
                display = display + "       [";
            }
            for (SymbolProperty prop : sym.getProperties() ) {
                if( prop instanceof LiteralSymbolProperty ) {
                    LiteralSymbolProperty p = (LiteralSymbolProperty )prop;
                    if( first ){
                        first = false;
                    } else {
                        display = display + ", ";
                    }
                    display = display + p.getName() + " = " + p.getValue() ;
                } else if( prop instanceof ReferenceSymbolProperty ){
                }
            }
            if( ! sym.getProperties().isEmpty()){
                display = display + "]";
            }
            return display;
        } else if (element instanceof LiteralSymbolProperty) {
            LiteralSymbolProperty sym = (LiteralSymbolProperty) element;
            return sym.getValue() + " : " + sym.getName();
        } else if (element instanceof ReferenceSymbolProperty) {
            ReferenceSymbolProperty sym = (ReferenceSymbolProperty) element;
            return sym.getName() + " => " + sym.getType() + " : "+  sym.getModelname() + "::" + sym.getSymbolname();
        }
        return element.toString();
    }

    public Image getImage(Object element) {
        Image image = null;
        if (element instanceof Map) {
            return UiHelper.fileImg;
        } else if (element instanceof CrossxLocation) {
            return UiHelper.projectImg;
        } else if (element instanceof ModelInfo) {
            ModelInfo info = (ModelInfo) element;
            if (info.getDslname().equals("BusinessDomainDsl")) {
                return UiHelper.mod4jBusinessImage;
            } else if (info.getDslname().equals("ServiceDsl")) {
                return UiHelper.mod4jServiceImage;
            } else if (info.getDslname().equals("DataContractDsl")) {
                return UiHelper.mod4jDataContractImage;
            } else {
                return UiHelper.mod4jImage;
            }
        } else if (element instanceof Symbol) {
            return UiHelper.fileImg;
        } else if (element instanceof LiteralSymbolProperty) {
            return UiHelper.fileImg;
        } else if (element instanceof ReferenceSymbolProperty) {
            return UiHelper.fileImg;
        }
        return UiHelper.projectImg;
    }

}
