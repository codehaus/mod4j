/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *     Ordina - made changes to the original WorkflowRunner to allow acces to the
 *              Issues from Java code calling this WorkFlowRunner
 *******************************************************************************/
package org.mod4j.dslcommon.openarchitectureware;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.Manifest;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openarchitectureware.workflow.ConfigurationException;
import org.openarchitectureware.workflow.Workflow;
import org.openarchitectureware.workflow.WorkflowContext;
import org.openarchitectureware.workflow.WorkflowContextDefaultImpl;
import org.openarchitectureware.workflow.WorkflowRunner;
import org.openarchitectureware.workflow.ast.util.WorkflowFactory;
import org.openarchitectureware.workflow.customizer.WorkflowCustomization;
import org.openarchitectureware.workflow.issues.Issue;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.workflow.issues.IssuesImpl;
import org.openarchitectureware.workflow.monitor.NullProgressMonitor;
import org.openarchitectureware.workflow.monitor.ProgressMonitor;

/**
 * Main class to run a workflow.
 * <p>
 * Arguments:
 * <ul>
 * <li>Workflow configuration filename.
 * <li>an optional ProgressMonitor
 * <li>optional runtime properties that override those in workflow files
 * </ul>
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Clemens Kadura (zAJKa) - adapted for debugger handling (since 4.2)
 */
public class Mod4jWorkflowRunner {

    private static final String PARAM = "p";

    private static final String MONITOR = "m";

    private static final String ANT = "a";

    private static final String CMDL = "c";

    private WorkflowContextDefaultImpl wfContext = new WorkflowContextDefaultImpl();

    private ProgressMonitor monitor;

    public final Log logger = LogFactory.getLog(getClass());

    private Map<String, String> params;

    private Workflow workflow;

    /**
     * Convert type line arguments into a hashmap. Each parameter is expected in format -pkey=value
     * 
     * @param args
     *            Program arguments
     * @return A map containing all identified parameters
     */
    private static Map<String, String> resolveParams(final String[] args) {
        final Map<String, String> params = new HashMap<String, String>();
        if (args == null)
            return params;
        for (int i = 0; i < args.length; i++) {
            final String[] string = args[i].split("=");
            if (string.length != 2)
                throw new IllegalArgumentException("wrong param syntax (-pkey=value). was : " + args[i]);
            params.put(string[0], string[1]);
        }
        return params;
    }

    /**
     * Print usage information and terminate the program.
     * 
     * @param options
     */
    private static void wrongCall(final Options options) {
        final HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("java " + WorkflowRunner.class.getName() + " some_workflow_file.oaw [options]", options);
        System.exit(0);
    }

    public Issues issues = new IssuesImpl();

    /**
     * @param workFlowFile
     * @param monitor
     * @param logger
     * @param params
     */
    public boolean run(final String workFlowFile, final ProgressMonitor theMonitor,
            final Map<String, String> theParams, final Map<String, ?> externalSlotContents) {
        final boolean configOK = prepare(workFlowFile, theMonitor, theParams);
        // JOS issues = new IssuesImpl();
        if (configOK)
            return executeWorkflow(externalSlotContents, issues);
        return false;
    }

    public boolean prepare(final String workFlowFile, final ProgressMonitor theMonitor,
            final Map<String, String> theParams) {
        if (workFlowFile == null)
            throw new NullPointerException("workflowFile is null");

        if (theMonitor == null)
            monitor = new NullProgressMonitor();
        else
            monitor = theMonitor;
        params = theParams;

        myLogInfo("--------------------------------------------------------------------------------------");
        myLogInfo("openArchitectureWare " + getVersion());
        myLogInfo("(c) 2005-2008 openarchitectureware.org and contributors");
        myLogInfo("--------------------------------------------------------------------------------------");
        myLogInfo("running workflow: " + workFlowFile);
        myLogInfo("");

        mapDefaultKeywords();

        if (!params.isEmpty()) {
            myLogDebug("Params:" + params.toString());
        }

        try {
            final WorkflowFactory factory = new WorkflowFactory();

            // see Bug#155854: WorkflowFactory will throw an
            // IllegalArgumentException which indicates
            // a configuration problem.
            // Detect this very special case
            try {
                workflow = factory.parseInitAndCreate(workFlowFile, params, WorkflowFactory.getDefaultConverter(),
                        issues);
            } catch (IllegalArgumentException illegalArg) {
                if (illegalArg.getMessage().startsWith("Couldn't load file")) {
                    throw new ConfigurationException(illegalArg.getMessage());
                }
                throw illegalArg;
            }
            logIssues(logger, issues);
            if (issues.hasErrors()) {
                myLogError("01 Workflow interrupted because of configuration errors.");
                return false;
            }
            if (workflow != null)
                workflow.checkConfiguration(issues);
            logIssues(logger, issues);
            if (issues.hasErrors()) {
                myLogError("02 orkflow interrupted because of configuration errors.");
                return false;
            }
        } catch (final ConfigurationException ex) {
            myLogFatal("03: " + ex.getMessage(), ex);
            logIssues(logger, issues);
            return false;
        }

        return true;

    }

