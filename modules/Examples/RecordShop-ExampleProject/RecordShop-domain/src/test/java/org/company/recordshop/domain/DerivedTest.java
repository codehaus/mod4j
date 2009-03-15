package org.company.recordshop.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Test;

public class DerivedTest {

    @Test
    public void testSetFirst() {
        Derived derived = new Derived();
        derived.setFirst("first");
    }

    @Test
    public void testSetSecondo() {
        Derived derived = new Derived();
        derived.setSecondo(true);
    }

    @Test
    public void testSetThird() {
        Derived derived = new Derived();
        derived.setThird(new DateTime());
    }

    @Test
    public void testSetFourth() {
        Derived derived = new Derived();
        derived.setFourth(4);
    }

    @Test
    public void testSetFifth() {
        Derived derived = new Derived();
        derived.setFifth(5.0F);
    }

    @Test
    public void testGetFirst() {
        Derived derived = new Derived();
        assertEquals("first", derived.getFirst());
    }

    @Test
    public void testIsSecondo() {
        Derived derived = new Derived();
        assertTrue(derived.isSecondo());
    }

    @Test
    public void testGetThird() {
        Derived derived = new Derived();
        assertEquals(new DateTime(3), derived.getThird());
    }

    @Test
    public void testGetFourth() {
        Derived derived = new Derived();
        assertEquals(Integer.valueOf(4), derived.getFourth());
    }

    @Test
    public void testGetFifth() {
        Derived derived = new Derived();
        assertEquals(5.0F, derived.getFifth(), 0.000000001);
    }

}
