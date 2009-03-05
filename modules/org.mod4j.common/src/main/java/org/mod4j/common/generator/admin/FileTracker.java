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

import org.jdom.Document;
import org.jdom.Element;
import org.mod4j.dslcommon.generator.helpers.ProjectProperties;
import org.mod4j.dslcommon.xml.XmlUtil;

public class FileTracker {


	static private FileTracker fileTracker = null;

	private Map<String, ProjectTrack> projects = null;

	public Collection<ProjectTrack> getProjects() {
		return Collections.unmodifiableCollection(projects.values());
	}

	private FileTrack currentTrack = null;

	public void clear() {
		projects = new HashMap<String, ProjectTrack>();
		currentProject = null;
		currentTrack = null;
	}

	/**
	 * @return the currentTrack
	 */
	public FileTrack getCurrentTrack() {
		return currentTrack;
	}

	private ProjectTrack currentProject = null;

	static public FileTracker getFileTracker() {
		if (fileTracker == null) {
			fileTracker = new FileTracker();
		}
		return fileTracker;
	}

	private FileTracker() {
		projects = new HashMap<String, ProjectTrack>();
	}

	/**
	 * Notify the ExtensionPointtracker that 'resource'is started
	 * 
	 * @param resource
	 */
	public void initResource(String resource) {
		currentProject = findProject(resource);
		currentProject.setApplicationPath(resource);
		currentTrack = currentProject.getTrack(resource);
	}

