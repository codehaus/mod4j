package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.company.recordshop.service.dto.DerivedDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations = { "/Mod4jCommonContext.xml",
        "/org/company/recordshop/data/applicationContextBase.xml",
        "/org/company/recordshop/data/applicationContext.xml",
        "/org/company/recordshop/business/applicationContextBase.xml",
        "/org/company/recordshop/business/applicationContext.xml",
        "/org/company/recordshop/service/testDataSourceContext.xml", "/org/company/recordshop/service/testContext.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class TestSVCLocalServiceImplTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    TestSVCLocalService testSVCService;

    @Test
    public void testCreateDerived() {
        DerivedDto dto = new DerivedDto();
        testSVCService.createDerived(dto);
    }
    
    @Test
    public void testListAllDerived() {
        DerivedDto dto = testSVCService.createDerived(new DerivedDto());
        List<DerivedDto> list = testSVCService.listAllDerived();
        assertEquals(1, list.size());
        DerivedDto read = list.get(0);
        assertEquals("first", read.getFirst());
        assertTrue(read.isSecondo());
        assertEquals(new DateTime(3), read.getThird());
        assertEquals(Integer.valueOf(4), read.getFourth());
        assertEquals(Float.valueOf(5.0F), read.getFifth());
    }

    @Test
    public void testReadDerived() {
        DerivedDto dto = testSVCService.createDerived(new DerivedDto());
        DerivedDto read = testSVCService.readDerivedAsDerivedDto(dto.getId());
        assertEquals("first", read.getFirst());
        assertTrue(read.isSecondo());
        assertEquals(new DateTime(3), read.getThird());
        assertEquals(Integer.valueOf(4), read.getFourth());
        assertEquals(Float.valueOf(5.0F), read.getFifth());
    }

    @Test
    public void testUpdateDerived() {
        DerivedDto dto = testSVCService.createDerived(new DerivedDto());
        DerivedDto read = testSVCService.readDerivedAsDerivedDto(dto.getId());
        assertEquals("first", read.getFirst());
        assertTrue(read.isSecondo());
        assertEquals(new DateTime(3), read.getThird());
        assertEquals(Integer.valueOf(4), read.getFourth());
        assertEquals(Float.valueOf(5.0F), read.getFifth());
        read.setFirst("second");
        read.setSecondo(false);
        read.setThird(new DateTime(3));
        read.setFourth(4);
        read.setFifth(5.0F);
        testSVCService.updateDerived(read);
        DerivedDto updated = testSVCService.readDerivedAsDerivedDto(dto.getId());
        assertEquals("first", updated.getFirst());
        assertTrue(updated.isSecondo());
        assertEquals(new DateTime(3), updated.getThird());
        assertEquals(Integer.valueOf(4), updated.getFourth());
        assertEquals(Float.valueOf(5.0F), updated.getFifth());
    }
}
