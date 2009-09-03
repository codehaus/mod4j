package com.rosa.breakfast.web;

import java.lang.reflect.InvocationTargetException;

import org.apache.wicket.Page;
import org.apache.wicket.Response;
import org.apache.wicket.WicketRuntimeException;
import org.apache.wicket.model.StringResourceModel;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WebRequest;
import org.apache.wicket.protocol.http.WebRequestCycle;
import org.mod4j.runtime.exception.BusinessRuleException;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;

public class BusinessRuleAwareRequestCycle extends WebRequestCycle {

    public BusinessRuleAwareRequestCycle(WebApplication application, WebRequest request, Response response) {
        super(application, request, response);
    }

    @Override
    public Page onRuntimeException(Page page, RuntimeException e) {
        Throwable cause = e;
        if (cause instanceof WicketRuntimeException)
            cause = cause.getCause();
        if (cause instanceof InvocationTargetException)
            cause = cause.getCause();
        if (cause instanceof BusinessRuleException) {
            BindException errors = (BindException) cause.getCause();
            for (Object obj : errors.getAllErrors()) {
                ObjectError objerr = (ObjectError) obj;
                page.error(new StringResourceModel(objerr.getCode(), page, null, objerr.getArguments()).getString());
            }
            return page;
        }
        return super.onRuntimeException(page, e);
    }
}