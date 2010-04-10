package org.mod4j.runtime.exception;

/**
 * Thrown when a dto could not be translated to- or from a business class.
 * 
 * @author Johan Vogelzang
 * 
 */
@SuppressWarnings("serial")
public class TranslatorException extends RuntimeException {

    /**
     * @param message
     *            The detail message. The detail message is saved for later retrieval by the {@link #getMessage()}
     *            method.
     */
    public TranslatorException(String message) {
        super(message);
    }
}