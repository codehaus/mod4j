package org.mod4j.dsl.presentation.generator.java;

import org.mod4j.common.generator.admin.Mod4jTracker;

public class FileTracker {
	
	private FileTracker(){}
	
    /**
     * The file 'filename' is to be generated within 'moduleName'. the name of the resulting file will be returned and
     * stored in the file tracker.
     * 
     * @param moduleName
     * @param filename
     * @return
     */
    static public String generate(String moduleName, String filename) {
        if (filename.endsWith(".xhtml")) {
        	return Mod4jTracker.generate(moduleName, "WebContent/" + filename);
        } 
        else {
        	return Mod4jTracker.generate(moduleName, filename);
        }
    }
}
