/**
 * 
 */
package org.mod4j.common.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author Eric Jan Malotaux
 */
public class RegExpValidator implements Validator {

    private String field;

    private String regExp;

    private Class clazz;

    /**
     * @param field
     * @param max
     */
    public RegExpValidator(Class clazz, String field, String regExp) {
        this.clazz = clazz;
        this.field = field;
        this.regExp = regExp;
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public boolean supports(Class clazz) {
        return this.clazz.isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    public void validate(Object target, Errors errors) {
        
        String value = (String) errors.getFieldValue(field);
        if (value != null) {
            
            if (!value.matches(regExp)) {
                errors.rejectValue(field, "field.regexp.match", new String[] { value, regExp },
                        field + " with value '"  + value + "' does not match regular expression " + regExp);
            }
        }
    }

}
