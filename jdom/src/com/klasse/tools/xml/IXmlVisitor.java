/*b
 * Created on 25-mei-2004
 *
 * Copyright Klasse Objecten
 */
package com.klasse.tools.xml;
import org.jdom.Element;

/**
 * IXmlVisitor : 
 */
public interface IXmlVisitor {

	public void visitBefore(Element e);
	public void visitAfter(Element e);
	
//	public void visitAttribute(Attribute a); 
//	public void visitAfterAttributes(Element e);
}
