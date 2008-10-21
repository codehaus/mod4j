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

    private String project;

    public CrossxDirectoryVisitor(DslExtension dsl, String theWorkDir) {
        this.dsl = dsl;
        this.project = theWorkDir;
        initialize();
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.klasse.tools.io.IDirectoryVisitor#visitDirectoryBefore(java.io.File)
     */
    public Object visitDirectoryBefore(File directory) {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.klasse.tools.io.IDirectoryVisitor#visitDirectoryAfter(java.io.File)
     */
    public Object visitDirectoryAfter(File directory) {
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.klasse.tools.io.IDirectoryVisitor#visitFile(java.io.File)
     */
    public Object visitFile(File file) throws Mod4jWorkflowException {
        if (file.isFile() && file.getName().endsWith(dsl.getDslFileExtension())) {
            generateCrossxSymbols(file);
        }
        return null;
    }

    private String oawWorkflow = null;

    /**
     * Initialize stuff for running the visitor.
     * 
     */
    private void initialize() {
        oawWorkflow = dsl.getDsl2crossxWorkflow();
        if ((oawWorkflow == null) || (oawWorkflow.length() == 0)) {
            // do nothing
            oawWorkflow = null;
            return;
        }
        ClassLoader cls = CrossxDirectoryVisitor.class.getClassLoader();
        URL url = cls.getResource(oawWorkflow);
        if (url == null) {
            System.err.println("Crossx oaW file [" + oawWorkflow + "] not found");
            System.exit(1);
        }
        oawWorkflow = url.toString();
    }

    // TODO extensions import from other files
    private static final String CROSSX_EXTENSION = ".crossx";

    private void generateCrossxSymbols(File file) throws Mod4jWorkflowException {
        if (oawWorkflow == null) {
            return;
        }
        String modelfile = file.getAbsolutePath();
        modelfile = StringHelpers.replaceAllSubstrings(modelfile, "\\", "/");
        String crossxfile = modelfile.substring(0, modelfile.lastIndexOf(dsl.getDslFileExtension())) + CROSSX_EXTENSION;
        modelfile = "file:/" + modelfile;

        RunCrossxWorkflow wf = new RunCrossxWorkflow();
        wf.runWorkflow(oawWorkflow, project, modelfile, crossxfile);
    }
}
