package org.mod4j.dslcommon.generator.helpers;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ModelHelpersTest {
    
    @Test 
    public void fileExistTest(){
        assertTrue("Empty path does not exist. ", !ModelHelpers.fileExist(""));
        assertTrue("HereIam.java does exist.", ModelHelpers.fileExist("src/test/resources/HereIam.java"));
    }

    
}
