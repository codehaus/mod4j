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
package org.mod4j.common.generator.admin;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.mod4j.dslcommon.generator.helpers.ProjectProperties;

public class Mod4jTracker {

	static private Mod4jTracker mod4jTracker = null;

	private Map<String, ProjectTrack> projects = null;

	private ProjectTrack currentProject = null;

	/**
	 * @return the currentProject
	 */
	public ProjectTrack getCurrentProject() {
		return currentProject;
	}

	/**
	 * @return The collection of all Project Tracks
	 */
	public Collection<ProjectTrack> getProjects() {
		return Collections.unmodifiableCollection(projects.values());
	}

	public void clear() {
		projects = new HashMap<String, ProjectTrack>();
		currentProject = null;
	}

	/**
	 * @return the currentTrack
	 */
	public FileTrack getCurrentTrack() {
		return currentProject.getCurrentFileTrack();
	}

	/**
	 * @return Return the singleton instance of this class
	 */
	static public Mod4jTracker getFileTracker() {
		if (mod4jTracker == null) {
			mod4jTracker = new Mod4jTracker();
		}
		return mod4jTracker;
	}

	private Mod4jTracker() {
		projects = new HashMap<String, ProjectTrack>();
	}

	/**
	 * Notify the ExtensionPointtracker that 'resource'is started
	 * This used by the Maven plugin
	 * 
	 * @param resource
	 */
	public void initResource(String resource) {
		currentProject = findOrCreateProject(resource);
		currentProject.setApplicationPath(resource);
		currentProject.setCurrentFileTrack(currentProject.getTrack(resource));
	}

	/**
	 * Notify the ExtensionPointtracker that code will be generated for 'resource' 
	 * This is used by the Eclipse Mod4j Builder and set the current project such that 
	 * the Xpand templates will refer to the correct template.
	 * 
	 * @param resource
	 */
	public void initResource(String resource, String applicationPath,
			String projectPath) {
		System.err.println("Mod4jTracker initResource [" + resource + "] [" + applicationPath + "] ["
				+ projectPath + "]");
		currentProject = findOrCreateProject(projectPath);
		currentProject.setApplicationPath(applicationPath);
		currentProject.setCurrentFileTrack( currentProject.getTrack(resource) );
	}

	/**
	 * Notify the ExtensionPointtracker that 'resource'is finished
	 * 
	 * @param resource
	 */
	public void finishResource(String resource, String applicationPath,
			String projectPath) {
//		System.err.println("FINISH FileTracker");
		for (GeneratedFile gen : getCurrentTrack().getExtensionFiles()) {
			if (gen.isChanged()) {
//				System.err.println("GENERATED : " + gen.getSourcePath());
				String name = gen.getSourcePath();
				name = gen.getOwner().getProject().getApplicationPath() + "/"
						+ name;
				File file = new File(name);
				// Date modified = new Date(file.lastModified());
				// System.err.println(DateFormat.getInstance().format(modified)
				// + " [" + name + "]");
				gen.setModifiedDate(file.lastModified());
				gen.setChanged(false);
			} else if (gen.isRetained()) {
//				System.err.println("KEEPING : " + gen.getSourcePath());
				gen.setRetained(false);
			} else {
//				System.err.println("REMOVED : " + gen.getSourcePath());
			}
		}
		for (GeneratedFile gen : getCurrentTrack().getGeneratedFiles()) {
			if (gen.isChanged()) {
//				System.err.println("! GENERATED : " + gen.getSourcePath());
				String name = gen.getSourcePath();
				name = gen.getOwner().getProject().getApplicationPath() + "/"
						+ name;
				File file = new File(name);
				// Date modified = new Date(file.lastModified());
				// System.err.println(DateFormat.getInstance().format(modified)
				// + " [" + name + "]");
				gen.setModifiedDate(file.lastModified());
				gen.setChanged(false);
			} else if (gen.isRetained()) {
//				System.err.println("! KEEPING : " + gen.getSourcePath());
				gen.setRetained(false);
			} else {
//				System.err.println("! REMOVED : " + gen.getSourcePath());
			}
		}
	}

