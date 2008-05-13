package nl.ordina.innovation.architecture.forum.validation;

import org.springframework.validation.Errors;

public interface BusinessRuleValidationCallback {
    void doValidate(Object object, Errors errors);
}
