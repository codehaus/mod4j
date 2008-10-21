package org.mod4j.common.generator.admin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectTrack {
    
    private List<FileTrack> trackedFiles = new ArrayList<FileTrack>();

    private String projectPath = null;
    
    public String getProjectPath() {
        return projectPath;
    }

    private Map<String, FileTrack> tracks = new HashMap<String, FileTrack>();
    
    public ProjectTrack(String projectPath){
        tracks = new HashMap<String, FileTrack>();
        this.projectPath = projectPath;
    }
    
    private String applicationPath;
    public String getApplicationPath() {
        return applicationPath;
    }

    public void setApplicationPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }


    public FileTrack getTrack(String resource) {
        String localResource = resource;
        if( resource.startsWith("file:/")){
            localResource = resource.substring(6);
        }
        if( localResource.startsWith(projectPath)){
            localResource = localResource.substring(projectPath.length());
        }
        FileTrack result = tracks.get(localResource);
        if (result == null) {
            result = new FileTrack(localResource);
            result.setProject(this);
            tracks.put(localResource, result);
        } else {
            result.clear();
        }
        return result;
    }
    
    public Collection<FileTrack> getTracks() {
        return Collections.unmodifiableCollection(tracks.values());
    }


}
