package org.mod4j.common.validation;

import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class BusinessRuleUtils {

    /**
     * Reject the given field if the value is empty or just contains whitespace.
     * 
     * An 'empty' value in this context means either null, the empty string "",
     * or consisting wholly of whitespace.
     * 
     * The object whose field is being validated does not need to be passed in
     * because the Errors instance can resolve field values by itself (it will
     * usually hold an internal reference to the target object).
     * 
     * @param errors
     * @param field
     */
    public static void validateEmptyOrWhitespace(Errors errors, String field) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, field,
                "field.required");
    }

    public static void validateMinLength(Errors errors, String field, int min) {
        String value = (String) errors.getFieldValue(field);
        Assert.notNull(value);
        int length = value.length();
        if (length < min) {
            errors
                    .rejectValue(field, "field.length.min", new Integer[] {
                            new Integer(min), new Integer(length) }, field
                            + " should be at least " + min + " long, but was "
                            + length);
        }
    }

    public static void validateMaxLength(Errors errors, String field, int max) {
        String value = (String) errors.getFieldValue(field);
        Assert.notNull(value);
        int length = value.length();
        if (length > max) {
            errors.rejectValue(field, "field.length.max", new Integer[] {
                    new Integer(max), new Integer(length) }, field
                    + " should be at most " + max + " long, but was " + length);
        }
    }

    public static void validateMaxValue(Errors errors, String field, long max) {
        Long value = (Long) errors.getFieldValue(field);
        Assert.notNull(value);
        if (value > max) {
            errors.rejectValue(field, "field.value.max", new Long[] {
                    new Long(max), new Long(value) }, field
                    + " should be at most " + max + ", but was " + value);
        }
    }

    public static void validateMinValue(Errors errors, String field, long min) {
        Long value = (Long) errors.getFieldValue(field);
        Assert.notNull(value);
        if (value < min) {
            errors.rejectValue(field, "field.value.min", new Long[] {
                    new Long(min), new Long(value) }, field
                    + " should be at least " + min + ", but was " + value);
        }
    }
}
