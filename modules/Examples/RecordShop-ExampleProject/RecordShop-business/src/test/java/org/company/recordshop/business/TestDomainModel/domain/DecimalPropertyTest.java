package org.company.recordshop.business.TestDomainModel.domain;

import java.math.BigDecimal;

import org.company.recordshop.business.data.AbstractDaoTestCase;
import org.company.recordshop.business.recordshopcore.data.RecordDao;
import org.company.recordshop.business.recordshopcore.domain.Record;
import org.company.recordshop.business.recordshopcore.domain.RecordTypeEnum;
import org.hibernate.exception.DataException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class DecimalPropertyTest extends AbstractDaoTestCase {

	@Autowired
	RecordDao recordDao;
	
	@Test(expected = DataException.class)
	public void testOutsideRangeException(){
		Record record = new Record("asincode", new BigDecimal("123456789.12"), RecordTypeEnum.BLUERAY);
		recordDao.add(record);
		flush();		
	}
}
