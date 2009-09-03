package com.rosa.breakfast.web;

import org.apache.wicket.Request;
import org.apache.wicket.RequestCycle;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebRequest;
import org.apache.wicket.protocol.http.WebResponse;
import org.apache.wicket.spring.SpringWebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import com.rosa.breakfast.web.page.BaseAppPage;
import com.rosa.breakfast.web.page.ListStandardBreakfast;

/**
 * Application object for the web application.
 * 
 */
/**
 * @author pbo13788
 * 
 */
public class BreakfastApplication extends SpringWebApplication {

    public BreakfastApplication() {
    }

    /**
     * @see org.apache.wicket.protocol.http.WebApplication#init()
     */
    @Override
    public void init() {
        super.init();
        // disable Wicket Ajax Debug mode
        getDebugSettings().setAjaxDebugModeEnabled(false);
        addComponentInstantiationListener(new SpringComponentInjector(this));
    }

    /**
     * @see org.apache.wicket.protocol.http.WebApplication#newSession(org.apache.wicket.Request,
     *      org.apache.wicket.Response)
     */
    @Override
    public final Session newSession(Request request, Response response) {
        return new BreakfastSession(request);
    }

    /**
     * @see org.apache.wicket.protocol.http.WebApplication#newRequestCycle(org.apache.wicket.Request,
     *      org.apache.wicket.Response)
     */
    @Override
    public RequestCycle newRequestCycle(Request request, Response response) {
        return new BusinessRuleAwareRequestCycle(this, (WebRequest) request, (WebResponse) response);
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    public Class<? extends BaseAppPage> getHomePage() {
        return ListStandardBreakfast.class;
    }

}
