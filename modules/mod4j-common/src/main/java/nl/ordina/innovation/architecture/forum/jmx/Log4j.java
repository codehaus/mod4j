package nl.ordina.innovation.architecture.forum.jmx;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;

/**
 * Log4jMBean implementatie classe.
 * 
 * @author ordina
 * 
 */
public class Log4j implements Log4jMBean {

    public Log4j() {

    }

    public void activateTrace(String category) {
        LogManager.getLogger(category).setLevel(Level.TRACE);
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.ordina.forum.jmx.Log4jMBean#activateInfo(java.lang.String)
     */
    public void activateInfo(String category) {
        LogManager.getLogger(category).setLevel(Level.INFO);
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.ordina.forum.jmx.Log4jMBean#activateDebug(java.lang.String)
     */
    public void activateDebug(String category) {
        LogManager.getLogger(category).setLevel(Level.DEBUG);
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.ordina.forum.jmx.Log4jMBean#activateWarn(java.lang.String)
     */
    public void activateWarn(String category) {
        LogManager.getLogger(category).setLevel(Level.WARN);
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.ordina.forum.jmx.Log4jMBean#activateError(java.lang.String)
     */
    public void activateError(String category) {
        LogManager.getLogger(category).setLevel(Level.ERROR);
    }

    /*
     * (non-Javadoc)
     * 
     * @see nl.ordina.forum.jmx.Log4jMBean#activateFatal(java.lang.String)
     */
    public void activateFatal(String category) {
        LogManager.getLogger(category).setLevel(Level.FATAL);
    }

}
