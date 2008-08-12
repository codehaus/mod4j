package org.mod4j.dslcommon.openarchitectureware;

import java.io.File;
import java.net.URL;

import org.mod4j.dslcommon.generator.helpers.StringHelpers;
import org.mod4j.dslcommon.io.IDirectoryVisitor;

/**
 * @author jos
 */
public class CrossxDirectoryVisitor implements IDirectoryVisitor {
	
	private DslExtension dsl = null;
	
	public CrossxDirectoryVisitor(DslExtension dsl, String theWorkDir){
		this.dsl = dsl;
		initialize();
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
	
	private String oawWorkflow = null;
	
	/** Initialize stuff for running the visitor.
	 * 
	 */
	private void initialize() {
		oawWorkflow = dsl.getDsl2crossxWorkflow();
		ClassLoader cls = CrossxDirectoryVisitor.class.getClassLoader();
		URL url = cls.getResource(oawWorkflow);
		if( url == null ){
			System.err.println("oaW file [" + oawWorkflow + "] not found");
			System.exit(1);
		}
		oawWorkflow = url.toString();
	}
	// TODO extensions import from other files
	private static final String CROSSX_EXTENSION = ".crossx";

	private void generateCrossxSymbols(File file) {
			
		String modelfile = file.getAbsolutePath();
		modelfile = StringHelpers.replaceAllSubstrings(modelfile, "\\", "/");
		String crossxfile = modelfile.substring(0, modelfile.lastIndexOf(dsl.getDslFileExtension())) +
        CROSSX_EXTENSION;
		modelfile = "file:/"+ modelfile;

		RunCrossxWorkflow wf = new RunCrossxWorkflow();
    	wf.runWorkflow(oawWorkflow, modelfile, crossxfile);
	}
	}
	
