/*
 * Copyright Klasse Objecten
 * Created on Nov 16, 2004
 *
 */
package org.mod4j.dslcommon.io;

import java.io.File;

/**
 * 
 * @author anneke
 * 
 */
public interface IDirectoryVisitor {

    public Object visitDirectoryBefore(File directory);

    public Object visitDirectoryAfter(File directory);

    public Object visitFile(File file) throws Exception;

}
