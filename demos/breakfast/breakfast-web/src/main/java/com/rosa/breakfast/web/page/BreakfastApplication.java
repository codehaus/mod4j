package com.rosa.breakfast.web.page;

import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.spring.SpringWebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import com.rosa.breakfast.web.session.BreakfastSession;

/**
 * Application object for the web application.
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
     * @see org.apache.wicket.Application#getHomePage()
     */
    public Class<? extends BaseAppPage> getHomePage() {
        return ListStandardBreakfast.class;
    }

}
