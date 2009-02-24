package org.company.recordshop.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OrderedOneToManyAssociationTest  {

    private One2ManyFrom from;

    private One2ManyOrderedTo one, two, three;

    @Before
    public void setUp() throws Exception {
        from = new One2ManyFrom("thing");
        one = new One2ManyOrderedTo("one");
        two =new One2ManyOrderedTo("two");
        three = new One2ManyOrderedTo("three");
    }

    @Test
    public void testOrderedOneTwoThree() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedTwoThreeOne() {
        from.addToTarget(two);
        from.addToTarget(three);
        from.addToTarget(one);
        assertEquals("two", from.getTarget().get(0).getProperty());
        assertEquals("three", from.getTarget().get(1).getProperty());
        assertEquals("one", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedThreeOneTwo() {
        from.addToTarget(three);
        from.addToTarget(one);
        from.addToTarget(two);
        assertEquals("three", from.getTarget().get(0).getProperty());
        assertEquals("one", from.getTarget().get(1).getProperty());
        assertEquals("two", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedThreeTwoOne() {
        from.addToTarget(three);
        from.addToTarget(two);
        from.addToTarget(one);
        assertEquals("three", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
        assertEquals("one", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedTwoOneThree() {
        from.addToTarget(two);
        from.addToTarget(one);
        from.addToTarget(three);
        assertEquals("two", from.getTarget().get(0).getProperty());
        assertEquals("one", from.getTarget().get(1).getProperty());
        assertEquals("three", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedOneThreeTwo() {
        from.addToTarget(one);
        from.addToTarget(three);
        from.addToTarget(two);
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("three", from.getTarget().get(1).getProperty());
        assertEquals("two", from.getTarget().get(2).getProperty());
    }

    @Test
    public void testOrderedBiDirectionalOneTwoThree() {
        from.addToTargetBiDirectional(one);
        from.addToTargetBiDirectional(two);
        from.addToTargetBiDirectional(three);
        assertEquals("one", from.getTargetBiDirectional().get(0).getProperty());
        assertEquals("two", from.getTargetBiDirectional().get(1).getProperty());
        assertEquals("three", from.getTargetBiDirectional().get(2).getProperty());
    }

    @Test
    public void testOrderedBiDirectionalTwoThreeOne() {
        from.addToTargetBiDirectional(two);
        from.addToTargetBiDirectional(three);
        from.addToTargetBiDirectional(one);
        assertEquals("two", from.getTargetBiDirectional().get(0).getProperty());
        assertEquals("three", from.getTargetBiDirectional().get(1).getProperty());
        assertEquals("one", from.getTargetBiDirectional().get(2).getProperty());
    }

    @Test
    public void testOrderedBiDirectionalThreeOneTwo() {
        from.addToTargetBiDirectional(three);
        from.addToTargetBiDirectional(one);
        from.addToTargetBiDirectional(two);
        assertEquals("three", from.getTargetBiDirectional().get(0).getProperty());
        assertEquals("one", from.getTargetBiDirectional().get(1).getProperty());
        assertEquals("two", from.getTargetBiDirectional().get(2).getProperty());
    }

    @Test
    public void testOrderedBiDirectionalThreeTwoOne() {
        from.addToTargetBiDirectional(three);
        from.addToTargetBiDirectional(two);
        from.addToTargetBiDirectional(one);
        assertEquals("three", from.getTargetBiDirectional().get(0).getProperty());
        assertEquals("two", from.getTargetBiDirectional().get(1).getProperty());
        assertEquals("one", from.getTargetBiDirectional().get(2).getProperty());
    }

    @Test
    public void testOrderedBiDirectionalTwoOneThree() {
        from.addToTargetBiDirectional(two);
        from.addToTargetBiDirectional(one);
        from.addToTargetBiDirectional(three);
        assertEquals("two", from.getTargetBiDirectional().get(0).getProperty());
        assertEquals("one", from.getTargetBiDirectional().get(1).getProperty());
        assertEquals("three", from.getTargetBiDirectional().get(2).getProperty());
    }

    @Test
    public void testOrderedBiDirectionalOneThreeTwo() {
        from.addToTargetBiDirectional(one);
        from.addToTargetBiDirectional(three);
        from.addToTargetBiDirectional(two);
        assertEquals("one", from.getTargetBiDirectional().get(0).getProperty());
        assertEquals("three", from.getTargetBiDirectional().get(1).getProperty());
        assertEquals("two", from.getTargetBiDirectional().get(2).getProperty());
    }

    /**
     * The removeFromTarget should work before the objects are persisted.
     */
    @Test
    public void testRemoveFromTarget() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        from.removeFromTarget(two);

        assertEquals(2, from.getTarget().size());
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("three", from.getTarget().get(1).getProperty());

        from.addToTarget(two);
        from.removeFromTarget(one);
        assertEquals(2, from.getTarget().size());
        assertEquals("three", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
    }

    /**
     * The removeFromTarget should also work after the objects are persisted.
     */
    @Test
    public void testRemoveFromTargetPersisted() {
        from.addToTarget(one);
        from.addToTarget(two);
        from.addToTarget(three);
        from.removeFromTarget(two);
        assertEquals(2, from.getTarget().size());
        assertEquals("one", from.getTarget().get(0).getProperty());
        assertEquals("three", from.getTarget().get(1).getProperty());

        from.addToTarget(two);
        from.removeFromTarget(one);
        assertEquals(2, from.getTarget().size());
        assertEquals("three", from.getTarget().get(0).getProperty());
        assertEquals("two", from.getTarget().get(1).getProperty());
    }
}
