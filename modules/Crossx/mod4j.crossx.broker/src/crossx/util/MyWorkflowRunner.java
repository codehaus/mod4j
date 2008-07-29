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
package crossx.util;

import org.openarchitectureware.workflow.*;
	import java.io.IOException;
	import java.lang.reflect.Method;
	import java.net.URL;
	import java.util.ArrayList;
	import java.util.Enumeration;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Map;
	import java.util.jar.Manifest;

	import org.apache.commons.cli.CommandLine;
	import org.apache.commons.cli.CommandLineParser;
	import org.apache.commons.cli.HelpFormatter;
	import org.apache.commons.cli.Option;
	import org.apache.commons.cli.OptionBuilder;
	import org.apache.commons.cli.Options;
	import org.apache.commons.cli.ParseException;
	import org.apache.commons.cli.PosixParser;
	import org.apache.commons.logging.Log;
	import org.apache.commons.logging.LogFactory;
	import org.openarchitectureware.workflow.ast.util.WorkflowFactory;
	import org.openarchitectureware.workflow.customizer.WorkflowCustomization;
	import org.openarchitectureware.workflow.issues.Issue;
	import org.openarchitectureware.workflow.issues.Issues;
	import org.openarchitectureware.workflow.issues.IssuesImpl;
	import org.openarchitectureware.workflow.monitor.NullProgressMonitor;
	import org.openarchitectureware.workflow.monitor.ProgressMonitor;
	import org.openarchitectureware.workflow.util.ResourceLoaderFactory;

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
	 * @since 4.0
	 */
	public class MyWorkflowRunner {
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
		 * Starts a workflow.
		 * 
		 * @param args Program arguments. See class documentation.
		 */
//		@SuppressWarnings("static-access")
//		public static void main(final String... args) {
//			// workaround for MacOSX classloader issue
//			// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=211167
//			// if omitted, "Run as oAW workflow" action immediately terminates when SWT libraries are in the classpath
//			new Object();
//			// end workaround
//			final Options options = new Options();
//			
//			options.addOption(OptionBuilder.hasArgs().withArgName("className,moreArgs").withDescription(
//					"the name of a class that implements ProgressMonitor. More arguments can be appended that will be injected to the monitor,"
//							+ " if it has a init(String[] args) method.").withLongOpt("monitorClass").withValueSeparator(',').create(MONITOR));
//			
//			options.addOption(OptionBuilder.withLongOpt("ant").withDescription("must be set when using in Ant context").create(ANT));
//			
//			final Option paramOption = OptionBuilder.withArgName("key=value").withDescription("external property that is handled as workflow property")
//					.hasArgs().create(PARAM);
//			paramOption.setLongOpt("param");
//			options.addOption(paramOption);
//			
//			options.addOption(OptionBuilder.hasArgs().withArgName("className").withDescription(
//					"the name of a class that implements a public method 'public void processCmdLine(String[] cmdLineArgs, Map paramsToUseInWorkflow, WorkflowContext ctx)'.")
//					.withLongOpt("cmdLineProcessor").create(CMDL));
//			
//			// create the parser
//			final CommandLineParser parser = new PosixParser();
//			CommandLine line = null;
//			try {
//				line = parser.parse(options, args);
//			} catch (final ParseException exp) {
//				System.err.println("Parsing arguments failed.  Reason: " + exp.getMessage());
//				wrongCall(options);
//				return;
//			}
//
//			WorkflowRunner runner = new WorkflowRunner();
//			Map<String, String> params = new HashMap<String, String>();
//			String wfFile = null;
//			String[] monitorOptValues = line.getOptionValues(MONITOR);
//			
//			if (line.hasOption(CMDL)) {
//				try {
//					// args bearbeiten:
//					// --cmdLineProcessor Option raus
//					List<String> unprocessedArgs = new ArrayList<String>();
//					for (int i = 0; i < args.length; i++) {
//						String arg = args[i];
//						if (arg.equals("-"+CMDL) || arg.equals("--cmdLineProcessor")) {
//							i++;  // dieses und das n�chste Element ignorieren
//						} 
//						else if (arg.equals("-"+MONITOR) || arg.equals("--monitorClass")) {
//							//i++;  // dieses und das n�chste Element ignorieren
//							i = i+ monitorOptValues.length;
//						} 
//						else if (arg.endsWith(".oaw")) {
//							if ( wfFile != null) {
//								System.err.println("Workflowfile already defined!");
//								System.exit(1);
//							}
//							wfFile = arg;
//							;  // continue the loop (wird hier sp�ter verarbeitet)
//						}
//						else {
//							unprocessedArgs.add(arg);						
//						}
//					}
//					
//					Class<?> cmdLineProcessor = ResourceLoaderFactory.createResourceLoader().loadClass(line.getOptionValue(CMDL));
//					if (cmdLineProcessor == null) {
//						System.err.println("cannot find class '" + line.getOptionValue(CMDL) + "' for command line processing.");
//						System.exit(1);
//					}
//					Method method = cmdLineProcessor.getMethod("processCmdLine", String[].class, Map.class, WorkflowContext.class);
//					method.invoke(cmdLineProcessor.newInstance(), unprocessedArgs.toArray(new String[0]), params, runner.getContext());
//				} catch (Exception e) {
//					e.printStackTrace();
//					System.exit(1);
//				}
//			}
//			else {
//				params = resolveParams(line.getOptionValues(PARAM));
//				wfFile = line.getArgs()[0];
//			}
//			
//			if (wfFile == null || !wfFile.endsWith(".oaw")) {
//				wrongCall(options);
//			}
//			
//			ProgressMonitor monitor = null;
//			if (monitorOptValues != null) {
//				try {
//					final Class<?> clazz = ResourceLoaderFactory.createResourceLoader().loadClass(monitorOptValues[0]);
//					if (clazz == null)
//						throw new ClassNotFoundException("Didn't find class " + monitorOptValues[0]);
//					monitor = (ProgressMonitor) clazz.newInstance();
//					Method method = monitor.getClass().getMethod("init", new Class[] { String[].class });
//					if (method != null)
//						method.invoke(monitor, new Object[] { monitorOptValues });
//				} catch (final Exception e) {
//					e.printStackTrace();
//					if (line.hasOption(ANT))
//						System.exit(1);
//					return;
//				}
//			}
//
//
//			// normalize wfFile name so that it can be found in the class path
//			// (necessary for debugger source lookup)
//			URL wfUrl;
//			int index = 0;
//			do {
//				wfUrl = Thread.currentThread().getContextClassLoader().getResource(wfFile);
//				if (wfUrl == null) {
//					index = wfFile.indexOf('/');
//					if (index >= 0)
//						wfFile = wfFile.substring(index + 1);
//				}
//			} while (wfUrl == null && index >= 0);
//
//			if (wfUrl == null) {
////				runner.logger.error("can't find the workflow file '" + line.getArgs()[0] + "' in the current class path");
//				System.err.println("can't find the workflow file '" + line.getArgs()[0] + "' in the current class path");
//				if (line.hasOption(ANT))
//					System.exit(1);
//				return;
//			}
//
//			boolean success = runner.run(wfFile, monitor, params, null);
//			if (!success && line.hasOption(ANT)) {
//				System.exit(1);
//			}
//			
//		}

		/**
		 * Convert type line arguments into a hashmap. Each parameter is expected in format -pkey=value
		 * 
		 * @param args Program arguments
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
		public boolean run(final String workFlowFile, final ProgressMonitor theMonitor, final Map<String, String> theParams,
				final Map<String, ?> externalSlotContents) {
			final boolean configOK = prepare(workFlowFile, theMonitor, theParams);
			// JOS issues = new IssuesImpl();
			if (configOK)
				return executeWorkflow(externalSlotContents, issues);
			return false;
		}

		public boolean prepare(final String workFlowFile, final ProgressMonitor theMonitor, final Map<String, String> theParams) {
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
			// JOS final Issues issues = new IssuesImpl();

			try {
				final WorkflowFactory factory = new WorkflowFactory();

				// see Bug#155854: WorkflowFactory will throw an
				// IllegalArgumentException which indicates
				// a configuration problem.
				// Detect this very special case
				try {
					workflow = factory.parseInitAndCreate(workFlowFile, params, WorkflowFactory.getDefaultConverter(), issues);
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
				myLogFatal("03: "+ ex.getMessage(), ex);
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
			WorkflowCustomization.registerKeywordMapping("generatorAspect", "org.openarchitectureware.xpand2.GeneratorAdvice");
			WorkflowCustomization.registerKeywordMapping("transformationAspect", "org.openarchitectureware.xtend.XtendAdvice");
			WorkflowCustomization.registerKeywordMapping("cleanDir", "org.openarchitectureware.workflow.common.DirectoryCleaner");
			WorkflowCustomization.registerKeywordMapping("checkConstraints", "org.openarchitectureware.check.CheckComponent");
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
					myLogError("06 "+ e.getMessage(), e);
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
		 * Tries to read the exact build version from the Manifest of the core.workflow plugin. Therefore the Manifest
		 * file is located and the version is read from the attribute 'Bundle-Version'.
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
					if ("org.openarchitectureware.core.workflow".equals(manifest.getMainAttributes().getValue("Bundle-SymbolicName"))) {
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

		protected void myLogInfo(String message){
			logger.info(message);
			System.err.println("MYRUNNER INFO - " + message);
		}
		protected void myLogError(String message){
			logger.error(message);
			System.err.println("MYRUNNER ERROR - " + message);
		}
		protected void myLogError(String message, Exception e){
			logger.error(message, e);
			System.err.println("MYRUNNER ERROR - " + message);
		}
		protected void myLogFatal(String message, Exception e){
			logger.fatal(message, e);
			System.err.println("MYRUNNER FATAL - " + message);
		}
		protected void myLogDebug(String message){
			logger.debug(message);
			System.err.println("MYRUNNER DEBUG - " + message);
		}
		protected void myLogWarn(String message){
			logger.warn(message);
			System.err.println("MYRUNNER WARNING- " + message);
		}
	}
