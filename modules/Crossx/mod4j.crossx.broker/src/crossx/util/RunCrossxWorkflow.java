package crossx.util;

import java.util.HashMap;
import java.util.Map;


import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.issues.IssuesImpl;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

public class RunCrossxWorkflow {

	/**
	 * @param args
	 */
	public void runWorkflow(String wfFile, String modelfile, String xmlfile, String crossxfile) {
		System.err.println("Run ["+ wfFile + "] on:" );
		System.err.println("    modelfile  [" + modelfile + "]");
		System.err.println("    crossxfile [" + crossxfile + "]");

		Map<String, Object> slotContents = new HashMap<String, Object>();
		Map<String, String> properties = new HashMap<String, String>();

		properties.put("modelfile", modelfile);
		properties.put("xmlfile"  , xmlfile );
		properties.put("crossxfile"  , crossxfile);

		MyWorkflowRunner runner = new MyWorkflowRunner();
		runner.run(wfFile ,
				new NullProgressMonitor(), properties, slotContents);
		System.err.println("Workflow hasErros: [" + runner.issues.hasErrors() + "]");
		for(Issue issue : runner.issues.getErrors()){
			System.err.println("WOrkflow ERROR [" + issue.getMessage() + "]");
		}
		for(Issue issue : runner.issues.getWarnings()){
			System.err.println("WOrkflow WARNING [" + issue.getMessage() + "]");
		}
		// System.err.println("runner.logger.toString()"+ runner.logger.toString());
	}

	public void runWorkflow(String wfFile, String modelfile, String crossxfile,
            String dslXtendModule, String metaModelPackage) {
		System.err.println("Run ["+ wfFile + "] on:" );
		System.err.println("    modelfile  [" + modelfile + "]");
		System.err.println("    crossxfile [" + crossxfile + "]");
		
		Map<String, Object> slotContents = new HashMap<String, Object>();
		Map<String, String> properties = new HashMap<String, String>();
		
		properties.put("modelfile", modelfile);
		//properties.put("xmlfile"  , xmlfile );
		properties.put("crossxfile"  , crossxfile);
		properties.put("dslXtendModule", dslXtendModule);
		properties.put("metaModelPackage", metaModelPackage);
		
		
		//WorkflowRunner runner = new WorkflowRunner();
		//runner.prepare(wfFile, new NullProgressMonitor(), properties);
		//Issues issues = new IssuesImpl();
		//runner.executeWorkflow(slotContents, issues);
		
		MyWorkflowRunner runner = new MyWorkflowRunner();
		runner.run(wfFile ,
		new NullProgressMonitor(), properties, slotContents);
		System.err.println("Workflow hasErros: [" + runner.issues.hasErrors() + "]");
		for(Issue issue : runner.issues.getErrors()){
		System.err.println("WOrkflow ERROR [" + issue.getMessage() + "]");
		}
		for(Issue issue : runner.issues.getWarnings()){
		System.err.println("WOrkflow WARNING [" + issue.getMessage() + "]");
		}
		// System.err.println("runner.logger.toString()"+ runner.logger.toString());
	}

}
