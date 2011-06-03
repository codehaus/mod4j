package org.company.recordshop.bd.domain;

import junit.framework.Assert;

import org.junit.Test;

public class StringEnumTest {

	@Test
	public void testId() {
		Assert.assertEquals("one", StringEnum.ONE.id());
		Assert.assertEquals("two", StringEnum.TWO.id());
		Assert.assertEquals("three", StringEnum.THREE.id());
	}

	@Test
	public void testValue() {
		Assert.assertEquals(StringEnum.ONE, StringEnum.value("one"));
		Assert.assertEquals(StringEnum.TWO, StringEnum.value("two"));
		Assert.assertEquals(StringEnum.THREE, StringEnum.value("three"));
	}

	@Test
	public void testName() {
		Assert.assertEquals("ONE", StringEnum.ONE.name());
		Assert.assertEquals("TWO", StringEnum.TWO.name());
		Assert.assertEquals("THREE", StringEnum.THREE.name());
	}

	@Test
	public void testValueOf() {
		Assert.assertEquals(StringEnum.ONE, StringEnum.valueOf("ONE"));
		Assert.assertEquals(StringEnum.TWO, StringEnum.valueOf("TWO"));
		Assert.assertEquals(StringEnum.THREE, StringEnum.valueOf("THREE"));
	}

	@Test
	public void testValues() {
		Assert.assertEquals(StringEnum.ONE, StringEnum.values()[0]);
		Assert.assertEquals(StringEnum.TWO, StringEnum.values()[1]);
		Assert.assertEquals(StringEnum.THREE, StringEnum.values()[2]);
	}
}
