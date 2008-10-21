package org.mod4j.common.generator.admin;

import java.util.ArrayList;
import java.util.List;

public class FileTrack {

    private List<GeneratedFile> generatedFiles;

    private List<GeneratedFile> extensionFiles;

    private String resource;

    private ProjectTrack project;

    public ProjectTrack getProject() {
        return project;
    }

    public void setProject(ProjectTrack project) {
        this.project = project;
    }

    public String getResource() {
        return resource;
    }

    /**
     * Notify the ExtensionPointtracker that 'resource'is started
     * 
     * @param resource
     */
    public FileTrack(String resource) {
        this.resource = resource;
        generatedFiles = new ArrayList<GeneratedFile>();
        extensionFiles = new ArrayList<GeneratedFile>();
    }

    public void generatedFile(String filename) {
        GeneratedFile gen = new GeneratedFile(filename, FileType.UNKNOWN, this, false);
        generatedFiles.add(gen);
    }

    public void extensionFile(String filename) {
        GeneratedFile gen = new GeneratedFile(filename, FileType.UNKNOWN, this, true);
        extensionFiles.add(gen);
    }

    public List<GeneratedFile> getGeneratedFiles() {
        return generatedFiles;
    }

    public List<GeneratedFile> getExtensionFiles() {
        return extensionFiles;
    }

    public void clear() {
        generatedFiles.clear();
        extensionFiles.clear();
    }
}