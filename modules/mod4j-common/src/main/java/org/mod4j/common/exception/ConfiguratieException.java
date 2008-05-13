package org.mod4j.common.exception;

/**
 * Exception thrown if a configuration error occures.
 * 
 * @author ordina
 * 
 */
public class ConfiguratieException extends RuntimeException {
    /**
     * Default constructor.
     * 
     */
    public ConfiguratieException() {
        super();
    }

    /**
     * Constructs ConfiguratieException.
     * 
     * @param message
     *            foutmelding
     * @param cause
     *            bron throwable
     */
    public ConfiguratieException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs ConfiguratieException.
     * 
     * @param message
     *            foutmelding
     */
    public ConfiguratieException(String message) {
        super(message);
    }

    /**
     * Constructs ConfiguratieException.
     * 
     * @param cause
     *            bron throwable
     */
    public ConfiguratieException(Throwable cause) {
        super(cause);
    }

}
