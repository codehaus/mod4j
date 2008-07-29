package mod4j.crossx.broker.builder;

import java.util.HashMap;
import java.util.Map;

import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.issues.IssuesImpl;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

import crossx.util.MyWorkflowRunner;

public class RunGeneratorWorkflow {

	/**
	 * @param args
	 */
	public void runWorkflow(String wfFile, String propertiesFile) {
		System.err.println("Run Generator ["+ wfFile + "] on:" );

		Map<String, Object> slotContents = new HashMap<String, Object>();
		Map<String, String> properties = new HashMap<String, String>();

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
