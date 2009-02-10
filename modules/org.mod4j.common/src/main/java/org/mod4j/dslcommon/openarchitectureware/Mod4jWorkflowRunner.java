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
     * General Mod4j workflow runner. 
     * 
     * @param wfFile
     *            absolute path string of the workflow file to execute
     * @param properties
     *            Map containing the properties for <code>wfFile</code>.
     * @throws Mod4jWorkflowException
     */
    public void runWorkflow(final String wfFile, final Map<String, String> properties) throws Mod4jWorkflowException {

        Map<String, Object> slotContents = new HashMap<String, Object>();
        WorkflowRunner runner = new WorkflowRunner();

        String propertiesListing = "";
        for (Map.Entry<String, String> prop: properties.entrySet()) {
            propertiesListing += "\t\t" + prop.toString() + "\n";
        } 

        logger.info("Running workflow [" + wfFile + "] with properties : \n" + propertiesListing); 

        if (!runner.run(wfFile, new NullProgressMonitor(), properties, slotContents)) {
            logger.error("--------------------------------------------------------------------------------------");
            logger.error("------- ERROR(S) detected while running workflow : [" + wfFile + "] ");
            logger.error("------- See logging above for more details.");
            logger.error("--------------------------------------------------------------------------------------");
            throw new Mod4jWorkflowException("ERROR(S) detected while running workflow :" + wfFile);
        }
        logger.info("--------------------------------------------------------------------------");
        logger.info("-------- Workflow SUCCESSFUL! ");
        logger.info("--------------------------------------------------------------------------");
    }
}
