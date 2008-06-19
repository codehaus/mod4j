package mod4j.crossx.broker.repository;

import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;

public class CrossxRepository {

	static private List<Element> info = new ArrayList<Element>();
	static private Document all = new Document(new Element("ROOT"));

	static public Element getAll(){
		return all.getRootElement();
	}
	
	static public void addInfo(Document doc) {
		System.out.println("Repository add [" + doc.getRootElement().toString());
		Element toRemove = null;

		Element newInfo     = doc.getRootElement();
		String  newResource = newInfo.getChild("ModelReference").getAttributeValue("resource");
		for(Element modelinfo : info){
			String resource = modelinfo.getChild("ModelReference").getAttributeValue("resource");
			if( resource.equals(newResource) ){
				toRemove = modelinfo;
				System.out.println("CrossxRepository: remove [" + resource + "]");
			}
		}
		
		if( toRemove != null ){
			info.remove(toRemove);
			all.getRootElement().removeContent(toRemove);
		}

		info.add(newInfo);
		doc.detachRootElement();
		all.getRootElement().addContent(newInfo);
		
		printXML();
	}
	
	static void printXML() {
		System.out.println("XML [" + all.getRootElement().getName()+ "]");
		for( Object o : all.getRootElement().getChildren()) {
			Element e = (Element)o;
			System.out.println("    XML [" + e.getName() + "]");
		}
	}
	static public String find(String name, String elemType) {
		for(Element modelinfo : info){
			for(Object elem : modelinfo.getChildren() ){
				if( elem instanceof Element) {
					Element e = (Element) elem;
					if( e.getAttributeValue("name"    ).equals(name) && 
						e.getAttributeValue("elemType").equals(elemType) )
					{
						Element modelref = modelinfo.getChild("ModelReference");
						String result = modelref.getAttributeValue("resource");
						return result;
					}
				}
			}
		}
		return null;
	}
	
}
