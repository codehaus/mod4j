package org.mod4j.dslcommon.io;

import java.net.URL;

public class Files {
    
    public static String findFile(String filename) {
        Files f = new Files();
        return f.getDir(filename);
    }
    
    public String getDir(String filename){
        ClassLoader cls = this.getClass().getClassLoader();
        URL url = cls.getResource(filename);
        if (url == null) {
            System.err.println("DirectoryClean oaW file [" + filename + "] not found");
            return null;
        }
        filename = url.toString();
        return filename;
    }
}
