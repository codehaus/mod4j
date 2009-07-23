/*
 * Created on Jan 19, 2004
 *
 * (c) Copyright 2004, Klasse Obejcten
 */
package com.klasse.tools.xml;

import java.util.Iterator;
import java.util.List;

import org.jdom.Element;

public class XmlWalker {

	static public void walk(Element element, IXmlVisitor visitor) {
		visitor.visitBefore(element);
		
		Iterator atts = element.getAttributes().iterator();
		List chs = element.getChildren();
		Iterator it = chs.iterator();
		while( it.hasNext()){
			Element child = (Element)it.next();
			walk(child, visitor);
		}
		visitor.visitAfter(element);
	}
}