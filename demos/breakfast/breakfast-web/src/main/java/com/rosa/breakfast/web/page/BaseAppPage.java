package com.rosa.breakfast.web.page;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Basepage is divided in a header, a body and a footer
 */
public abstract class BaseAppPage extends BasePage {

	public static final Log log = LogFactory.getLog(BaseAppPage.class);

	public BaseAppPage() {
		pagina();
	}

	private void pagina() {
		add(new Label("menuItemListStandardBreakfast", "Standard breakfasts"));
		add(new Label("menuItemListComestible", "Comestibles"));
	}
}
