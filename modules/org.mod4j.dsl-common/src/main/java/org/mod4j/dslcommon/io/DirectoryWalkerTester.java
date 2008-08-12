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
public class DirectoryWalkerTester {
	
	static public void main(String[] args) {
		File file = new File("E:\\");
		DirectoryWalker walker = new DirectoryWalker();
		DirectoryVisitorImpl visitor = new DirectoryVisitorImpl();
		walker.walk(file, visitor);
	}

}
