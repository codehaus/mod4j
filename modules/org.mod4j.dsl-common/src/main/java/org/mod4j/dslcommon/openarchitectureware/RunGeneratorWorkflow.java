package org.mod4j.dslcommon.openarchitectureware;

import java.util.HashMap;
import java.util.Map;

import org.openarchitectureware.workflow.WorkflowRunner;
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

        WorkflowRunner runner = new WorkflowRunner();
        if (!runner.run(wfFile, new NullProgressMonitor(), properties, slotContents)) {
            throw new Mod4jWorkflowException("ERROR(S) detected while running generator workflow on "
                    + properties.get("modelFile") + "! See logging.");
        }

        System.err.println("Workflow Generator SUCCESFULL!");
    }
}
