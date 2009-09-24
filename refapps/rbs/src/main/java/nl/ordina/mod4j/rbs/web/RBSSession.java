package nl.ordina.mod4j.rbs.web;

import java.util.Locale;


import org.apache.wicket.Request;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebSession;


public class RBSSession extends WebSession
{
	private static final long serialVersionUID = 1L;
	//session is to be serialized, so don't declare a dao as property

	public RBSSession(Request request)
	{
		super(request);
		setLocale(Locale.ENGLISH);
	}

	public static RBSSession getXDSLSession()
	{
		return (RBSSession)Session.get();
	}
}
