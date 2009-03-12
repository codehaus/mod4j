package org.mod4j.dsl.presentation.generator.java;

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
        String result = null;
        if (filename.endsWith(".xhtml")) {
            result = moduleName + "/WebContent/" + filename;
        } 
        if (result != null) {
        	org.mod4j.common.generator.admin.FileTracker.generatedFile(result);
        	return result;
        }
        else {
        	return org.mod4j.common.generator.admin.FileTracker.generate(moduleName, filename);
        }
    }
}
