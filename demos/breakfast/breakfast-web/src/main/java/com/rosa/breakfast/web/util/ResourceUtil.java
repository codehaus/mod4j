package com.rosa.breakfast.web.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.model.StringResourceModel;

public class ResourceUtil {
	private ResourceUtil(){}
	
	/**
	 * Helper methode voor meldingen in de properties files.
	 * Voorbeeld aanroep (vanuit Wicket Form): 
	 * 		error(msg("afdeling.error.addHoofdafdeling", this));
	 * 
	 * @param property	
	 * 					de string van de propertie, bv: afdeling.button.verwijderen
	 * @param component 
	 * 					relatieve component - geef <code>this</code> mee!
	 * @return 
	 * 					de melding
	 */
	public static String msg(final String property, final Component component){		
		return new StringResourceModel(property, component, null).getString();
	}
	
	/**
	 * Helper methode voor meldingen in de properties files.
	 * Voorbeeld aanroep (vanuit Wicket Form): 
	 * 		info(msg("afdeling.info.subafdelingAangemaakt", this, subAfdeling.getNaam(), selectedHoofdafdeling.getNaam()));
	 * Voorbeeld uit property-file:
	 * 		afdeling.info.subafdelingAangemaakt=Subafdeling {0} aangemaakt onder hoofdafdeling {1}
	 * 
	 * @param property
	 * 					de string van de propertie, bv: afdeling.button.verwijderen
	 * @param component
	 * 					relatieve component - geef <code>this</code> mee!
	 * @param arguments
	 * 					varargs van te renderen Strings
	 * 					1e String vervangt {0}
	 * 					2e String vervangt {1}, etc..	 * 
	 * @return
	 * 					de melding
	 */
	public static String msg(final String property, final Component component, final String...arguments ){
		List<String> args = new ArrayList<String>();
		for (String arg : arguments){
			args.add(arg);
		}
		return new StringResourceModel(property, component, null, args.toArray()).getString();
	}	
}
