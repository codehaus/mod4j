/**
 * 
 */
package org.mod4j.common.validation;

import java.util.List;


import org.mod4j.common.exception.BusinessRuleException;
import org.springframework.util.ClassUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 * 
 */
public class BusinessRuleValidationTemplate {
    private Object object;

    public BusinessRuleValidationTemplate(Object object) {
        this.object = object;
    }

    public void validateEmptyOrWhitespace(final String field) {
        execute(new BusinessRuleValidationCallback() {
            public void doValidate(Object object, Errors errors) {
                BusinessRuleUtils.validateEmptyOrWhitespace(errors, field);
            }
        });
    }

    public void invokeValidator(final Validator validator) {
        execute(new BusinessRuleValidationCallback() {
            public void doValidate(Object object, Errors errors) {
                ValidationUtils.invokeValidator(validator, object, errors);
            }
        });
    }

    public void invokeValidators(final List<Validator> validators) {
        execute(new BusinessRuleValidationCallback() {
            public void doValidate(Object object, Errors errors) {
                for (Validator validator : validators) {
                    ValidationUtils.invokeValidator(validator, object, errors);
                }
            }
        });
    }

    public void execute(BusinessRuleValidationCallback action) {
        BindException errors = new BindException(object, ClassUtils
                .getShortNameAsProperty(object.getClass()));
        action.doValidate(object, errors);
        if (errors.hasErrors()) {
            throw new BusinessRuleException(errors);
        }
    }
}
