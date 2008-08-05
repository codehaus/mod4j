package mod4j.crossx.broker.builder;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;
import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;

import crossx.util.MyWorkflowRunner;

public class RunGeneratorWorkflow {

	/** run workflow 'wfFile' on 'modelFile' with parameters defined in 'propertiesFile'.
	 * 
	 * @param wfFile  The name of the workflowfile: fulle local pathname
	 * @param modelFile The name of the modefile: URI with start file:
	 * @param propertiesFile The nameof the properties file: full local pathname
	 */
	public void runWorkflowOld(String wfFile, String modelFile, String propertiesFile) {
		System.err.println("Run Generator ["+ wfFile + "] on: [" + modelFile + "]" );
		System.err.println("    properties ["+ propertiesFile + "]" );

		// Need to double all backslahes because of an error in ANTLR
		// error message: ERROR - 06 no viable alternative at character '\' on line 4
		String newPropfile = StringHelpers.replaceAllSubstrings(propertiesFile, "\\", "\\\\");
		System.err.println("new properties ["+ newPropfile + "]" );

		Map<String, Object> slotContents = new HashMap<String, Object>();
		Map<String, String> properties = ModelHelpers.getProperties(propertiesFile);
		properties.put("modelFile", modelFile );
		properties.put("appPropFilePath", newPropfile);
		
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

	public void runWorkflowNested(String wfFile, String nestedWf, String modelFile, String propertiesFile) {
		System.err.println("Run Generator ["+ wfFile + "] on: [" + modelFile + "]" );

		Map<String, Object> slotContents = new HashMap<String, Object>();
		Map<String, String> properties = ModelHelpers.getProperties(propertiesFile);
		properties.put("modelFile", modelFile );
		properties.put("busmodfile", nestedWf);
		
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
