package org.mod4j.dslcommon.openarchitectureware;

import java.io.File;

import org.mod4j.dslcommon.generator.helpers.StringHelpers;
import org.mod4j.dslcommon.io.DirectoryWalker;
import org.mod4j.dslcommon.io.IDirectoryVisitor;

/**
 * @author jos
 */
public class CrossxDirectoryVisitor implements IDirectoryVisitor {
	
	private DslExtension dsl = null;
	
	public CrossxDirectoryVisitor(DslExtension dsl, String theWorkDir){
		this.dsl = dsl;
		workDir = theWorkDir;
		setupDsl();
	}

	/* (non-Javadoc)
	 * @see nl.klasse.tools.io.IDirectoryVisitor#visitDirectoryBefore(java.io.File)
	 */
	public Object visitDirectoryBefore(File directory) {
		return null;
	}

	/* (non-Javadoc)
	 * @see nl.klasse.tools.io.IDirectoryVisitor#visitDirectoryAfter(java.io.File)
	 */
	public Object visitDirectoryAfter(File directory) {
		return null;
	}

	/* (non-Javadoc)
	 * @see nl.klasse.tools.io.IDirectoryVisitor#visitFile(java.io.File)
	 */
	public Object visitFile(File file) {
		if( file.isFile() && file.getName().endsWith(dsl.getDslFileExtension()) )
		{
			generateCrossxSymbols(file);
		}
		return null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DslExtension dsl = new DslExtension("BusinessDomainDsl", 
									"BusinessDomainDsl", 
									"BusinessDomainDsl.BusinessDomainDslPackage", 
									".busmod", 
									"crossx/busmod2crossx.oaw", 
									"src/workflow/busmod.oaw", 
									"src/workflow/busmod.properties");
		
		String dir = "D:/mod4j/repository/modules/RecordShop-ExampleProject/RecordShop.BusinessDomain.model";
		DirectoryWalker walker = new DirectoryWalker();
		CrossxDirectoryVisitor vis = new CrossxDirectoryVisitor(dsl, dir);
		walker.walk(dir, vis	);
		CodegenDirectoryVisitor codegen = new CodegenDirectoryVisitor(dsl, dir);
		walker.walk(dir, codegen);
	}
	
	private String workDir = "";
	private String oawName = null;
	
	private void setupDsl() {
		oawName = workDir + dsl.getDsl2crossxWorkflow();
		//TODO oaw Workflow name as parameter
		oawName = "D:/mod4j/repository/modules/BusinessDomain/BusinessDomain.generator/src/main/templates/crossx/busmod2crossx2.oaw";
	}
	

	// TODO extensions import from other files
	private static final String XML_EXTENSION = ".xml";
	private static final String CROSSX_EXTENSION = ".crossx";

	private void generateCrossxSymbols(File file) {
			
		String modelfile = file.getAbsolutePath();
		modelfile = StringHelpers.replaceAllSubstrings(modelfile, "\\", "/");
		String xmlfile = modelfile + XML_EXTENSION;
		modelfile = "file:/"+ modelfile;
		String crossxfile = modelfile + CROSSX_EXTENSION;
		

		RunCrossxWorkflow wf = new RunCrossxWorkflow();
    	wf.runWorkflow(oawName, modelfile, xmlfile, crossxfile);
	}
	}
	
