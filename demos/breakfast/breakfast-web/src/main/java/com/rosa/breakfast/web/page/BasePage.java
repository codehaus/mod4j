package com.rosa.breakfast.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.resources.StyleSheetReference;

public abstract class BasePage extends WebPage {

	public BasePage() {
		// add(new StyleSheetReference("stylesheet", BaseAppPage.class,
		// "../stylesheet/breakfast.css"));
		add(new StyleSheetReference("stylesheet1", BaseAppPage.class,
				"../stylesheet/maven-base.css"));
		add(new StyleSheetReference("stylesheet2", BaseAppPage.class,
				"../stylesheet/maven-theme.css"));
		add(new StyleSheetReference("stylesheet3", BaseAppPage.class,
				"../stylesheet/site.css"));
	}

}
