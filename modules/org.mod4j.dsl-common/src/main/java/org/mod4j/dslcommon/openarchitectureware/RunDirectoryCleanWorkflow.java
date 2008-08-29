package org.mod4j.dslcommon.openarchitectureware;

import java.util.HashMap;
import java.util.Map;

import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.io.Files;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

public class RunDirectoryCleanWorkflow {

    /** 
     * Run the clean directories workflow
     * 
     * @param workDir The absolute pathname of the workDir
     * @param propertiesFilePath The absolute pathname of the properties file
     * @throws Mod4jWorkflowException
     */
    public void runWorkflow(String workDir, String propertiesFilePath) throws Mod4jWorkflowException {
        System.err.println("Run DirectoryClean on workDir [" + workDir + "]");
        System.err.println("           propertiesFilePath [" + propertiesFilePath + "]");
   
        
        Map<String, String> properties = initializeWorkflowProperties(workDir, propertiesFilePath);

        System.err.println("Run DirectoryClean on directories ");
        System.err.println("[" + properties.get("directories") + "]");
        Map<String, Object> slotContents = new HashMap<String, Object>();
        String wfFile = Files.findFile("org/mod4j/dslcommon/workflow/DirectoryClean.oaw");
        
        WorkflowRunner runner = new WorkflowRunner();
        if (!runner.run(wfFile, new NullProgressMonitor(), properties, slotContents)) {
            throw new Mod4jWorkflowException("ERROR(S) detected while running generator workflow on "
                    + properties.get("modelFile") + "! See logging.");
        }

        System.err.println("Workflow Generator SUCCESSFUL!");
    }

    private Map<String, String> initializeWorkflowProperties(String workDir, String propertiesFilePath) {

        
        Map<String, String> result = ModelHelpers.getProperties(workDir + "/" + propertiesFilePath);

        // Get the relative applicationPath property and make it absolute
        String applicationPath = result.get("applicationPath");
        String domainModuleName = result.get("domainModuleName");
        String dataModuleName = result.get("dataModuleName");
        String srcGenPath = result.get("srcGenPath");
        String resourceGenPath = result.get("resourceGenPath");

        String newAppPath = workDir + "/" + applicationPath;

        String directories = newAppPath + "/" + dataModuleName + "/" + srcGenPath + ", " + newAppPath + "/"
                + dataModuleName + "/" + resourceGenPath + ", " + newAppPath + "/" + domainModuleName + "/"
                + srcGenPath + ", " + newAppPath + "/" + domainModuleName + "/" + resourceGenPath;

        result.put("directories", directories);
        return result;
    }

}
