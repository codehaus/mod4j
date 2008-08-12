/*
 * Copyright Klasse Objecten
 * Created on Nov 16, 2004
 *
 */
package org.mod4j.dslcommon.io;

import java.io.File;

/**
 * @author anneke
 *
 */
public class DirectoryVisitorImpl implements IDirectoryVisitor {

	/* (non-Javadoc)
	 * @see nl.klasse.tools.IDirectoryVisitor#visitDirectoryBefore(java.io.File)
	 */
	public Object visitDirectoryBefore(File directory) {
//		assert directory.exists() 		: "visitDirectoryBefore: directory does not exists.";
//		assert directory.isDirectory() 	: "visitDirectoryBefore: parameter is not a directory.";
		System.out.println("visited " + directory.getPath());
		return null;
	}

	/* (non-Javadoc)
	 * @see nl.klasse.tools.IDirectoryVisitor#visitDirectoryAfter(java.io.File)
	 */
	public Object visitDirectoryAfter(File directory) {
//		assert directory.exists() 		: "visitDirectoryAfter: directory does not exists.";
//		assert directory.isDirectory() 	: "visitDirectoryAfter: parameter is not a directory.";
		System.out.println("visited " + directory.getPath());
		return null;
	}

	/* (non-Javadoc)
	 * @see nl.klasse.tools.IDirectoryVisitor#visitFile(java.io.File)
	 */
	public Object visitFile(File file) {
//		assert file.exists() : "visitFile: file does not exists.";
//		assert file.isFile() : "visitFile: parameter is not a file.";
		System.out.println("visited " + file.getPath());
		return null;
	}

}
