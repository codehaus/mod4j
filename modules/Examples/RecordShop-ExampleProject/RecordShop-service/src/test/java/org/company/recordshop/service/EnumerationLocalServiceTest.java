package org.company.recordshop.service;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.company.recordshop.service.dto.StringEnumClassDto;
import org.company.recordshop.service.dto.StringEnumDto;
import org.company.recordshop.service.local.EnumerationLocalService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class EnumerationLocalServiceTest extends AbstractServiceTestCase {

	@Autowired
	EnumerationLocalService enumerationLocalService;

	@Test
	public void testCreateStringEnumClass() {
		StringEnumClassDto dto = new StringEnumClassDto();
		dto.setTheEnum(StringEnumDto.ONE);
		Long id = enumerationLocalService.createStringEnumClass(dto);
		flush();
		clear();
		dto = enumerationLocalService.readStringEnumClassAsStringEnumClassDto(id);
		Assert.assertNotNull(dto);
		Assert.assertEquals(StringEnumDto.ONE, dto.getTheEnum());
		Assert.assertEquals("one", dto.getTheEnum().id());
	}
}