	/**
	 * Add the project track to the list of managed projects.
	 * Overwrite any project with the same path that is already in the managed collection
	 * 
	 * @param projectTrack The new projectTrack to add
	 */
	public void addProjectTrack(ProjectTrack projectTrack) {
		projects.put(projectTrack.getProjectPath(), projectTrack);
	}
	
	/**
	 * Find the ProjectTrack with the given projectPath.  If it does not exist, create a new one.
	 * @param projectPath
	 * @return
	 */
	private ProjectTrack findOrCreateProject(String projectPath) {
		ProjectTrack result = projects.get(projectPath);
		if (result == null) {
			result = new ProjectTrack(projectPath);
			projects.put(projectPath, result);
		}
		return result;
	}

	/**
	 * The file 'filename' is to be generated within 'moduleName'. the name of
	 * the resulting file will be returned and stored in the file tracker.
	 * Static, because this is used in Xpand templates.
	 * 
	 * @param moduleName
	 * @param filename
	 * @return
	 */
	static public String generate(String moduleName, String filename) {
		// System.err.println("Generate [" + filename + "]");
		String result = null;
		if (filename.endsWith(".java")) {
			result = moduleName + "/" + ProjectProperties.getSrcGenPath() + "/"
					+ filename;
		} else if (filename.equals("pom.xml")) { // always in root of module
			result = moduleName + "/" + filename;
		} else {
			result = moduleName + "/" + ProjectProperties.getResourceGenPath()
					+ "/" + filename;
		}
		GeneratedFile file = getFileTracker().getCurrentTrack()
				.generatedFile(result);
		file.setChanged(true);
		file.setRetained(false);
		return result;
	}

	/**
	 * Static, because this is used in Xpand templates.
	 * @param moduleName
	 * @param filename
	 * @return
	 */
	static public String extend(String moduleName, String filename) {
		// System.err.println("Extend [" + filename + "]");
		String result = getModuleManFilePath(moduleName, filename);
		GeneratedFile file = getFileTracker().getCurrentTrack()
				.extensionFile(result);
		file.setChanged(true);
		file.setRetained(false);
		return result;
	}

	/**
	 * Static, because this is used in Xpand templates.
	 * @param moduleName
	 * @param filename
	 * @return
	 */
	static public String retain(String moduleName, String filename) {
		// System.err.println("Retain [" + filename + "]");
		String result = getModuleManFilePath(moduleName, filename);
		GeneratedFile file = getFileTracker().getCurrentTrack()
				.extensionFile(result);
		file.setChanged(false);
		file.setRetained(true);
		return result;
	}

	 /** 
	  * Static, because this is used in Xpand templates.
	  * @param moduleName
	  * @param filename
	  * @return
	  */
	static public String fullExtendPath(String moduleName, String filename) {
		String result = getModuleManFilePath(moduleName, filename);
		return ProjectProperties.getApplicationPath() + "/" + result;
	}

	/**
	 * Static, because this is used in Xpand templates.
	 * @param moduleName
	 * @param filename
	 * @return
	 */
	static public String fullGeneratePath(String moduleName, String filename) {
		String result = moduleName + "/" + ProjectProperties.getSrcGenPath()
				+ "/" + filename;
		return ProjectProperties.getApplicationPath() + "/" + result;
	}

	/**
	 * Determine the filepath for manual maintained sources or resources, based
	 * on the given fileName and moduleName. E.g. <br>
	 * <code>MyApp-domain/src/main/resources/filenname.xml</code>. Or <br>
	 * <code>MyApp-domain/src/main/java/filename.java</code>
	 * 
	 * @param moduleName
	 * @param fileName
	 * @return The path to the given fileName.
	 */
	static public String getModuleManFilePath(String moduleName, String fileName) {
		String result = null;
		String prefix;
		if ((moduleName == null) || (moduleName.length() == 0)) {
			prefix = "";
		} else {
			prefix = moduleName + "/";
		}
		if (fileName.endsWith(".java")) {
			result = prefix + ProjectProperties.getSrcManPath() + "/"
					+ fileName;
		} else if (fileName.equals("pom.xml")) { // always in root of module
			result = prefix + fileName;
		} else {
			result = prefix + ProjectProperties.getResourceManPath() + "/"
					+ fileName;
		}
		return result;
	}
}
