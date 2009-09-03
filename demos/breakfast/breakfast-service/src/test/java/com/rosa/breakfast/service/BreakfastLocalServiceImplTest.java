package com.rosa.breakfast.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.rosa.breakfast.service.dto.ComestibleDto;
import com.rosa.breakfast.service.dto.PartDto;
import com.rosa.breakfast.service.dto.ServingStyleDto;
import com.rosa.breakfast.service.dto.StandardBreakfastDto;

@ContextConfiguration(locations = { "/Mod4jCommonContext.xml",
		"/com/rosa/breakfast/data/applicationContext.xml",
		"/com/rosa/breakfast/data/sessionFactoryContext.xml",
		"/com/rosa/breakfast/business/applicationContext.xml",
		"/com/rosa/breakfast/service/applicationContext.xml",
		"/com/rosa/breakfast/service/testDataSourceContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BreakfastLocalServiceImplTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	@Autowired
	private BreakfastLocalService breakfastService;

	@Test
	public void testCreateStandardBreakfast() {
		StandardBreakfastDto created = new StandardBreakfastDto();
		created.setName("Continental Breakfast");
		created.setPrice(14.95F);
		created.setStyle(ServingStyleDto.SIMPLE);
		StandardBreakfastDto saved = breakfastService
				.createStandardBreakfast(created);

		StandardBreakfastDto read = breakfastService
				.readStandardBreakfastAsStandardBreakfastDto(saved.getId());
		assertNotNull(read);
		assertEquals("Continental Breakfast", read.getName());
		assertEquals(Float.valueOf(14.95F), read.getPrice());
		assertSame(ServingStyleDto.SIMPLE, read.getStyle());
	}

	@Test
	public void testAddToParts() {
		StandardBreakfastDto standardBreakfast = new StandardBreakfastDto();
		standardBreakfast.setName("Continental Breakfast");
		standardBreakfast.setPrice(14.95F);
		standardBreakfast.setStyle(ServingStyleDto.SIMPLE);
		StandardBreakfastDto savedStandardBreakfast = breakfastService
				.createStandardBreakfast(standardBreakfast);

		ComestibleDto comestible = new ComestibleDto();
		comestible.setName("Roll");
		comestible.setMinimalQuantity(2);
		comestible.setPrice(0.45F);
		comestible.setTransportForm("What's this?");
		ComestibleDto savedComestible = breakfastService
				.createComestible(comestible);

		PartDto part = new PartDto();
		part.setQuantity(2);
		PartDto savedPart = breakfastService.createPart(part);

		breakfastService.addToParts(savedStandardBreakfast, savedPart);
		breakfastService.setComestible(savedPart, savedComestible);

		StandardBreakfastDto readStandardBreakfast = breakfastService
				.readStandardBreakfastAsStandardBreakfastDto(savedStandardBreakfast
						.getId());
		assertNotNull(readStandardBreakfast);
		Set<PartDto> parts = readStandardBreakfast.getParts();
		assertEquals(1, parts.size());
		part = parts.iterator().next();
		assertNotNull(part.getComestible());
		assertEquals("Roll", part.getComestible().getName());
		assertEquals(Integer.valueOf(2), part.getComestible()
				.getMinimalQuantity());
		assertEquals(Float.valueOf(0.45F), comestible.getPrice());
		assertEquals("What's this?", comestible.getTransportForm());

		breakfastService.removeFromParts(readStandardBreakfast, part);
		readStandardBreakfast = breakfastService
				.readStandardBreakfastAsStandardBreakfastDto(readStandardBreakfast
						.getId());
		assertNotNull(readStandardBreakfast);
		parts = readStandardBreakfast.getParts();
		assertEquals(0, parts.size());
	}
}
