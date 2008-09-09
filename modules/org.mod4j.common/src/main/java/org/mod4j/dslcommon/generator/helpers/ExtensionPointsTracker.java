package org.mod4j.dslcommon.generator.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtensionPointsTracker {

	static private Map<String, List<String>> track = new HashMap<String, List<String>>();
	static private String currentResource;
	static private List<String> currentFiles ;
	
	static public void initResource(String resource) {
		System.err.println("ExtensionPointsTracker resource[" + resource + "]");
		currentResource = resource;
		currentFiles = new ArrayList<String>();
		track.put(resource, currentFiles);
	}
	
	static public void file(String filename){
		currentFiles.add(filename);
		System.err.println("        ExtensionPointsTracker [" + filename + "]");
	}
	
	static public List<String> getFiles(String resource){
		return track.get(resource);
	}
	
	static public void cleanAll() {
		currentFiles = null;
		currentResource = null;
		track = new HashMap<String, List<String>>();
	}
}
