package org.mod4j.common.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

/**
 * Aspect to trace the time a method call has taken to complete.
 * 
 * @author Philippe Tjon-a-Hen
 */
public class TimingAspect implements Ordered {
    private final static Log log = LogFactory.getLog(TimingAspect.class);

    public Object time(ProceedingJoinPoint call) throws Throwable {
        long startTimer = System.currentTimeMillis();
        Object point = call.proceed();
        log.trace("Execution of method [" + call.getTarget().getClass().getName() + "." + call.getSignature().getName()
                + "] in " + (System.currentTimeMillis() - startTimer) + " milliseconds");
        return point;
    }

    private int order;

    /**
     * {@inheritDoc}
     */
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

}
