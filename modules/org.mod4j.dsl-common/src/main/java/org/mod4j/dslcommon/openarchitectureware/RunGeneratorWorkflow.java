package org.mod4j.dslcommon.openarchitectureware;

import java.util.HashMap;
import java.util.Map;

import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

public class RunGeneratorWorkflow {

    /**
     * @param wfFile
     * @param properties
     * @throws Mod4jWorkflowException 
     */
    public void runWorkflow(final String wfFile, final Map<String, String> properties) throws Mod4jWorkflowException {

        System.err.println("Run Generator [" + wfFile + "] on: [" + properties.get("modelFile") + "]");
        Map<String, Object> slotContents = new HashMap<String, Object>();

        Mod4jWorkflowRunner runner = new Mod4jWorkflowRunner();
        runner.run(wfFile, new NullProgressMonitor(), properties, slotContents);

        for (Issue issue : runner.issues.getWarnings()) {
            System.err.println("Workflow Generator WARNING [" + issue.getMessage() + "]");
        }
        
        if (runner.issues.hasErrors()) {
            System.err.println("Workflow Generator ERROR(S)!");
            throw new Mod4jWorkflowException(runner.issues.getErrors());
        }

        System.err.println("Workflow Generator SUCCESFULL!");
    }
}
