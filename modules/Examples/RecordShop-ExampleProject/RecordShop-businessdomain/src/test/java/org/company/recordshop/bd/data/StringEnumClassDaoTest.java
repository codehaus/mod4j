package org.company.recordshop.bd.data;

import junit.framework.Assert;

import org.company.recordshop.bd.domain.StringEnum;
import org.company.recordshop.bd.domain.StringEnumClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StringEnumClassDaoTest extends AbstractDaoTestCase {

	@Autowired
	private StringEnumClassDao stringEnumClassDao;

	@Test
	public void testAdd() {
		StringEnumClass sec = new StringEnumClass(StringEnum.ONE);
		Long id = stringEnumClassDao.add(sec);
		flushAndClear();
		sec = stringEnumClassDao.retrieve(id);
		Assert.assertEquals(StringEnum.ONE, sec.getTheEnum());
		Assert.assertEquals("one", simpleJdbcTemplate.queryForObject(
				"SELECT the_enum FROM STRING_ENUM_CLASS_TABLE", String.class));
	}
}
