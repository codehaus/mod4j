package nl.ordina.mod4j.rbs.web;


import nl.ordina.mod4j.rbs.web.pages.exception.ExceptionPage;

import org.apache.wicket.Page;
import org.apache.wicket.Response;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WebRequest;
import org.apache.wicket.protocol.http.WebRequestCycle;


public class RBSRequestCycle extends WebRequestCycle
{

	public RBSRequestCycle(WebApplication application, WebRequest request, Response response)
	{
		super(application,request,response);
	}

	@Override
	public Page onRuntimeException(Page page, RuntimeException e)
	{
		return new ExceptionPage(e);
	}
}
