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

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mod4j.dslcommon.generator.helpers.ProjectProperties;

public class FileTracker {

    static private FileTracker fileTracker = null;

    private Map<String, ProjectTrack> projects = null;

    public Collection<ProjectTrack> getProjects() {
        return Collections.unmodifiableCollection(projects.values());
    }

    private FileTrack currentTrack = null;

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
     * Notify the ExtensionPointtracker that 'resource'is started
     * 
     * @param resource
     */
    public void initResource(String resource, String applicationPath, String projectPath) {
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
     * The file 'filename' is to be generated within 'moduleName'. the name of the resulting file will be returned and
     * stored in the file tracker.
     * 
     * @param moduleName
     * @param filename
     * @return
     */
    static public String generate(String moduleName, String filename) {
        String result = null;
        if (filename.endsWith(".java")) {
            result = moduleName + "/" + ProjectProperties.getSrcGenPath() + "/" + filename;
        } else if (filename.equals("pom.xml")) { // always in root of module
            result = moduleName + "/" + filename;
        } else {
            result = moduleName + "/" + ProjectProperties.getResourceGenPath() + "/" + filename;
        }
        getFileTracker().currentTrack.generatedFile(result);
        return result;
    }

    static public String fullExtendPath(String moduleName, String filename) {
        String result = getModuleManFilePath(moduleName, filename);
        return ProjectProperties.getApplicationPath() + "/" + result;
    }

    static public String fullGeneratePath(String moduleName, String filename) {
        String result = moduleName + "/" + ProjectProperties.getSrcGenPath() + "/" + filename;
        return ProjectProperties.getApplicationPath() + "/" + result;
    }

    /**
     * @param moduleName
     * @param filename
     * @return
     */
    static public String extend(String moduleName, String filename) {

        String result = getModuleManFilePath(moduleName, filename);
        getFileTracker().currentTrack.extensionFile(result);
        return result;
    }

    /**
     * Determine the filepath for manual maintained sources or resources, based on the given fileName and moduleName. E.g. <br>
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
            result = prefix + ProjectProperties.getSrcManPath() + "/" + fileName;
        } else if (fileName.equals("pom.xml")) { // always in root of module
            result = prefix + fileName;
        } else {
            result = prefix + ProjectProperties.getResourceManPath() + "/" + fileName;
        }
        return result;
    }
    
    static public void generatedFile(String fileName) {
    	getFileTracker().currentTrack.generatedFile(fileName);
    }
}
