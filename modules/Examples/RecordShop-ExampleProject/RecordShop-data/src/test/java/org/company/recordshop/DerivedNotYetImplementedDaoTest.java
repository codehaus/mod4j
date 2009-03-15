package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.company.recordshop.data.DerivedNotYetImplementedDao;
import org.company.recordshop.domain.DerivedNotYetImplemented;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class DerivedNotYetImplementedDaoTest extends AbstractDaoTestCase {

    @Autowired
    private DerivedNotYetImplementedDao dao;

    DerivedNotYetImplemented read;

    @Before
    public void setUp() {
        DerivedNotYetImplemented derived = dao.add(new DerivedNotYetImplemented());
        flush();
        clear();
        read = dao.retrieve(derived.getId());
    }

    @Test
    public void testGetFirst() {
        try {
            read.getFirst();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetSecondo() {
        try {
            read.isSecondo();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetThird() {
        try {
            read.getThird();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetFourth() {
        try {
            read.getFourth();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testGetFifth() {
        try {
            read.getFifth();
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetFirst() {
        try {
            read.setFirst("first");
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetSecondo() {
        try {
            read.setSecondo(true);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetThird() {
        try {
            read.setThird(new DateTime());
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetFourth() {
        try {
            read.setFourth(4);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }

    @Test
    public void testSetFifth() {
        try {
            read.setFifth(5.0F);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            assertEquals("Not implemented", e.getMessage());
        }
    }
}
