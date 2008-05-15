package org.mod4j.common.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

/**
 * Interceptor class to inject logging / tracing.
 * 
 * @author Philippe Tjon-a-Hen
 * 
 */
public class LoggingAspect implements Ordered {

	private final static Log log = LogFactory.getLog(LoggingAspect.class);

	public Object log(ProceedingJoinPoint call) throws Throwable {
		log.trace("Entering method [" + call.getTarget().getClass().getName()
				+ "." + call.getSignature().getName() + "]");
		Object point = call.proceed();
		log.trace("Exiting method [" + call.getTarget().getClass().getName()
				+ "." + call.getSignature().getName() + "]");
		return point;
	}

	private int order;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
