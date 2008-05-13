package nl.ordina.innovation.architecture.forum.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

/**
 * Interceptor class to inject logging / tracing
 * 
 * @author ordina
 * 
 */
public class LoggingAspect implements Ordered {

    private static Log log = LogFactory.getLog(LoggingAspect.class);

    public Object log(ProceedingJoinPoint call) throws Throwable {
        log.info("entering method [" + call.getTarget().getClass().getName() + "." + call.getSignature().getName()
                + "]");
        Object point = call.proceed();
        log
                .info("exiting method [" + call.getTarget().getClass().getName() + "." + call.getSignature().getName()
                        + "]");
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
