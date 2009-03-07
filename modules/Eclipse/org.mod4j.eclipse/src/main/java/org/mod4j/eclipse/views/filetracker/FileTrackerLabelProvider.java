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
package org.mod4j.eclipse.views.filetracker;

import java.text.DateFormat;
import java.util.Map;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.mod4j.common.generator.admin.FileTrack;
import org.mod4j.common.generator.admin.Mod4jTracker;
import org.mod4j.common.generator.admin.FileType;
import org.mod4j.common.generator.admin.GeneratedFile;
import org.mod4j.common.generator.admin.ProjectTrack;
import org.mod4j.crossx.broker.CrossxLocation;
import org.mod4j.crossx.mm.crossx.LiteralSymbolProperty;
import org.mod4j.crossx.mm.crossx.ModelInfo;
import org.mod4j.crossx.mm.crossx.ReferenceSymbolProperty;
import org.mod4j.crossx.mm.crossx.Symbol;
import org.mod4j.eclipse.util.UiHelper;

/**
 * @author jos
 * 
 *         To change the template for this generated type comment go to Window&gt;Preferences&gt;Java&gt;Code
 *         Generation&gt;Code and Comments
 */
public class FileTrackerLabelProvider extends LabelProvider {

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
        if (element instanceof ProjectTrack) {
            ProjectTrack p = (ProjectTrack) element;
            return p.getProjectPath();
        } else if (element instanceof Mod4jTracker) {
            return "Generation overview";
        } else if (element instanceof FileTrack) {
            FileTrack f = (FileTrack) element;
            return f.getResource();
        } else if (element instanceof GeneratedFile) {
            GeneratedFile file = (GeneratedFile) element;
            return DateFormat.getInstance().format(file.getModifiedDate())  + 
                   " [" + file.isChanged() + "," + file.isRetained() + "] "+ file.getSourcePath();
        }
        return element.toString();
    }

    public Image getImage(Object element) {
        if (element instanceof ProjectTrack) {
            return UiHelper.projectImg;
        } else if (element instanceof Mod4jTracker) {
            return UiHelper.fileImg;
        } else if (element instanceof FileTrack) {
            FileTrack ft = (FileTrack) element;
            if (ft.getResource().endsWith(".busmod")) {
                return UiHelper.mod4jBusinessImage;
            } else if (ft.getResource().endsWith(".sermod")) {
                return UiHelper.mod4jServiceImage;
            } else if (ft.getResource().endsWith(".dtcmod")) {
                return UiHelper.mod4jDataContractImage;
            } else if (ft.getResource().endsWith(".pmfmod")) {
                return UiHelper.mod4jPresentationImage;
            } else {
                return UiHelper.mod4jImage;
            }
        } else if (element instanceof GeneratedFile) {
            GeneratedFile gen = (GeneratedFile) element;
            if (gen.getSourcePath().endsWith(".java")) {
                if (gen.isExtensionPoint()) {
                    return UiHelper.javaFileImage;
                } else {
                    return UiHelper.javaFileGenImage;
                }
            } else if (gen.getSourcePath().endsWith(".xml")) {
                if (gen.isExtensionPoint()) {
                    return UiHelper.xmlFileImage;
                } else {
                    return UiHelper.xmlFileGenImage;
                }
            }
        }
        return UiHelper.fileImg;
    }
}
