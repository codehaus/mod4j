package nl.ordina.innovation.architecture.forum.aspects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.core.Ordered;

public class TimingAspect implements Ordered{
    private static Log log = LogFactory.getLog(TimingAspect.class);

    public Object time(ProceedingJoinPoint call) throws Throwable {
        long startTimer = System.currentTimeMillis();
        Object point = call.proceed();
        log.info("execution of method [" + call.getTarget().getClass().getName() + "." + call.getSignature().getName()
                + "] in " + (System.currentTimeMillis() - startTimer) + " mils.");
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
