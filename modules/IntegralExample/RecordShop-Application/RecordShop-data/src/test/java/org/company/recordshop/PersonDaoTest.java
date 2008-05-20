package org.company.recordshop;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.data.spring.dao.PersonDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.Person;
import org.company.recordshop.domain.Sexe;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Eric Jan Malotaux
 */
public class PersonDaoTest extends AbstractDaoTestCase {

    @Autowired
    private PersonDao personDao;

    /**
     * Test method for {@link PersonDao#add(Customer)}.
     */
    @Test
    public void testAddPerson() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
                simpleJdbcTemplate, "Person_TABLE"));
        Person pers = new Person("Johannes","Vermeer", 50, Sexe.MALE);
        personDao.add(pers);
        sessionFactory.getCurrentSession().flush();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Person_TABLE"));
        assertEquals(Sexe.MALE.id().intValue(), simpleJdbcTemplate.queryForInt(
                "select sexe from person_table where id = ?", pers.getId()));
    }

    /**
     * Testmethod for {@link PersonDao#delete(Person)}.
     */
    @Test
    public void testDeletePerson() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Person_TABLE"));
        Person person = new Person("Rembrandt", "van Rhijn", 23, Sexe.MALE);
        personDao.add(person);
        sessionFactory.getCurrentSession().flush();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Person_TABLE"));
        Person saved = personDao.retrieve(person.getId());
        personDao.delete(saved);
        sessionFactory.getCurrentSession().flush();
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "Person_TABLE"));
    }

    /**
     * Testmethod for {@link PersonDao#update(Person)}.
     */
    @Test
    public void testUpdatePerson() {
        Person person = new Person("Rembrandt", "van Rhijn", 23, Sexe.MALE);
        personDao.add(person);
        sessionFactory.getCurrentSession().flush();
        Person saved = personDao.retrieve(person.getId());
        saved.setFirstName("Paula");
        saved.setLastName("Potter");
        saved.setSexe(Sexe.FEMALE);
        personDao.update(saved);
        sessionFactory.getCurrentSession().flush();
        Person updated = personDao.retrieve(person.getId());
        assertEquals("Paula", updated.getFirstName());
        assertEquals("Potter", updated.getLastName());
        assertEquals(Sexe.FEMALE, updated.getSexe());
    }
}
