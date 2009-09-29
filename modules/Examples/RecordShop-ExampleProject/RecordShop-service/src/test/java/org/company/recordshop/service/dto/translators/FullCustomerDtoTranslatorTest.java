package org.company.recordshop.service.dto.translators;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.FullCustomerDto;
import org.company.recordshop.service.dto.SexeEnumDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.mod4j.runtime.exception.BusinessRuleException;
import org.mod4j.runtime.exception.TranslatorException;
import org.springframework.test.annotation.ExpectedException;

public class FullCustomerDtoTranslatorTest {

    private FullCustomerDtoTranslator scTranslator = new FullCustomerDtoTranslator();

    @Test
    public void testCreateNewFromDtoSucceed() {

        FullCustomerDto fullCustDto = new FullCustomerDto();
        fullCustDto.setFirstName("Vincent");
        fullCustDto.setLastName("Van Gogh");
        fullCustDto.setCustomerNr(1234);
        fullCustDto.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
        fullCustDto.setSexe(SexeEnumDto.MALE);

        try {
            Customer newCust = scTranslator.fromDto(fullCustDto);
            assertTrue("Firstname of Customer should be Vincent.", newCust.getFirstName().equals("Vincent"));
            assertTrue("CustomerNr should be 1234", newCust.getCustomerNr() == 1234);
            assertTrue("Associations dto's in dto's are not translated so Orders should be empty.", newCust.getOrders()
                    .isEmpty());
        } catch (TranslatorException e) {
            fail("Did not expected to catch a TranslatorMisMatchException. Message :" + e.getMessage());
        }

    }

    /**
     * Tests if translation of illegal attribute value results in an BusinessRuleExveption.
     */
    @Test
    public void testTranslateFromDtoFail() {

        FullCustomerDto fullCustDto = new FullCustomerDto();
        fullCustDto.setFirstName("Vincent");
        fullCustDto.setLastName("Van Gogh");
        fullCustDto.setCustomerNr(1234);
        fullCustDto.setBirthDate(new DateTime(2008, 1, 1, 1, 1, 0, 0));
        fullCustDto.setDiscountPercentage(-1); // Illegal

        try {
            scTranslator.fromDto(fullCustDto);
            fail("Tanslation of a illegal attirbute value should thrown a BusinessRuleException.");
        } catch (BusinessRuleException e) {
           
        }
     }
    
}
