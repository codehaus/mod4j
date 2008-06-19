package org.mod4j.common.jmx;

/**
 * Log4JMBean interface.
 * 
 * @author Philippe Tjon-a-Hen
 * 
 */
public interface Log4jMBean {
    /**
     * Set the log level of the specified logging categorie to <code>trace</code>.
     * 
     * @param category
     */
    void activateTrace(String category);

    /**
     * Set the log level of the specified logging categorie to <code>info</code>.
     * 
     * @param category
     */
    void activateInfo(String category);

    /**
     * Set the log level of the specified logging categorie to <code>debug</code>.
     * 
     * @param category
     */
    void activateDebug(String category);

    /**
     * Set the log level of the specified logging categorie to <code>warn</code>.
     * 
     * @param category
     */
    void activateWarn(String category);

    /**
     * Set the log level of the specified logging categorie to <code>error</code>.
     * 
     * @param category
     */
    void activateError(String category);

    /**
     * Set the log level of the specified logging categorie to <code>fatal</code>.
     * 
     * @param category
     */
    void activateFatal(String category);

}
