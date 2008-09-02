package org.mod4j.common.validation;

import org.springframework.validation.Errors;

public interface BusinessRuleValidationCallback {
    void doValidate(Object object, Errors errors);
}
