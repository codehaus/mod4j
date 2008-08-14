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

        processDslModel(dir, dsl);
    }

    /**
     * Moethod for processing the DSL model. The following steps will be processed:<br/> 1) Collect all Mod4j model files within the model project. <br/> 2)
     * Extract reference information the model files (CrossX Broker). <br/> 3) Run the internal oAW workflow file, which
     * checks consistency of the models and generate artifacts.
     */
    public void processDslModel(String projectDir, DslExtension dsl) {
        
        DirectoryWalker walker = new DirectoryWalker();
        CrossxDirectoryVisitor vis = new CrossxDirectoryVisitor(dsl, projectDir);
        walker.walk(projectDir, vis);
        CodegenDirectoryVisitor codegen = new CodegenDirectoryVisitor(dsl, projectDir);
        walker.walk(projectDir, codegen);
    }

}