	/**
	 * Notify the ExtensionPointtracker that 'resource'is finished
	 * 
	 * @param resource
	 */
	public void finishResource(String resource, String applicationPath,
			String projectPath) {
//		System.err.println("FINISH FileTracker");
		for (GeneratedFile gen : currentTrack.getExtensionFiles()) {
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
		for (GeneratedFile gen : currentTrack.getGeneratedFiles()) {
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
	 * Notify the ExtensionPointtracker that 'resource'is started
	 * 
	 * @param resource
	 */
	public void initResource(String resource, String applicationPath,
			String projectPath) {
		System.err.println("[" + resource + "] [" + applicationPath + "] ["
				+ projectPath + "]");
		currentProject = findProject(projectPath);
		currentProject.setApplicationPath(applicationPath);
		currentTrack = currentProject.getTrack(resource);
	}

	private ProjectTrack findProject(String projectPath) {
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
		GeneratedFile file = getFileTracker().currentTrack
				.generatedFile(result);
		file.setChanged(true);
		file.setRetained(false);
		return result;
	}

	static public String fullExtendPath(String moduleName, String filename) {
		String result = getModuleManFilePath(moduleName, filename);
		return ProjectProperties.getApplicationPath() + "/" + result;
	}

	static public String fullGeneratePath(String moduleName, String filename) {
		String result = moduleName + "/" + ProjectProperties.getSrcGenPath()
				+ "/" + filename;
		return ProjectProperties.getApplicationPath() + "/" + result;
	}

	/**
	 * @param moduleName
	 * @param filename
	 * @return
	 */
	static public String extend(String moduleName, String filename) {
		// System.err.println("Extend [" + filename + "]");
		String result = getModuleManFilePath(moduleName, filename);
		GeneratedFile file = getFileTracker().currentTrack
				.extensionFile(result);
		file.setChanged(true);
		file.setRetained(false);
		return result;
	}

	/**
	 * @param moduleName
	 * @param filename
	 * @return
	 */
	static public String retain(String moduleName, String filename) {
		// System.err.println("Retain [" + filename + "]");
		String result = getModuleManFilePath(moduleName, filename);
		GeneratedFile file = getFileTracker().currentTrack
				.extensionFile(result);
		file.setChanged(false);
		file.setRetained(true);
		return result;
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

	private static final String SOURCE_PATH = "sourcePath";

	private static final String MODIFIED_DATE = "modifiedDate";

	private static final String EXTENSION_POINT = "extensionPoint";

	private static final String RESOURCE = "resource";

	private static final String APPLICATION_PATH = "ApplicationPath";

	private static final String PROJECT_PATH = "ProjectPath";

	private static final String GENERATED_FILE = "GeneratedFile";

	private static final String FILE_TRACK = "FileTrack";

	private static final String PROJECT_TRACK = "ProjectTrack";

	private static final String FILE_TRACKER = "FileTracker";

	public void writeTracker(String filename) {
		System.err.println("writeTracker [" + filename + "]");
		Document doc = new Document();
		Element root = new Element(FILE_TRACKER);
		doc.setRootElement(root);

		for (ProjectTrack pr : FileTracker.getFileTracker().getProjects()) {
			Element project = new Element(PROJECT_TRACK);
			project.setAttribute(PROJECT_PATH, pr.getProjectPath());
			project.setAttribute(APPLICATION_PATH, pr.getApplicationPath());
			root.addContent(project);
			for (FileTrack fileTrack : pr.getTracks()) {
				Element model = new Element(FILE_TRACK);
				model.setAttribute(RESOURCE, fileTrack.getResource());
				project.addContent(model);
				for (GeneratedFile file : fileTrack.getGeneratedFiles()) {
					Element gen = new Element(GENERATED_FILE);
					gen.setAttribute(EXTENSION_POINT, Boolean.toString(file
							.isExtensionPoint()));
					gen.setAttribute(MODIFIED_DATE, Long.toString(file
							.getModifiedDate()));
					gen.setAttribute(SOURCE_PATH, file.getSourcePath());
					// gen.setAttribute("moduleName", file.getModuleName());
					model.addContent(gen);
				}
				for (GeneratedFile file : fileTrack.getExtensionFiles()) {
					Element gen = new Element(GENERATED_FILE);
					gen.setAttribute(EXTENSION_POINT, "true");
					gen.setAttribute(MODIFIED_DATE, Long.toString(file
							.getModifiedDate()));
					gen.setAttribute(SOURCE_PATH, file.getSourcePath());
					// gen.setAttribute("moduleName", file.getModuleName());
					model.addContent(gen);
				}
			}
		}
		XmlUtil.writeDocument(doc, filename, true, "    ");
	}

	public void readTracker(String filename) {
		File file = new File(filename);
		if( ! file.exists() ){
			System.err.println("readTracker [" + filename + "] does not exist");
			return;
		}
		System.err.println("readTracker [" + filename + "]");
		Document doc = XmlUtil.readXmlDocument(file, true);

		// unpack
		Element root = doc.getRootElement();
		assert root.getName().equals(FILE_TRACKER) : "FileTrack XML root element incorrect";

//		fileTracker = new FileTracker();
		fileTracker.clear();
		for (Object projectTrackNode : root.getChildren()) {
			Element node = (Element) projectTrackNode;
			assert node.getName().equals(PROJECT_TRACK) : "FileTrack XML projectTrack element incorrect";
			currentProject = findProject(node.getAttributeValue(PROJECT_PATH));
			currentProject.setApplicationPath(node
					.getAttributeValue(APPLICATION_PATH));

			for (Object fileTrackNode : node.getChildren()) {
				Element fileNode = (Element) fileTrackNode;
				assert fileNode.getName().equals(FILE_TRACK) : "FileTrack XML Filetrack element incorrect";

				currentTrack = currentProject.getTrack(fileNode
						.getAttributeValue(RESOURCE));
				for (Object genFile : fileNode.getChildren()) {
					Element genFileNode = (Element) genFile;
					assert genFileNode.getName().equals(GENERATED_FILE) : "FileTrack XML GeneratedFile element incorrect";
					GeneratedFile generatedFile = new GeneratedFile(genFileNode
							.getAttributeValue(SOURCE_PATH), FileType.TEXT,
							currentTrack, Boolean.parseBoolean(genFileNode
									.getAttributeValue(EXTENSION_POINT)));
					generatedFile.setModifiedDate(Long.parseLong(genFileNode
							.getAttributeValue(MODIFIED_DATE)));
					if (generatedFile.isExtensionPoint()) {
						currentTrack.getExtensionFiles().add(generatedFile);
					} else {
						currentTrack.getGeneratedFiles().add(generatedFile);
					}
				}
			}
		}
	}
}
