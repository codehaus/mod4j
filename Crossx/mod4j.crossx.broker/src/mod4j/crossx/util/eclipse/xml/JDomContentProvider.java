package mod4j.crossx.util.eclipse.xml;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.jdom.Element;

/*
 * Created on May 21, 2004
 *
 * Copyright Klasse Objecten
 */

/**
 * JDomContentProvider : 
 */
public class JDomContentProvider implements  ITreeContentProvider
{
  public Object[] getChildren(Object element)
  {
	Element elem = (Element)element;
	
	Object[] kids = ((Element) element).getChildren().toArray();
	Object[] result = kids == null ? new Object[0] : kids;

	for( Object child : elem.getChildren() ){
		Element e = (Element)child;
		
	}
	
	return result;
  }

  public Object[] getElements(Object element)
  {
	return getChildren(element);
  }

  public boolean hasChildren(Object element)
  {
	return getChildren(element).length > 0;
  }

  public Object getParent(Object element)
  {
	return ((Element)element).getParent();
  }
  
  public void dispose()
  {
  }

  public void inputChanged(Viewer viewer, Object old_input, Object new_input)
  {
	  viewer.refresh();
  }
}
