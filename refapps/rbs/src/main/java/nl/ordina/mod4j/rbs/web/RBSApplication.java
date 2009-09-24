package nl.ordina.mod4j.rbs.web;

import nl.ordina.mod4j.rbs.web.pages.exception.PageNotFoundPage;
import nl.ordina.mod4j.rbs.web.pages.home.HomePage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.wicket.Request;
import org.apache.wicket.RequestCycle;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebRequest;
import org.apache.wicket.protocol.http.WebResponse;
import org.apache.wicket.request.target.coding.HybridUrlCodingStrategy;
import org.apache.wicket.spring.SpringWebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.lang.PackageName;


public class RBSApplication extends SpringWebApplication
{
	private static final Log log = LogFactory.getLog(RBSApplication.class);

	public RBSApplication()
	{
	}

	public void init()
	{
		super.init();
		addComponentInstantiationListener(new SpringComponentInjector(this));
		mount(new HybridUrlCodingStrategy("/404",PageNotFoundPage.class));
		mount("/pages",PackageName.forPackage(HomePage.class.getPackage()));
	}

	@Override
	public Session newSession(Request request, Response response)
	{
		return new RBSSession(request);
	}

	@Override
	public final RequestCycle newRequestCycle(final Request request, final Response response)
	{
		return new RBSRequestCycle(this,(WebRequest)request,(WebResponse)response);
	}
	
	public Class<HomePage> getHomePage()
	{
		return HomePage.class;
	}

}
