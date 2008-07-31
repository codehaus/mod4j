package mod4j.crossx.broker.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.ui.console.MessageConsoleStream;
import org.jdom.Document;
import org.jdom.Element;

import crossx.util.EclipseUtil;

/** This class is a singleton with static members only.
 *  It keeps all cross reference information for DSL models 
 * 
 * @author jwa11799
 *
 */
public class CrossxRepository {

	private static final String TYPE_ATTRIBUTE = "elemType";
	private static final String NAME_ATTRIBUTE = "name";
	private static final String RESOURCE_ATTRIBUTE = "resource";
	private static final String MODEL_REFERENCE = "ModelReference";
	static private List<Element> info = new ArrayList<Element>();
	static private Document all = new Document(new Element("ROOT"));

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
		String  newResource = newInfo.getChild(MODEL_REFERENCE).getAttributeValue(RESOURCE_ATTRIBUTE);
		for(Element modelinfo : info){
			String resource = modelinfo.getChild(MODEL_REFERENCE).getAttributeValue(RESOURCE_ATTRIBUTE);
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
				print("    XML [" + child.getAttributeValue(NAME_ATTRIBUTE) + "]");
			}

		}
	}

	/** Find the symbol with name 'name' and type 'type'.
	 * 
	 * @param name
	 * @param elemType
	 * @return The name of the resource if the element is found, null if it isn't found
	 */
	static public String find(String name, String elemType) {
		checkCrossxStatus();
		for(Element modelinfo : info){
			for(Object elem : modelinfo.getChildren() ){
				if( elem instanceof Element) {
					Element e = (Element) elem;
					if( e.getAttributeValue(NAME_ATTRIBUTE    ).equals(name) && 
						e.getAttributeValue(TYPE_ATTRIBUTE).equals(elemType) )
					{
						Element modelref = modelinfo.getChild(MODEL_REFERENCE);
						String result = modelref.getAttributeValue(RESOURCE_ATTRIBUTE);
						return result;
					}
				}
			}
		}
		return null;
	}

	/**  Find all symbols of type 'elemType'.
	 * 
	 * @param elemType
	 * @return The list of names (String) of all found symbols. If there is no such symbol, an empty list.
	 */
	static public List<String> findAll(String elemType) {
		checkCrossxStatus();
		List<String> result = new ArrayList<String>();
		for(Element modelinfo : info){
			for(Object elem : modelinfo.getChildren() ){
				if( elem instanceof Element) {
					Element e = (Element) elem;
					String value = e.getAttributeValue(TYPE_ATTRIBUTE);
					if( (value != null) && value.equals(elemType) )
					{
						result.add(e.getAttributeValue(NAME_ATTRIBUTE));
					} else {
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

	/** Print to the eclipse console
	 * 
	 * @param text
	 */
	private static void print(String text){
		if( console == null ){
			console= EclipseUtil.findConsole("crossx.console");
		}
		console.println(text);
	}
}
