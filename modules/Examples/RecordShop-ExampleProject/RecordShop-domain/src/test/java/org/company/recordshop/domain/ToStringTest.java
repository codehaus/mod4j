package org.company.recordshop.domain;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

public class ToStringTest {

	@Test
	public void testToString() {
		Customer customer = new Customer("Ludwig", "Wittgenstein",
				new DateTime(0L), 1);
		customer.setDiscountPercentage(17);
		customer.setEmailAddress("Ludwig.Wittgenstein@mod4j.org");
		customer.setNumberOfEars(3);
		customer.setSexe(SexeEnum.MALE);
		customer.setUsername("lwittgen");		
		customer.addToOrders(new Order("1"));
		
		assertEquals(
				"org.company.recordshop.domain.Customer[id=null," +
				"version=-1," +
				"firstName=Ludwig," +
				"lastName=Wittgenstein," +
				"birthDate=1970-01-01T01:00:00.000+01:00," +
				"numberOfEars=3," +
				"sexe=MALE," +
				"customerNr=1," +
				"username=lwittgen," +
				"emailAddress=Ludwig.Wittgenstein@mod4j.org," +
				"blackListed=false,discountPercentage=17]",
				customer.toString());
	}

}
