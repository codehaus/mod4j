/*******************************************************************************
 * Copyright (c) 2008 Ordina and committers to Mod4j
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ordina - initial implementation
 *******************************************************************************/
package mod4j.crossx.broker.builder;

import java.net.URL;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import mod4j.crossx.broker.views.CrossxView;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class CrossxBuilder extends IncrementalProjectBuilder {

	private static final String DSL_EXTENSION = "businessdomaindsl";
	private static final String WORKFLOW_FILE = "D:\\workspaces\\mod4j-new\\mod4j.crossx.broker\\src\\mod4j\\crossx\\broker\\builder\\busmod2crossx.oaw";

	public  static String text = "niets";
	
	class CrossxDeltaVisitor implements IResourceDeltaVisitor {
		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse.core.resources.IResourceDelta)
		 */
		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource resource = delta.getResource();
//			System.err.println("visit [" + resource.getName() + "]");
			switch (delta.getKind()) {
			case IResourceDelta.ADDED:
				// handle added resource
				checkDSL(resource);
				break;
			case IResourceDelta.REMOVED:
				// handle removed resource
				break;
			case IResourceDelta.CHANGED:
				// handle changed resource
				checkDSL(resource);
				break;
			}
			//return true to continue visiting children.
			return true;
		}
	}

	class CrossxResourceVisitor implements IResourceVisitor {
		public boolean visit(IResource resource) {
			checkDSL(resource);
			//return true to continue visiting children.
			return true;
		}
	}

	public static final String BUILDER_ID = "mod4j.crossx.broker.CrossxBuilder";

	private static final String MARKER_TYPE = "mod4j.crossx.broker.xmlProblem";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 *      java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	protected IProject[] build(int kind, Map args, IProgressMonitor monitor)
			throws CoreException {
		System.err.println("build called");
		if (kind == FULL_BUILD) {
			fullBuild(monitor);
		} else {
			IResourceDelta delta = getDelta(getProject());
			if (delta == null) {
				fullBuild(monitor);
			} else {
				incrementalBuild(delta, monitor);
			}
		}
		return null;
	}

	protected void fullBuild(final IProgressMonitor monitor)
			throws CoreException {
		System.err.println("full build");
		try {
			getProject().accept(new CrossxResourceVisitor());
		} catch (CoreException e) {
		}
	}

	protected void incrementalBuild(IResourceDelta delta,
			IProgressMonitor monitor) throws CoreException {
		// the visitor does the work.
		System.err.println("incremental build");
		delta.accept(new CrossxDeltaVisitor());
	}

	private void checkDSL(IResource resource) {
		if (resource instanceof IFile && resource.getName().endsWith(DSL_EXTENSION)) {
			System.err.println("running checkDSL on [" + resource.getName() + "]");
			IFile file = (IFile) resource;
			RunWorkflow wf = new RunWorkflow();
			String modelfile = "";
			URL modelURL =null;
			try {
				modelURL = file.getLocationURI().toURL();
				modelfile = Platform.asLocalURL( file.getLocationURI().toURL()).toExternalForm();
			} catch( Exception e ){
				
			}
			String xmlfile = file.getRawLocation().toOSString() + ".xml";
			String crossxmodelfile = modelfile + ".crossx";
			wf.runWorkflow(WORKFLOW_FILE, modelfile, xmlfile, crossxmodelfile);
		}
	}
}
