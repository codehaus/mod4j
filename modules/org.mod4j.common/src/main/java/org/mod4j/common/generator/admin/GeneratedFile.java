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
package org.mod4j.common.generator.admin;

public class GeneratedFile {

    // public GeneratedFile(String moduleName, String sourcePath, String packagePathname, FileType type, boolean
    // extension){
    // this.sourcePath = sourcePath;
    // this.moduleName = moduleName;
    // this.packagePathname = packagePathname;
    // this.fileType = type;
    // this.extensionPoint = extension;
    // }

    public GeneratedFile(String sourcePath, FileType type, FileTrack owner, boolean extension) {
        this.owner = owner;
        this.sourcePath = sourcePath;
        this.fileType = type;
        this.extensionPoint = extension;
    }

    private FileTrack owner;

    public FileTrack getOwner() {
        return owner;
    }

    private String moduleName;

    private String sourcePath;

    // private String packagePathname;
    private boolean extensionPoint;

    private FileType fileType = FileType.UNKNOWN;

    public FileType getFileType() {
        return fileType;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    // public String getPackagePathname() {
    // return packagePathname;
    // }

    public boolean isExtensionPoint() {
        return extensionPoint;
    }

}
