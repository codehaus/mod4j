package org.mod4j.common.generator.admin;

import java.util.ArrayList;
import java.util.List;

public class FileTrack {

    private List<String> generatedFiles ;
    private List<String> extensionFiles ;

    private String resource;
	
    public String getResource() {
        return resource;
    }

    /** Notify the ExtensionPointtracker that 'resource'is started
     * 
     * @param resource
     */
	public FileTrack(String resource) {
	    this.resource = resource;
        generatedFiles = new ArrayList<String>();
        extensionFiles = new ArrayList<String>();
    }
	
    public void generatedFile(String filename){
        generatedFiles.add(filename);
    }

    public void extensionFile(String filename){
        extensionFiles.add(filename);
    }
	
    public List<String> getGeneratedFiles(){
        return generatedFiles;
    }
    
    public List<String> getExtensionFiles(){
        return extensionFiles;
    }
    
	public void clear() {
		generatedFiles.clear();
		extensionFiles.clear();
	}
}