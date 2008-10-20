package org.mod4j.common.generator.admin;

public class GeneratedFile {

    public GeneratedFile(String moduleName, String sourcePath, String packagePathname, FileType type, boolean extension){
        this.sourcePath = sourcePath;
        this.moduleName = moduleName;
        this.packagePathname = packagePathname;
        this.fileType = type;
        this.extensionPoint = extension;
    }

    public GeneratedFile(String sourcePath, FileType type, boolean extension){
        this.sourcePath = sourcePath;
        this.fileType = type;
        this.extensionPoint = extension;
    }

    private String moduleName;
    private String sourcePath;
    private String packagePathname;
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

    public String getPackagePathname() {
        return packagePathname;
    }

    public boolean isExtensionPoint() {
        return extensionPoint;
    }
   
}
