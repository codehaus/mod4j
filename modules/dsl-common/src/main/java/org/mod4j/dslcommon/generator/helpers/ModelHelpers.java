package org.mod4j.dslcommon.generator.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class ModelHelpers {

    private static Properties appProps = new Properties();

    public static String getProperty(String key, String propFilePath) {

        try {
            appProps.load(new FileInputStream(propFilePath));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return appProps.getProperty(key);
    }

    public static String timestamp() {
        Date now = new Date(System.currentTimeMillis());
        return now.toString();
    }

    public static boolean fileExist(String path) {
        File f = new File(path);
        return f.exists();
    }

    /**
     * @param cls
     * @return The name of the Java class for name cls
     */
    public static String javaClassName(String cls) {
        return StringHelpers.firstCharToUpper(cls);
    }
}
