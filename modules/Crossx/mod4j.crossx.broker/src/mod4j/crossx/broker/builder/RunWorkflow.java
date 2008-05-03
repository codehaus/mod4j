package mod4j.crossx.broker.builder;

import java.util.HashMap;
import java.util.Map;

import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.issues.IssuesImpl;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

public class RunWorkflow {

	/**
	 * @param args
	 */
	public void runWorkflow(String wfFile, String modelfile, String xmlfile, String crossxmodelfile) {
		System.out.println("Run ["+ wfFile + "] on:" );
		System.out.println("    modelfile  [" + modelfile + "]");
		System.out.println("    xmlfile    [" + xmlfile + "]");
		System.out.println("    crossxfile [" + crossxmodelfile + "]");
		
		Map<String, Object> slotContents = new HashMap<String, Object>();

		Map<String, String> properties = new HashMap<String, String>();
		properties.put("modelfile", modelfile);
		properties.put("xmlfile"  , xmlfile );
		properties.put("crossxmodelfile"  , crossxmodelfile);
		

//		WorkflowRunner runner = new WorkflowRunner();
//		runner.prepare(wfFile, new NullProgressMonitor(), properties);
//		Issues issues = new IssuesImpl();
//		runner.executeWorkflow(slotContents, issues);

//		System.out.println("Workflow hasErros: [" + issues.hasErrors() + "]");
//		for(Issue issue : issues.getErrors()){
//			System.err.println("WOrkflow ERROR [" + issue.getMessage() + "]");
//		}
//		for(Issue issue : issues.getWarnings()){
//			System.out.println("WOrkflow WARNING [" + issue.getMessage() + "]");
//		}
		MyWorkflowRunner runner = new MyWorkflowRunner();
		runner.run(wfFile ,
				new NullProgressMonitor(), properties, slotContents);
		System.out.println("Workflow hasErros: [" + runner.issues.hasErrors() + "]");
		for(Issue issue : runner.issues.getErrors()){
			System.err.println("WOrkflow ERROR [" + issue.getMessage() + "]");
		}
		for(Issue issue : runner.issues.getWarnings()){
			System.out.println("WOrkflow WARNING [" + issue.getMessage() + "]");
		}
	}

}
