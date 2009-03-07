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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.mod4j.dslcommon.xml.XmlUtil;

public class ProjectTrack {

//    private List<FileTrack> trackedFiles = new ArrayList<FileTrack>();

    private String projectPath = null;
    private FileTrack currentTrack = null;
    private Map<String, FileTrack> tracks = new HashMap<String, FileTrack>();


    /**
	 * @return the currentFileTrack
	 */
	public FileTrack getCurrentFileTrack() {
		return currentTrack;
	}

	/**
	 * @param currentFileTrack the currentFileTrack to set
	 */
	public void setCurrentFileTrack(FileTrack currentFileTrack) {
		this.currentTrack = currentFileTrack;
	}

	public String getProjectPath() {
        return projectPath;
    }

	public void setProjectPath(String path) {
        projectPath = path;
    }

    public ProjectTrack() {
        tracks = new HashMap<String, FileTrack>();
    }
    
    public ProjectTrack(String projectPath) {
        tracks = new HashMap<String, FileTrack>();
        this.projectPath = projectPath;
    }

    private String applicationPath;

    public String getApplicationPath() {
        return applicationPath;
    }

    public void setApplicationPath(String applicationPath) {
        this.applicationPath = applicationPath;
    }

    public FileTrack getTrack(String resource) {
//    	System.err.println("GetTrack() ["+ resource + "]" ); 
        String localResource = resource;
        if (resource.startsWith("file:/")) {
            localResource = resource.substring(6);
        }
        if (localResource.startsWith(projectPath)) {
            localResource = localResource.substring(projectPath.length());
        }
        FileTrack result = tracks.get(localResource);
        if (result == null) {
//        	System.err.println("      null" );
            result = new FileTrack(localResource);
            result.setProject(this);
            tracks.put(localResource, result);
        } else {
//        	System.err.println("      found" );
//            result.clear();
        }
        return result;
    }

    public Collection<FileTrack> getTracks() {
        return Collections.unmodifiableCollection(tracks.values());
    }

    /* The XML tag names for readong and writing as XML file
     * 
     */
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


	public void writeProjectTrack(String filename) {
		System.err.println("writeProjectTracker [" + filename + "]");
		Document doc = new Document();
		Element root = new Element(PROJECT_TRACK);
		root.setAttribute(PROJECT_PATH, getProjectPath());
		root.setAttribute(APPLICATION_PATH, getApplicationPath());
		doc.setRootElement(root);

		for (FileTrack fileTrack : getTracks()) {
			Element model = new Element(FILE_TRACK);
			model.setAttribute(RESOURCE, fileTrack.getResource());
			root.addContent(model);
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
		XmlUtil.writeDocument(doc, filename, true, "    ");
	}

	public void readProjectTracker(String filename) {
		File file = new File(filename);
		if( ! file.exists() ){
			System.err.println("readProjectTracker [" + filename + "] does not exist");
			return;
		}
		System.err.println("readProjectTracker [" + filename + "]");
		Document doc = XmlUtil.readXmlDocument(file, true);

		// unpack
		Element root = doc.getRootElement();
		assert root.getName().equals(PROJECT_TRACK) : "ProjectTrack XML root element incorrect";

//		for (Object projectTrackNode : root.getChildren()) {
//			Element node = (Element) projectTrackNode;
//		currentProject = findProject(node.getAttributeValue(PROJECT_PATH));
		setApplicationPath(root.getAttributeValue(APPLICATION_PATH));
		setProjectPath(root.getAttributeValue(PROJECT_PATH));

		for (Object fileTrackNode : root.getChildren()) {
			Element fileNode = (Element) fileTrackNode;
			assert fileNode.getName().equals(FILE_TRACK) : "FileTrack XML Filetrack element incorrect";

			setCurrentFileTrack( getTrack(fileNode.getAttributeValue(RESOURCE)) );
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
