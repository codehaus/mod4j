package org.company.recordshop.service.dto;

import org.company.recordshop.business.recordshopcore.domain.Person;
import org.company.recordshop.service.dto.common.AgedPerson;
import org.company.recordshop.service.dto.common.translators.AgedPersonTranslator;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AgedPersonTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetAge() {
        AgedPersonTranslator translator = new AgedPersonTranslator();
        Person person = new Person("Bob", "the Builder", new DateTime().minusYears(10));
        Assert.assertEquals(10, person.getAge().intValue());
        AgedPerson agedPerson = translator.toDto(person);
        Assert.assertEquals(10, agedPerson.getAge().intValue());
    }

}
