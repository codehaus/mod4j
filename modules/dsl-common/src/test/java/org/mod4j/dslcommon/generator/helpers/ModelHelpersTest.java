package org.mod4j.dslcommon.generator.helpers;

import org.junit.Test;
import org.junit.internal.runners.TestClassRunner;
import org.junit.runner.RunWith;

import junit.framework.TestCase;

@RunWith(TestClassRunner.class)
public class ModelHelpersTest extends TestCase {
    
    @Test 
    public void fileExistTest(){
        assertTrue("Empty path does not exist. ", !ModelHelpers.fileExist(""));
        assertTrue("HereIam.java does exist.", ModelHelpers.fileExist("src/test/resources/HereIam.java"));
    }

    
}
