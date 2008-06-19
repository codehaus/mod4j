package org.mod4j.businessdomain.generator.utils;

import org.junit.Test;
import org.junit.internal.runners.TestClassRunner;
import org.junit.runner.RunWith;

import junit.framework.TestCase;

@RunWith(TestClassRunner.class)
public class TemlateUtilsTest extends TestCase {
    
    @Test 
    public void fileExistTest(){
        assertTrue("Empty path does not exist. ", !TemplateUtils.fileExist(""));
        assertTrue("HereIam.java does exist.", TemplateUtils.fileExist("src/test/resources/HereIam.java"));
    }

    
}
