package org.mod4j.dslcommon.openarchitectureware;

import java.io.File;
import java.util.Map;

import org.mod4j.dslcommon.generator.helpers.ModelHelpers;
import org.mod4j.dslcommon.generator.helpers.StringHelpers;
import org.mod4j.dslcommon.io.IDirectoryVisitor;

/**
 * @author jos
 */
public class CodegenDirectoryVisitor implements IDirectoryVisitor {
	
	private DslExtension dsl = null;
	
	public CodegenDirectoryVisitor(DslExtension dsl, String theWorkDir){
		this.dsl = dsl;
		workDir = theWorkDir;
		setupDsl();
	}

	/* (non-Javadoc)
	 * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitDirectoryBefore(java.io.File)
	 */
	public Object visitDirectoryBefore(File directory) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitDirectoryAfter(java.io.File)
	 */
	public Object visitDirectoryAfter(File directory) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.mod4j.dslcommon.io.IDirectoryVisitor#visitFile(java.io.File)
	 */
	public Object visitFile(File file) throws Mod4jWorkflowException {
		if( file.isFile() && file.getName().endsWith(dsl.getDslFileExtension()) )
		{
			generateCode(file);
		}
		return null;
	}
		
	private String workDir = "";
	private String propertiesFile = null;
	private String genName = null;
	private Map<String, String> properties = null;
	
	private void setupDsl() {
		propertiesFile =workDir + "/" + dsl.getDslCodegenProperties();
		if( propertiesFile == null ){
			System.err.println("Mod4j: code generation properties file ["+ dsl.getDslCodegenProperties() +
	                "] not found, cannot generate code.");
		}
		genName = workDir + "/" + dsl.getDslCodegenWorkflow();

		properties = ModelHelpers.getProperties(propertiesFile);

		properties.put("appPropFilePath", propertiesFile);
		
		// Get the relative applicationPath property and make it absolute
		String applicationPath = properties.get("applicationPath");
		String newAppPath = workDir + "/" + applicationPath;
		properties.put("applicationPath", newAppPath );
		properties.put("workDir", workDir);

	}
	
	/**
	 * @param file
	 * @throws Mod4jWorkflowException
	 */
	private void generateCode(final File file) throws Mod4jWorkflowException {
	
		String modelfile = file.getAbsolutePath();
		modelfile = StringHelpers.replaceAllSubstrings(modelfile, "\\", "/");
		modelfile = "file:/"+ modelfile;

        properties.put("modelFile", modelfile);

		RunGeneratorWorkflow genWf = new RunGeneratorWorkflow();
		genWf.runWorkflow(genName, properties);
	}
	
	public DslExtension isDslFile(String filename){
		// TODO NEed a way to find the DslExtension info outside eclipse
		return null;
	}

	
}
