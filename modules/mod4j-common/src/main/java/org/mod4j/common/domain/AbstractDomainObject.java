package org.mod4j.common.domain;

import java.util.LinkedList;
import java.util.List;

import org.mod4j.common.validation.BusinessRuleValidationTemplate;
import org.springframework.validation.Validator;

/**
 * The first reason to introduce this class is to provide a generic
 * {@link #validate} method for all domain objects.
 * 
 * @author Eric Jan Malotaux
 * 
 */
public abstract class AbstractDomainObject {
    protected List<Validator> validators = new LinkedList<Validator>();
    protected final BusinessRuleValidationTemplate validationTemplate = new BusinessRuleValidationTemplate(
            this);

    public void addValidator(Validator validator) {
        if (!validators.contains(validator)) {
            validators.add(validator);
        }
    }

    protected void validate() throws RuntimeException {
        validationTemplate.invokeValidators(validators);
    }

}
