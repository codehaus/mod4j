package nl.ordina.mod4j.rbs.web.pages.exception;

import javax.servlet.http.HttpServletResponse;


import nl.ordina.mod4j.rbs.web.RBSApplication;
import nl.ordina.mod4j.rbs.web.pages.home.HomePage;
import nl.ordina.mod4j.rbs.web.panels.HTMLHeader;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;


public class PageNotFoundPage extends WebPage
{

	public PageNotFoundPage()
	{
		add(new HTMLHeader("htmlHeader"));
		add(new BookmarkablePageLink("logo",RBSApplication.get().getHomePage()));
		add(new BookmarkablePageLink("home",RBSApplication.get().getHomePage()));
	}

	@Override
	protected void configureResponse()
	{
		super.configureResponse();
		getWebRequestCycle().getWebResponse().getHttpServletResponse().setStatus(HttpServletResponse.SC_NOT_FOUND);
	}

	@Override
	public boolean isVersioned()
	{
		return false;
	}

	@Override
	public boolean isErrorPage()
	{
		return true;
	}

}
