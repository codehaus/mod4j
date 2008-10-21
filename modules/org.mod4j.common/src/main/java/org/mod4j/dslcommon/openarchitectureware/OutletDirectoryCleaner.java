package org.mod4j.dslcommon.openarchitectureware;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.io.Files;

public class OutletDirectoryCleaner {

    private final Log logger = LogFactory.getLog(getClass());

    private static final String DIRCLEAN_WORKFLOW_FILE = "org/mod4j/dslcommon/workflow/DirectoryClean.oaw";

    /**
     * Clean ouput directories containing generated sources and resources.
     * 
     * @param workDir
     *            The absolute pathname of the workDir
     * @param propertiesFilePath
     *            The absolute pathname of the properties file
     * @throws Mod4jWorkflowException
     */
    public void clean(String workDir, String propertiesFilePath) throws Mod4jWorkflowException {

        Map<String, String> properties = initializeWorkflowProperties(workDir, propertiesFilePath);
        String wfFile = Files.findFile(DIRCLEAN_WORKFLOW_FILE);

        logger.info("Cleaning outlet directoeries.");
        new Mod4jWorkflowRunner().runWorkflow(wfFile, properties);
    }

    private Map<String, String> initializeWorkflowProperties(String workDir, String propertiesFilePath) {

        // Map<String, String> result = ModelHelpers.getProperties(workDir + "/" + propertiesFilePath);
        Map<String, String> result = ModelHelpers.getProperties(propertiesFilePath);
        // Get the relative applicationPath property and make it absolute
        String applicationPath = result.get("applicationPath");
        String domainModuleName = result.get("domainModuleName");
        String dataModuleName = result.get("dataModuleName");
        String srcGenPath = result.get("srcGenPath");
        String resourceGenPath = result.get("resourceGenPath");

        String srcManPath = result.get("srcManPath");
        String resourceManPath = result.get("srcManPath");
        String overwriteExtensionpoints = result.get("overwriteExtensionpoints");

        String newAppPath = workDir + "/" + applicationPath;

        String directories = newAppPath + "/" + dataModuleName + "/" + srcGenPath + ", " + newAppPath + "/"
                + dataModuleName + "/" + resourceGenPath + ", " + newAppPath + "/" + domainModuleName + "/"
                + srcGenPath + ", " + newAppPath + "/" + domainModuleName + "/" + resourceGenPath;

        if ((overwriteExtensionpoints != null) && overwriteExtensionpoints.equals("true")) {
            logger.info("cleaning extension points");
            directories = directories + ", " + newAppPath + "/" + dataModuleName + "/" + srcManPath + ", " + newAppPath
                    + "/" + dataModuleName + "/" + resourceManPath + ", " + newAppPath + "/" + domainModuleName + "/"
                    + srcManPath + ", " + newAppPath + "/" + domainModuleName + "/" + resourceManPath;
        }
        result.put("directories", directories);
        return result;
    }

}
