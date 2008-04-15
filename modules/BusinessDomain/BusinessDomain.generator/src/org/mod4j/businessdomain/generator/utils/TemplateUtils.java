package org.mod4j.businessdomain.generator.utils;

import java.io.File;
import java.util.Date;

public class TemplateUtils {

    public static String timestamp() {
        Date now = new Date(System.currentTimeMillis());
        return now.toString();
    }
    
    public static boolean fileExist(String path){
       File f = new File(path);
       return f.exists();
    }
}