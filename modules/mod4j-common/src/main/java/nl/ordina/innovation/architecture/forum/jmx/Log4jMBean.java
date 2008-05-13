package nl.ordina.innovation.architecture.forum.jmx;

/**
 * Log4JMBean.
 * 
 * @author ordina
 * 
 */
public interface Log4jMBean {
    void activateTrace(String category);

    void activateInfo(String category);

    void activateDebug(String category);

    void activateWarn(String category);

    void activateError(String category);

    void activateFatal(String category);

}
