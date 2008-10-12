package org.mod4j.runtime.jmx;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;

/**
 * Log4jMBean implementation class.
 * 
 * @author Philippe Tjon-a-Hen
 */
public class Log4j implements Log4jMBean {

    public Log4j() {
    }

    public void activateTrace(String category) {
        LogManager.getLogger(category).setLevel(Level.TRACE);
    }

    /**
     * {@inheritDoc}
     */
    public void activateInfo(String category) {
        LogManager.getLogger(category).setLevel(Level.INFO);
    }

    /**
     * {@inheritDoc}
     */
    public void activateDebug(String category) {
        LogManager.getLogger(category).setLevel(Level.DEBUG);
    }

    /**
     * {@inheritDoc}
     */
    public void activateWarn(String category) {
        LogManager.getLogger(category).setLevel(Level.WARN);
    }

    /**
     * {@inheritDoc}
     */
    public void activateError(String category) {
        LogManager.getLogger(category).setLevel(Level.ERROR);
    }

    /**
     * {@inheritDoc}
     */
    public void activateFatal(String category) {
        LogManager.getLogger(category).setLevel(Level.FATAL);
    }

}
