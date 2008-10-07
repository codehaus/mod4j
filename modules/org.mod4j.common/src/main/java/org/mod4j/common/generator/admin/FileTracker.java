package org.mod4j.common.generator.admin;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mod4j.dslcommon.generator.helpers.ProjectProperties;

public class FileTracker {

    static private FileTracker fileTracker = null;

    static public FileTracker getFileTracker() {
        if (fileTracker == null) {
            fileTracker = new FileTracker();
        }
        return fileTracker;
    }

    private FileTracker() {
        track = new HashMap<String, FileTrack>();
    }

    private Map<String, FileTrack> track = new HashMap<String, FileTrack>();

    private FileTrack current = null;

    /**
     * Notify the ExtensionPointtracker that 'resource'is started
     * 
     * @param resource
     */
    public void initResource(String resource) {
//        System.err.println("FileTracker resource [" + resource + "]");
        current = getTrack(resource);
    }

    private FileTrack getTrack(String resource) {
        FileTrack result = track.get(resource);
        if (result == null) {
            result = new FileTrack(resource);
            track.put(resource, result);
        } else {
            result.clear();
        }
        return result;
    }

    public Collection<FileTrack> getTracks() {
        return Collections.unmodifiableCollection(track.values());
    }

    static public String generate(String filename) {
        getFileTracker().current.generatedFile(filename);
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
        } else {
            result = moduleName + "/" + ProjectProperties.getResourceGenPath() + "/" + filename;
        }
        getFileTracker().current.generatedFile(result);
        return result;
    }

    static public String extend(String filename) {
        getFileTracker().current.extensionFile(filename);
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
        if( filename.endsWith(".java") ){
            result = moduleName + "/" + ProjectProperties.getSrcManPath() + "/" + filename;
        } else {
            result = moduleName + "/" + ProjectProperties.getResourceManPath() + "/" + filename;
        }
        getFileTracker().current.extensionFile(result);
        return result;
    }
    
    public List<String> getExtensionFiles(String resource) {
        return track.get(resource).getExtensionFiles();
    }

    public List<String> getGeneratedFiles(String resource) {
        return track.get(resource).getGeneratedFiles();
    }

    // static public void cleanAll() {
    // currentFiles = null;
    // currentResource = null;
    // track = new HashMap<String, List<String>>();
    // }
}
