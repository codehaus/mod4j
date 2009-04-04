package com.rosa.breakfast.web.session;

import org.apache.wicket.Request;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebSession;

/**
 * Session class to store objects used in various requests
 */
public final class BreakfastSession extends WebSession {

	private static final long serialVersionUID = 1L;

	// Constructor aangeroepen vanuit de Application
	public BreakfastSession(Request request) {
		super(request);
	}

	public static BreakfastSession get() {
		return (BreakfastSession) Session.get();
	}

}
