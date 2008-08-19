package org.mod4j.mojo;

import java.util.Set;

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
     * The list with known DSL extensions to process.
     * 
     * @parameter
     * 
     */
    private Set<DslExtension> dslExtensions;

    public void execute() throws MojoExecutionException, MojoFailureException {

        getLog().info("Executing Mod4J Maven plug-in, goal: genrateFromModel");

        DslExtension dsl = new DslExtension("BusinessDomainDsl", "BusinessDomainDsl",
                "BusinessDomainDsl.BusinessDomainDslPackage", ".busmod", "crossx/busmod2crossx2.oaw",
                "src/workflow/busmod.oaw", "src/workflow/busmod.properties");

        String dir = project.getBasedir().getAbsolutePath();
        getLog().info("Project basedir : " + project.getBasedir().getAbsolutePath());

        try {
            processDslModel(dir, dsl);
        } catch (Mod4jWorkflowException we) {
            throw new MojoFailureException("Workflow ERROR while processing the DSL Model located at:" + dir);
        } catch (Exception e) {
            throw new MojoFailureException("ERROR while processing the DSL Model :" + e.getMessage());
        }
    }

    /**
     * Method for processing DSL model files. The following steps will be processed:<br/> 1) Walk through all Mod4j
     * model files for the given <b>DslExtension</b> within the model project and extract reference information (CrossX
     * Broker). <br/> 2) Run the internal oAW workflow file, which checks consistency of the models and generate code
     * and artifacts.
     * 
     * @param projectDir
     * @param DslExterndion
     * @throws Exception 
     * @throws Exception 
     */
    public void processDslModel(final String projectDir, final DslExtension dsl) throws Exception {

        DirectoryWalker walker = new DirectoryWalker();
        CrossxDirectoryVisitor vis = new CrossxDirectoryVisitor(dsl, projectDir);
        walker.walk(projectDir, vis);
        CodegenDirectoryVisitor codegen = new CodegenDirectoryVisitor(dsl, projectDir);
        walker.walk(projectDir, codegen);
    }

}