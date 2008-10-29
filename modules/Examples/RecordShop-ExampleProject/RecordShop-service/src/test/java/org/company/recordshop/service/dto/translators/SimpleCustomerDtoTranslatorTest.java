package org.company.recordshop.service.dto.translators;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.SexeEnumDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.junit.Test;
import org.mod4j.runtime.exception.TranslatorException;

public class SimpleCustomerDtoTranslatorTest {

    private SimpleCustomerDtoTranslator scTranslator = SimpleCustomerDtoTranslator.getInstance();

    @Test
    public void testCreateNewFromDtoSucceed() {

        SimpleCustomerDto simpleCust = new SimpleCustomerDto();
        simpleCust.setFirstName("Vincent");
        simpleCust.setLastName("Van Gogh");
        simpleCust.setCustomerNr(1234);
        simpleCust.setSexe(SexeEnumDto.MALE);

        OrderNumberAndDateDto orderDto = new OrderNumberAndDateDto();
        orderDto.setCustomer(simpleCust);

        simpleCust.addToOrders(orderDto);

        try {
            Customer newCust = scTranslator.fromDto(simpleCust, null);
            assertTrue("Firstname of Customer should be Vincent.", newCust.getFirstName().equals("Vincent"));
            assertTrue("CustomerNr should be 1234", newCust.getCustomerNr() == 1234);
            assertTrue("Associations dto's in dto's are not translated so Orders should be empty.", newCust.getOrders()
                    .isEmpty());
        } catch (TranslatorException e) {
            fail("Did not expected to catch a TranslatorMisMatchException. Message :" + e.getMessage());
        }

    }

    @Test
    public void testCreateNewFromDtoFail() {

        SimpleCustomerDto simpleCust = new SimpleCustomerDto();
        simpleCust.setFirstName("Vincent");
        simpleCust.setLastName("Van Gogh");
        simpleCust.setCustomerNr(1234);
        simpleCust.setSexe(SexeEnumDto.MALE);

        OrderNumberAndDateDto orderDto = new OrderNumberAndDateDto();
        orderDto.setCustomer(simpleCust);

        simpleCust.addToOrders(orderDto);

        try {
            Customer newCust = scTranslator.fromDto(null, null);
            fail("Did not expected to succesfull translate a null dto!");
        } catch (TranslatorException te) {
            assertTrue("Firstname of Customer should be Vincent.", te.getMessage().contains(
                    "Argument source is null! Translation of a dto can not be based on a null dto."));
        }

    }

    @Test
    public void testToDtoBiderectionalSucceed() {

        Customer cust = new Customer("Herman", "Bread", 4321);
        Order order = new Order("1111");
        cust.addToOrders(order);

        SimpleCustomerDto customerDto = scTranslator.toDto(cust);

        assertTrue("CustomerNr must be eqaul to 4321", customerDto.getCustomerNr() == 4321);
        assertTrue("", customerDto.getOrders().isEmpty() == false);
        for (OrderNumberAndDateDto orderDto : customerDto.getOrders()) {
            assertTrue("OrderNr must be equal to '1111'", orderDto.getOrderNumber().equals("1111"));
        }
    }

}
