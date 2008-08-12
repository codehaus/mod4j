package org.mod4j.dslcommon.openarchitectureware;

import java.util.HashMap;
import java.util.Map;

import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;


public class RunGeneratorWorkflow {

	public void runWorkflow(String wfFile, Map<String, String> properties ) {
		System.err.println("Run Generator ["+ wfFile + "] on: [" + properties.get("modelFile") + "]" );

		Map<String, Object> slotContents = new HashMap<String, Object>();
		
		MyWorkflowRunner runner = new MyWorkflowRunner();
		runner.run(wfFile ,
				new NullProgressMonitor(), properties, slotContents);
		System.err.println("Workflow Generator hasErros: [" + runner.issues.hasErrors() + "]");
		for(Issue issue : runner.issues.getErrors()){
			System.err.println("Workflow Generator ERROR [" + issue.getMessage() + "]");
		}
		for(Issue issue : runner.issues.getWarnings()){
			System.err.println("WOrkflow Generator WARNING [" + issue.getMessage() + "]");
		}
		// System.err.println("runner.logger.toString()"+ runner.logger.toString());
	}
}
