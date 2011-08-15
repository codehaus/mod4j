package org.company.recordshop.business.TestDomainModel.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.company.recordshop.business.TestDomainModel.data.DerivedDao;
import org.company.recordshop.business.data.AbstractDaoTestCase;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DerivedDaoTest extends AbstractDaoTestCase {

    @Autowired
    private DerivedDao dao;

    Derived read;

    @Before
    public void setUp() {
        Long id = dao.add(new Derived());
        flush();
        clear();
        read = dao.retrieve(id);
    }

    @Test
    public void testGetFirst() {
        assertEquals("first", read.getFirst());
    }

    @Test
    public void testGetSecondo() {
        assertTrue(read.isSecondo());
    }

    @Test
    public void testGetThird() {
        assertEquals(new DateTime(3), read.getThird());
    }

    @Test
    public void testGetFourth() {
        assertEquals(Integer.valueOf(4), read.getFourth());
    }

    @Test
    public void testGetFifth() {
        assertTrue(BigDecimal.valueOf(5.0).equals(read.getFifth()));
    }
    @Test
    public void testSetSecondo() {
        read.setSecondo(true);
    }

    @Test
    public void testSetFourth() {
        read.setFourth(4);
    }
}
