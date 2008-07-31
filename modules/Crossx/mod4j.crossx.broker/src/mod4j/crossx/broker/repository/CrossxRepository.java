package mod4j.crossx.broker.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.ui.console.MessageConsoleStream;
import org.jdom.Document;
import org.jdom.Element;

import crossx.util.EclipseUtil;

public class CrossxRepository {

	static private List<Element> info = new ArrayList<Element>();
	static private Document all = new Document(new Element("ROOT"));

//	   public static String getTimestamp() {
//	        Date now = new Date(System.currentTimeMillis());
//	        return now.toString();
//	        
//	    }

	static public Element getAll(){
		return all.getRootElement();
	}
	
	/** Add all the XML elements in 'doc' to the repository.
	 *  If the repository already contains information from the same resource, remove
	 *  the old information
	 *  
	 * @param doc The XML document to add
	 */
	static public void addInfo(Document doc) {
		print("Repository add [" + doc.getRootElement().toString() + "]");
		Element toRemove = null;

		Element newInfo     = doc.getRootElement();
		String  newResource = newInfo.getChild("ModelReference").getAttributeValue("resource");
		for(Element modelinfo : info){
			String resource = modelinfo.getChild("ModelReference").getAttributeValue("resource");
			if( resource.equals(newResource) ){
				toRemove = modelinfo;
				print("CrossxRepository: remove [" + resource + "]");
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
	
	public static void printXML() {
		print("XML [" + all.getRootElement().getName()+ "]");
		for( Object o : all.getRootElement().getChildren()) {
			Element e = (Element)o;
			print("    XML [" + e.getName() + "]");
			for( Object ch : e.getChildren()) {
				Element child = (Element)ch;
				print("    XML [" + child.getAttributeValue("name") + "]");
			}

		}
	}
	
	static public String find(String name, String elemType) {
		checkCrossxStatus();
//		print("CROSSX find: [" + CrossxRepository.class.getClassLoader().toString() + "]");
//		print("CROSSX find: [" + name + "] [" + elemType + "]");
		for(Element modelinfo : info){
//			print("CROSSX FIND modelinfo");
			for(Object elem : modelinfo.getChildren() ){
				if( elem instanceof Element) {
					Element e = (Element) elem;
//					print("CROSSX FIND child [" + elem.toString() + "]");
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

	static public List<String> findAll(String elemType) {
		checkCrossxStatus();
//		print("CROSSX findAll: [" + CrossxRepository.class.getClassLoader().toString() + "]");
//		print("CROSSX findAll: [" + elemType + "]");
		List<String> result = new ArrayList<String>();
		for(Element modelinfo : info){
//			print("CROSSX modelinfo");
			for(Object elem : modelinfo.getChildren() ){
//				print("CROSSX child [" + elem.toString() + "]");
				if( elem instanceof Element) {
					Element e = (Element) elem;
//					print("CROSSX element [" + e.getName() + "]");
					String value = e.getAttributeValue("elemType");
					if( (value != null) && value.equals(elemType) )
					{
//						print("CROSSX found: [" + e.getAttributeValue("name") + "]");
						result.add(e.getAttributeValue("name"));
					} else {
//						print("CROSSX NOT found: [" + e.getAttributeValue("name") + "]");						
					}
				}
			}
		}
		return result;
	}

	static boolean first = true;
	
	private static void checkCrossxStatus() {
		print("checkCrossxStatus");
		if( first ){
			first = false;
		} else {
			return;
		}
	}
	private static MessageConsoleStream console;

	private static void print(String text){
		if( console == null ){
			console= EclipseUtil.findConsole("crossx.console");
		}
		console.println(text);
	}
}
