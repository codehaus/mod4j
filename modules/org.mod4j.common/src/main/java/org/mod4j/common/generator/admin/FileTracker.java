package org.mod4j.common.generator.admin;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        System.err.println("        FileTracker generate [" + filename + "]");
        return filename;
    }

    static public String extend(String filename) {
        getFileTracker().current.extensionFile(filename);
//        System.err.println("        FileTracker extension [" + filename + "]");
        return filename;
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
