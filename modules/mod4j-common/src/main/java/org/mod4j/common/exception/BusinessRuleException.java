package org.mod4j.common.exception;


/**
 * Thrown when a business rule exception is violated. Attribute constraints are
 * also considered business rules.
 * 
 * @author Eric Jan Malotaux
 * 
 */
public class BusinessRuleException extends RuntimeException {

    public BusinessRuleException() {
        super();
    }

    public BusinessRuleException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessRuleException(String message) {
        super(message);
    }

    public BusinessRuleException(Throwable cause) {
        super(cause);
    }

}
