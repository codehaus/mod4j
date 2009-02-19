package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.company.recordshop.data.spring.dao.One2ManyFromDao;
import org.company.recordshop.data.spring.dao.One2ManyOrderedToDao;
import org.company.recordshop.domain.One2ManyFrom;
import org.company.recordshop.domain.One2ManyOrderedTo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderedOneToManyAssociationTest extends AbstractDaoTestCase {

	@Autowired
	private One2ManyFromDao fromDao;
	
	@Autowired
	private One2ManyOrderedToDao toDao;
	
	private One2ManyFrom from;
	private One2ManyOrderedTo one, two, three;

	@Before
	public void setUp() throws Exception {
		from = fromDao.add(new One2ManyFrom("thing"));
		one = toDao.add(new One2ManyOrderedTo("one"));
		two = toDao.add(new One2ManyOrderedTo("two"));
		three = toDao.add(new One2ManyOrderedTo("three"));
		flush();
	}

	@Test
	public void testOrderedOneTwoThree() {
		from.addToTarget(one);
		from.addToTarget(two);
		from.addToTarget(three);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("one", result.getTarget().get(0).getProperty());
		assertEquals("two", result.getTarget().get(1).getProperty());
		assertEquals("three", result.getTarget().get(2).getProperty());
	}

	@Test
	public void testOrderedTwoThreeOne() {
		from.addToTarget(two);
		from.addToTarget(three);
		from.addToTarget(one);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("two", result.getTarget().get(0).getProperty());
		assertEquals("three", result.getTarget().get(1).getProperty());
		assertEquals("one", result.getTarget().get(2).getProperty());
	}

	@Test
	public void testOrderedThreeOneTwo() {
		from.addToTarget(three);
		from.addToTarget(one);
		from.addToTarget(two);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("three", result.getTarget().get(0).getProperty());
		assertEquals("one", result.getTarget().get(1).getProperty());
		assertEquals("two", result.getTarget().get(2).getProperty());
	}

	@Test
	public void testOrderedThreeTwoOne() {
		from.addToTarget(three);
		from.addToTarget(two);
		from.addToTarget(one);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("three", result.getTarget().get(0).getProperty());
		assertEquals("two", result.getTarget().get(1).getProperty());
		assertEquals("one", result.getTarget().get(2).getProperty());
	}

	@Test
	public void testOrderedTwoOneThree() {
		from.addToTarget(two);
		from.addToTarget(one);
		from.addToTarget(three);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("two", result.getTarget().get(0).getProperty());
		assertEquals("one", result.getTarget().get(1).getProperty());
		assertEquals("three", result.getTarget().get(2).getProperty());
	}

	@Test
	public void testOrderedOneThreeTwo() {
		from.addToTarget(one);
		from.addToTarget(three);
		from.addToTarget(two);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("one", result.getTarget().get(0).getProperty());
		assertEquals("three", result.getTarget().get(1).getProperty());
		assertEquals("two", result.getTarget().get(2).getProperty());
	}

	@Test
	public void testOrderedBiDirectionalOneTwoThree() {
		from.addToTargetBiDirectional(one);
		from.addToTargetBiDirectional(two);
		from.addToTargetBiDirectional(three);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("one", result.getTargetBiDirectional().get(0).getProperty());
		assertEquals("two", result.getTargetBiDirectional().get(1).getProperty());
		assertEquals("three", result.getTargetBiDirectional().get(2).getProperty());
	}

	@Test
	public void testOrderedBiDirectionalTwoThreeOne() {
		from.addToTargetBiDirectional(two);
		from.addToTargetBiDirectional(three);
		from.addToTargetBiDirectional(one);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("two", result.getTargetBiDirectional().get(0).getProperty());
		assertEquals("three", result.getTargetBiDirectional().get(1).getProperty());
		assertEquals("one", result.getTargetBiDirectional().get(2).getProperty());
	}

	@Test
	public void testOrderedBiDirectionalThreeOneTwo() {
		from.addToTargetBiDirectional(three);
		from.addToTargetBiDirectional(one);
		from.addToTargetBiDirectional(two);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("three", result.getTargetBiDirectional().get(0).getProperty());
		assertEquals("one", result.getTargetBiDirectional().get(1).getProperty());
		assertEquals("two", result.getTargetBiDirectional().get(2).getProperty());
	}

	@Test
	public void testOrderedBiDirectionalThreeTwoOne() {
		from.addToTargetBiDirectional(three);
		from.addToTargetBiDirectional(two);
		from.addToTargetBiDirectional(one);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("three", result.getTargetBiDirectional().get(0).getProperty());
		assertEquals("two", result.getTargetBiDirectional().get(1).getProperty());
		assertEquals("one", result.getTargetBiDirectional().get(2).getProperty());
	}

	@Test
	public void testOrderedBiDirectionalTwoOneThree() {
		from.addToTargetBiDirectional(two);
		from.addToTargetBiDirectional(one);
		from.addToTargetBiDirectional(three);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("two", result.getTargetBiDirectional().get(0).getProperty());
		assertEquals("one", result.getTargetBiDirectional().get(1).getProperty());
		assertEquals("three", result.getTargetBiDirectional().get(2).getProperty());
	}

	@Test
	public void testOrderedBiDirectionalOneThreeTwo() {
		from.addToTargetBiDirectional(one);
		from.addToTargetBiDirectional(three);
		from.addToTargetBiDirectional(two);
		flush();
		clear();
		
		One2ManyFrom result = fromDao.retrieve(from.getId());
		assertEquals("one", result.getTargetBiDirectional().get(0).getProperty());
		assertEquals("three", result.getTargetBiDirectional().get(1).getProperty());
		assertEquals("two", result.getTargetBiDirectional().get(2).getProperty());
	}
}
