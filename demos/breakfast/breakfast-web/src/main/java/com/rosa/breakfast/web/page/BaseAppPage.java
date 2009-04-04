package com.rosa.breakfast.web.page;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

import com.rosa.breakfast.web.session.BreakfastSession;

/**
 * Basepage is divided in a header, a body and a footer
 */
public abstract class BaseAppPage extends BasePage {

	public static final Log log = LogFactory.getLog(BaseAppPage.class);

	public BaseAppPage() {

		// // check of de gebruiker is ingelogd
		// if (((BreakfastSession) getSession()).getGebruiker() == null) {
		// // EERST inloggen!
		// setRedirect(true);
		// setResponsePage(Login.class);
		// } else {
		// pagina();
		// }

	}

	private void pagina() {
		Link logoutLink = new Link("menuItemLogout") {

			@Override
			public void onClick() {
				// ((BreakfastSession) getSession()).setGebruiker(null);
				getSession().invalidateNow();
//				setResponsePage(Login.class);
			}

		};
		/*
		 * Moet afhankelijk worden van de gebruikersrol van aanmelden binnen het
		 * systeem
		 */
		// add(new Label("menuItemAfdeling", "Afdelingen"));
		// add(new Label("menuItemBeheerAfdelingStructuur", "Structuur"));
		// add(new Label("menuItemCollegasProfielBekijken",
		// "Profiel bekijken"));
		// add(new Label("menuItemAfdelingBeheren", "Beheren"));
		// add(new Label("menuItemCompetentieGroepen", "Competentiegroepen"));
		// add(new Label("menuItemCompetenties", "Competenties"));
		// add(new Label("menuItemListAspecten", "Aspecten"));
		// add(new Label("menuItemBeheerCompetentieStructuur",
		// "Beheer Competentie structuur"));
		// add(new Label("menuItemFuncties", "Functies"));
		// add(new Label("menuItemMedewerkers", "Medewerkers"));
		// add(new Label("menuItemNormProfielBeheren", "Normprofiel Beheren"));
		// add(new Label("menuItemNormProfiel", "Raadplegen normprofiel"));
		// add(new Label("menuProfielGoedkeuren", "Profiel goedkeuren"));
		// add(new Label("menuItemManager", "Managers"));
		add(logoutLink);

	}
}