    private void mapDefaultKeywords() {
        WorkflowCustomization.registerKeywordMapping("xpand", "org.openarchitectureware.xpand2.Generator");
        WorkflowCustomization.registerKeywordMapping("generate", "org.openarchitectureware.xpand2.Generator");
        WorkflowCustomization.registerKeywordMapping("read", "org.eclipse.mwe.emf.Reader");
        WorkflowCustomization.registerKeywordMapping("write", "org.eclipse.mwe.emf.Writer");
        WorkflowCustomization.registerKeywordMapping("trafo", "org.openarchitectureware.xtend.XtendComponent");
        WorkflowCustomization.registerKeywordMapping("transform", "org.openarchitectureware.xtend.XtendComponent");
        WorkflowCustomization.registerKeywordMapping("generatorAspect",
                "org.openarchitectureware.xpand2.GeneratorAdvice");
        WorkflowCustomization.registerKeywordMapping("transformationAspect",
                "org.openarchitectureware.xtend.XtendAdvice");
        WorkflowCustomization.registerKeywordMapping("cleanDir",
                "org.openarchitectureware.workflow.common.DirectoryCleaner");
        WorkflowCustomization.registerKeywordMapping("checkConstraints",
                "org.openarchitectureware.check.CheckComponent");
    }

    public boolean executeWorkflow(final Map<?, ?> externalSlotContents, final Issues issues) {
        try {
            addExternalSlotContents(externalSlotContents);
            final long time = System.currentTimeMillis();
            monitor.started(workflow, wfContext);
            workflow.invoke(wfContext, monitor, issues);
            monitor.finished(workflow, wfContext);
            final long duration = System.currentTimeMillis() - time;
            myLogInfo("04 workflow completed in " + duration + "ms!");
            if (issues.getErrors().length > 0)
                return false;
            return true;
        } catch (final Exception e) {
            if (e.getClass().getName().indexOf("Interrupt") > -1) {
                myLogError("05 Workflow interrupted. Reason: " + e.getMessage());
            } else {
                myLogError("06 " + e.getMessage(), e);
            }
        } finally {
            logIssues(logger, issues);
        }
        return false;
    }

    private void addExternalSlotContents(final Map<?, ?> slotContents) {
        if (slotContents == null)
            return;
        for (final Iterator<?> iter = slotContents.keySet().iterator(); iter.hasNext();) {
            final String key = (String) iter.next();
            wfContext.set(key, slotContents.get(key));
        }
    }

    private void logIssues(final Log logger, final Issues issues) {
        // log any configuration warning messages
        Issue[] issueArray = issues.getWarnings();
        for (int i = 0; i < issueArray.length; i++) {
            final Issue issue = issueArray[i];
            myLogWarn("07" + issue.toString());
        }

        // log any configuration error messages
        if (issues.hasErrors()) {
            issueArray = issues.getErrors();
            for (int i = 0; i < issueArray.length; i++) {
                final Issue issue = issueArray[i];
                myLogError(issue.toString());
            }
        }
    }

    public WorkflowContext getContext() {
        return wfContext;
    }

    /**
     * Tries to read the exact build version from the Manifest of the core.workflow plugin. Therefore the Manifest file
     * is located and the version is read from the attribute 'Bundle-Version'.
     * 
     * @return The build version string, format "4.1.1, Build 200609291913"
     * @author Karsten Thoms
     * @since 4.1.1
     */
    private String getVersion() {
        String version = null;

        // get all META-INF/MANIFEST.MF found in the classpath
        Enumeration<URL> manifestURLs = null;
        try {
            manifestURLs = Thread.currentThread().getContextClassLoader().getResources("META-INF/MANIFEST.MF");
        } catch (IOException e) {
            throw new IllegalStateException("Failed to load Manifest");
        }

        while (manifestURLs.hasMoreElements()) {
            URL url = manifestURLs.nextElement();
            try {
                Manifest manifest = new Manifest(url.openStream());
                // identify the manifest from core.workflow plugin
                if ("org.openarchitectureware.core.workflow".equals(manifest.getMainAttributes().getValue(
                        "Bundle-SymbolicName"))) {
                    // Read bundle version an split it.
                    // Original value : "4.1.1.200609291913"
                    // Resulting value : "4.1.1, Build 200609291913"
                    version = manifest.getMainAttributes().getValue("Bundle-Version");
                    int lastPoint = version.lastIndexOf('.');
                    version = version.substring(0, lastPoint) + ", Build " + version.substring(lastPoint + 1);
                    return version;
                }
            } catch (IOException e) {
                myLogDebug("08 Failed to read Manifest file: " + url);
            }
        }
        // build version not detected from manifest, fallback
        // this will only occur in developer's workbench
        return "4.x Development";
    }

    protected void myLogInfo(String message) {
        logger.info(message);
        System.err.println("MYRUNNER INFO - " + message);
    }

    protected void myLogError(String message) {
        logger.error(message);
        System.err.println("MYRUNNER ERROR - " + message);
    }

    protected void myLogError(String message, Exception e) {
        logger.error(message, e);
        System.err.println("MYRUNNER ERROR - " + message);
    }

    protected void myLogFatal(String message, Exception e) {
        logger.fatal(message, e);
        System.err.println("MYRUNNER FATAL - " + message);
    }

    protected void myLogDebug(String message) {
        logger.debug(message);
        System.err.println("MYRUNNER DEBUG - " + message);
    }

    protected void myLogWarn(String message) {
        logger.warn(message);
        System.err.println("MYRUNNER WARNING- " + message);
    }
}
