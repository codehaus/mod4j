package org.mod4j.common.generator.admin;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mod4j.dslcommon.generator.helpers.ProjectProperties;

public class FileTracker {

    static private FileTracker fileTracker = null;

//    private Map<String, FileTrack> tracks = new HashMap<String, FileTrack>();
    private Map<String, ProjectTrack> projects = null;

    public Collection<ProjectTrack> getProjects() {
        return Collections.unmodifiableCollection(projects.values());
    }

    private FileTrack    currentTrack   = null;
    private ProjectTrack currentProject = null;

    static public FileTracker getFileTracker() {
        if (fileTracker == null) {
            fileTracker = new FileTracker();
        }
        return fileTracker;
    }

    private FileTracker() {
//        tracks = new HashMap<String, FileTrack>();
        projects = new HashMap<String, ProjectTrack>();
    }

    /**
     * Notify the ExtensionPointtracker that 'resource'is started
     * 
     * @param resource
     */
    public void initResource(String resource) {
        System.err.println("FileTracker resource [" + resource + "]");
        currentProject = findProject(resource);
        currentProject.setApplicationPath(resource);
        currentTrack = currentProject.getTrack(resource);    }

    /**
     * Notify the ExtensionPointtracker that 'resource'is started
     * 
     * @param resource
     */
    public void initResource(String resource, String applicationPath, String projectPath) {
        System.err.println("FileTracker resource [" + resource + "]");
        System.err.println("FileTracker applicationPath  [" + applicationPath  + "]");
        System.err.println("FileTracker projectPath  [" + projectPath + "]");
        currentProject = findProject(projectPath);
        currentProject.setApplicationPath(applicationPath);
        currentTrack = currentProject.getTrack(resource);
    }

    private ProjectTrack findProject(String projectPath) {
        ProjectTrack result = projects.get(projectPath);
        if (result == null) {
            result = new ProjectTrack(projectPath);
            projects.put(projectPath, result);
        }
        return result;
    }

//    private FileTrack getTrack(String resource) {
//        FileTrack result = tracks.get(resource);
//        if (result == null) {
//            result = new FileTrack(resource);
//            tracks.put(resource, result);
//        } else {
//            result.clear();
//        }
//        return result;
//    }

//    public Collection<FileTrack> getTracks() {
//        return Collections.unmodifiableCollection(tracks.values());
//    }

    static public String generate(String filename) {
        getFileTracker().currentTrack.generatedFile(filename);
        return filename;
    }

    /**
     * The file 'filename' is to be generated within 'moduleName'. the name of the resulting file
     * will be returned and stored in the file tracker.
     * 
     * @param moduleName
     * @param filename
     * @return
     */
    static public String generate(String moduleName, String filename) {
        String result = null;
        if( filename.endsWith(".java") ){
            result = moduleName + "/" + ProjectProperties.getSrcGenPath() + "/" + filename;
        } else if( filename.equals("pom.xml") ){          // always in root of module
            result = moduleName + "/" + filename;
        } else {
            result = moduleName + "/" + ProjectProperties.getResourceGenPath() + "/" + filename;
        }
        getFileTracker().currentTrack.generatedFile(result);
        return result;
    }

    static public String extend(String filename) {
        getFileTracker().currentTrack.extensionFile(filename);
        return filename;
    }

    static public String fullExtendPath(String moduleName, String filename) {
        String result = moduleName + "/" + ProjectProperties.getSrcManPath() + "/" + filename;
        return ProjectProperties.getApplicationPath() + "/" + result;
    }

    static public String fullGeneratePath(String moduleName, String filename) {
        String result = moduleName + "/" + ProjectProperties.getSrcGenPath() + "/" + filename;
        return ProjectProperties.getApplicationPath() + "/" + result;
    }

    static public String extend(String moduleName, String filename) {
        String result = null;
        String prefix ;
        if( (moduleName == null) || (moduleName.length() == 0) ){
            prefix = "";
        } else {
            prefix = moduleName + "/";
        }
        if( filename.endsWith(".java") ){
            result = prefix + ProjectProperties.getSrcManPath() + "/" + filename;
        } else if( filename.equals("pom.xml") ){          // always in root of module
            result = prefix + filename;
        } else {
            result = prefix + ProjectProperties.getResourceManPath() + "/" + filename;
        }
        getFileTracker().currentTrack.extensionFile(result);
        return result;
    }
    
//    public List<String> getExtensionFiles(String resource) {
//        return tracks.get(resource).getExtensionFiles();
//    }
//
//    public List<String> getGeneratedFiles(String resource) {
//        return tracks.get(resource).getGeneratedFiles();
//    }


}
