package org.mod4j.mojo;

import java.util.HashSet;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;
import org.mod4j.dslcommon.io.DirectoryWalker;
import org.mod4j.dslcommon.openarchitectureware.CodegenDirectoryVisitor;
import org.mod4j.dslcommon.openarchitectureware.CrossxDirectoryVisitor;
import org.mod4j.dslcommon.openarchitectureware.DslExtension;
import org.mod4j.dslcommon.openarchitectureware.Mod4jWorkflowException;

/**
 * The Mod4j Maven plug-in is used for generating artifacts out of Mod4j model projects. <br/>
 * 
 * @goal generateFromModel
 * @description Executes the process for generating artifacts out of Mod4j DSL model projects.
 */
public class Mod4jGeneratorMojo extends AbstractMojo {

    /**
     * The current Maven project we are working with.
     * 
     * @parameter expression="${project}"
     * @required
     */
    private MavenProject project;

    /**
     * The model dir to process
     * 
     */
    //TODO Make this plug-in search in all known source folders 
    private final static String MODEL_DIR = "src/model";
    
    /**
     * The list with known DSL extensions to process.
     * 
     * @parameter
     * 
     */
    //TODO Make use of set of dslExtentions to process
    private HashSet<DslExtension> dslExtensions;

    /* (non-Javadoc)
     * @see org.apache.maven.plugin.AbstractMojo#execute()
     */
    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("Executing Mod4J Maven plug-in, goal: genrateFromModel");

        DslExtension dsl = new DslExtension("BusinessDomainDsl", "BusinessDomainDsl",
                "BusinessDomainDsl.BusinessDomainDslPackage", ".busmod", "crossx/busmod2crossx2.oaw",
                "codegen/BusinessDomainDsl.oaw", "businessDomain/BusinessDomainDsl.properties");

        String dir = project.getBasedir().getAbsolutePath();
        
        try {
            processDslModel(dir, dsl);
        } catch (Mod4jWorkflowException we) {
            throw new MojoFailureException("Workflow ERROR while processing the " + dsl.getDslName() + " at:" + dir);
        } catch (Exception e) {
            throw new MojoFailureException("ERROR while processing " + dsl.getDslName() + " :" + e.getMessage());
        }
    }

    /**
     * Method for processing DSL model files. The following steps will be processed:<br/> 1) Walk through all Mod4j
     * model files for the given <b>DslExtension</b> within the model project and extract reference information (CrossX
     * Broker). <br/> 2) Run the internal oAW workflow files, which checks consistency of the models and generate code
     * and artifacts.
     * 
     * @param projectDir
     * @param DslExtension
     * @throws Exception 
     */
    public void processDslModel(final String projectDir, final DslExtension dsl) throws Exception {

        DirectoryWalker walker = new DirectoryWalker();
        CrossxDirectoryVisitor vis = new CrossxDirectoryVisitor(dsl, projectDir);
        walker.walk(projectDir + "/" + MODEL_DIR, vis);
        CodegenDirectoryVisitor codegen = new CodegenDirectoryVisitor(dsl, projectDir);
        walker.walk(projectDir + "/" + MODEL_DIR, codegen);
    }

}