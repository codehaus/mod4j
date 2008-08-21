package org.mod4j.dslcommon.openarchitectureware;

import java.util.HashMap;
import java.util.Map;

import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

public class RunCrossxWorkflow {

    /**
     * @param wfFile
     * @param modelfile
     * @param crossxfile
     * @throws Mod4jWorkflowException 
     */
    public void runWorkflow(String wfFile, String modelfile, String crossxfile) throws Mod4jWorkflowException {
        System.err.println("Run [" + wfFile + "] on:");
        System.err.println("    modelfile  [" + modelfile + "]");
        System.err.println("    crossxfile [" + crossxfile + "]");

        Map<String, Object> slotContents = new HashMap<String, Object>();
        Map<String, String> properties = new HashMap<String, String>();

        properties.put("modelfile", modelfile);
        properties.put("crossxfile", crossxfile);

        WorkflowRunner runner = new WorkflowRunner();
        if (!runner.run(wfFile, new NullProgressMonitor(), properties, slotContents)){
            throw new Mod4jWorkflowException("ERROR(S) detected while running crossx workflow on "
                    + properties.get("crossxfile") + "! See logging.");
        }
    }
}
