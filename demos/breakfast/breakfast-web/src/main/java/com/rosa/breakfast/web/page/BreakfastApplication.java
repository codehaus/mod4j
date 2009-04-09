package com.rosa.breakfast.web.page;

import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.spring.SpringWebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import com.rosa.breakfast.web.session.BreakfastSession;

/**
 * Application object for the web application.
 */
public class BreakfastApplication extends SpringWebApplication {

	/**
	 * Constructor
	 */
	public BreakfastApplication() {
	}

	/**
	 * Annotated dependencies automatisch geinjecteerd tijdens object.
	 */
	@Override
	public void init() {
		super.init();
		addComponentInstantiationListener(new SpringComponentInjector(this));
	}

	/**
	 * Maak een eigen session object beschikbaar in de appl
	 */
	@Override
	public final Session newSession(Request request, Response response) {
		return new BreakfastSession(request);
	}

	/**
	 * @see wicket.Application#getHomePage()
	 */
	public Class<? extends BaseAppPage> getHomePage() {
		return ListStandardBreakfast.class;
	}

}
