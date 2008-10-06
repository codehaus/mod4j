package org.mod4j.dslcommon.openarchitectureware;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

/**
 * @author johan
 *
 */
public class Mod4jWorkflowRunner {

    private final Log logger = LogFactory.getLog(getClass());

    /**
     * General workflow runner. 
     * 
     * @param wfFile URL-string of the workflow file to execute
     * @param properties Map containing the properties for <code>wfFile</code>.
     * @throws Mod4jWorkflowException
     */
    public void runWorkflow(final String wfFile, final Map<String, String> properties) throws Mod4jWorkflowException {

        Map<String, Object> slotContents = new HashMap<String, Object>();
        WorkflowRunner runner = new WorkflowRunner();

        logger.info("Running workflow [" + wfFile + "] with properties : \n\t [" + properties + "]");

        if (!runner.run(wfFile, new NullProgressMonitor(), properties, slotContents)) {
            logger.error("ERROR(S) detected while running workflow : [" + wfFile + "] See logging.");
            throw new Mod4jWorkflowException("ERROR(S) detected while running workflow :" + wfFile);
        }

        logger.info("===== Workflow SUCCESSFUL!=====");
    }
}
