package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.company.recordshop.data.spring.dao.CustomerDao;
import org.company.recordshop.data.spring.dao.PersonDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.Person;
import org.company.recordshop.domain.Sexe;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author mod4j
 * 
 */
@ContextConfiguration(locations = { "/RecordShopDataLaagContext.xml",
        "/RecordShopDataLaagTestContext.xml", "/Mod4jCommonContext.xml" })
public class PersonDaoTest extends AbstractTransactionalJUnit4SpringContextTests {

    @Autowired
    private PersonDao personDao;
    
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * Test method for
     * {@link org.company.recordshop.data.spring.dao.PersonDaoImpl#add(org.company.recordshop.domain.Customer)}.
     */
    @Test
    public void testAddPerson() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
                simpleJdbcTemplate, "Person_TABLE"));
        Person pers = new Person("Johannes","Vermeer", Sexe.MALE);
        
        personDao.add(pers);
        sessionFactory.getCurrentSession().flush();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Person_TABLE"));
        assertEquals(Sexe.MALE.id().intValue(), simpleJdbcTemplate
                .queryForInt("select sexe from person_table where id = ?", pers.getId()));
    }

}
