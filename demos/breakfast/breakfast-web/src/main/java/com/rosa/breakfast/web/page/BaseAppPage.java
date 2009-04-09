package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.resources.StyleSheetReference;

/**
 * Basepage is divided in a header, a body and a footer
 */
public abstract class BaseAppPage extends WebPage {

	public BaseAppPage() {
		// add(new StyleSheetReference("stylesheet", BaseAppPage.class,
		// "../stylesheet/breakfast.css"));
		add(new StyleSheetReference("stylesheet1", BaseAppPage.class,
				"../stylesheet/maven-base.css"));
		add(new StyleSheetReference("stylesheet2", BaseAppPage.class,
				"../stylesheet/maven-theme.css"));
		add(new StyleSheetReference("stylesheet3", BaseAppPage.class,
				"../stylesheet/site.css"));

		add(new Label("menuItemListStandardBreakfast", "Standard breakfasts"));
		add(new Label("menuItemListComestible", "Comestibles"));
	}

}
