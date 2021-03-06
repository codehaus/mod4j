package org.company.recordshop.business.recordshopcore.domain;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Test;

public class ToStringTest {

    @Test
    public void testToString() {
        Customer customer = new Customer("Ludwig", "Wittgenstein", new DateTime(1889, 4, 26, 1, 1, 1, 1,
                DateTimeZone.UTC), 1);
        customer.setDiscountPercentage(17);
        customer.setEmailAddress("Ludwig.Wittgenstein@mod4j.org");
        customer.setNumberOfEars(3);
        customer.setSexe(SexeEnum.MALE);
        customer.setUsername("lwittgen");
        customer.addToOrders(new Order("1"));

        assertEquals("org.company.recordshop.business.recordshopcore.domain.Customer[id=null," + "version=-1," + "firstName=Ludwig,"
                + "lastName=Wittgenstein," + "birthDate=1889-04-26T01:01:01.001Z," + "numberOfEars=3," + "sexe=MALE,"
                + "customerNr=1," + "username=lwittgen," + "emailAddress=Ludwig.Wittgenstein@mod4j.org,"
                + "blackListed=false,discountPercentage=17]", customer.toString());
    }

}
