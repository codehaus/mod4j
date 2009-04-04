package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.resources.StyleSheetReference;

public abstract class BasePage extends WebPage {

	public BasePage() {
		add(new StyleSheetReference("stylesheet", BaseAppPage.class,
				"../stylesheet/breakfast.css"));
	}

}
