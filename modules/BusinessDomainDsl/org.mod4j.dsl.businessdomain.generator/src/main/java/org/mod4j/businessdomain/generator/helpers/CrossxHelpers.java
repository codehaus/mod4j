package org.mod4j.businessdomain.generator.helpers;

import java.util.ArrayList;
import java.util.List;

import org.mod4j.crossx.broker.CrossxEnvironment;

public class CrossxHelpers {

    public static List<String> allBusinessClasses(String project) {
        List<String> result = new ArrayList<String>();
        List<String> tmp = CrossxEnvironment.findAll(project, "BusinessClass");
        if (tmp != null) {
            System.err.println("CROSSX HELPER FINDALL [" + tmp.toString() + "]");
            result.addAll(tmp);
        } else {
            System.err.println("CROSSX HELPER FINDALL NULL");
        }
        return result;
    }
}
