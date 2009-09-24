package nl.ordina.mod4j.rbs.web.pages.exception;

import java.io.PrintWriter;
import java.io.StringWriter;


import nl.ordina.mod4j.rbs.web.RBSApplication;
import nl.ordina.mod4j.rbs.web.pages.home.HomePage;
import nl.ordina.mod4j.rbs.web.panels.HTMLHeader;

import org.apache.wicket.authorization.UnauthorizedActionException;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.protocol.http.PageExpiredException;


public class ExceptionPage extends WebPage
{
	private String title;
	private String msg;
	private boolean showStackTrace;
	private String stackTrace;

	public ExceptionPage(RuntimeException e)
	{
		add(new HTMLHeader("htmlHeader"));
		add(new BookmarkablePageLink("logo",RBSApplication.get().getHomePage()));
		//FIXME create link in message
		add(new BookmarkablePageLink("home",RBSApplication.get().getHomePage()));
		if (e instanceof PageExpiredException)
		{
			title = getLocalizer().getString("pageExpired.title",this);
			msg = getLocalizer().getString("pageExpired.msg",this);
		}
		else if(e instanceof UnauthorizedActionException)
		{
			title = getLocalizer().getString("unauthorizedAction.title",this);
			msg = getLocalizer().getString("unauthorizedAction.msg",this);
		}
		else
		{
			title = getLocalizer().getString("error.title",this);
			msg = getLocalizer().getString("error.msg",this);
			showStackTrace = RBSApplication.DEVELOPMENT.equalsIgnoreCase(getApplication().getConfigurationType());
		}
		add(new Label("title",title));
		add(new Label("msg",msg));
		//add(new Label("message",e.getMessage()));
		if (showStackTrace)
		{
			StringWriter sw = new StringWriter();
			e.printStackTrace(new PrintWriter(sw));
			stackTrace = sw.getBuffer().toString();
		}
		add(
			new Label("stackTrace",stackTrace)
				.setVisible(showStackTrace)
		);
	}

}
