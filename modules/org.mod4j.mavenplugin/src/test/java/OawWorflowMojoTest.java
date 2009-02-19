/*******************************************************************************
 * Copyright (c) 2009 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/

import java.io.File;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.apache.maven.project.MavenProject;
import org.mod4j.mojo.OawWorkflowMojo;

public class OawWorflowMojoTest extends AbstractMojoTestCase {
    
    protected void setUp() throws Exception {
        // Required for mojo lookups to work
        super.setUp();
    }

    /**
     * Tests the proper discovery and configuration of the mojo
     * 
     * @throws Exception
     */
    public void testExecuteWorkflowMojo() {

        File testPom = new File(getBasedir(), "src/test/resources/executeWorkflow-testpom.xml");

        try {
            OawWorkflowMojo mojo = (OawWorkflowMojo) lookupMojo("executeWorkflow", testPom);
            assertNotNull(mojo);
            mojo.execute();
        } catch (MojoExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MojoFailureException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}