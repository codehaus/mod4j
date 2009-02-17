package org.company.recordshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.company.recordshop.data.spring.dao.PersonDao;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.domain.Person;
import org.company.recordshop.domain.SexeEnum;
import org.hibernate.exception.ConstraintViolationException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Eric Jan Malotaux
 */
public class PersonDaoTest extends AbstractDaoTestCase {

	@Autowired
	private PersonDao personDao;

	@Test
	public void testRetrieve() {
		Person person = new Person("Johannes", "Vermeer");
		personDao.add(person);
		flush();
		assertEquals("Johannes", simpleJdbcTemplate.queryForObject(
				"select firstName from person_table where id = ?",
				String.class, person.getId()));
		assertEquals("Vermeer", simpleJdbcTemplate.queryForObject(
				"select lastName from person_table where id = ?", String.class,
				person.getId()));
		assertNull(simpleJdbcTemplate.queryForObject(
				"select sexe from person_table where id = ?", Integer.class,
				person.getId()));
	}

	/**
	 * Test method for {@link PersonDao#add(Customer)}.
	 */
	@Test
	public void testAdd() {
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		Person pers = new Person("Johannes", "Vermeer");
		personDao.add(pers);
		flush();
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		assertNull(simpleJdbcTemplate.queryForObject(
				"select sexe from person_table where id = ?", Integer.class,
				pers.getId()));
	}

	/**
	 * Testmethod for {@link PersonDao#delete(Person)}.
	 */
	@Test
	public void testDelete() {
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		Person person = new Person("Rembrandt", "van Rhijn");
		personDao.add(person);
		flush();
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		Person saved = personDao.retrieve(person.getId());
		personDao.delete(saved);
		flush();
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
	}

	/**
	 * Testmethod for {@link PersonDao#update(Person)}.
	 */
	@Test
	public void testUpdate() {
		Person person = new Person("Rembrandt", "van Rhijn");
		personDao.add(person);
		flush();
		Person saved = personDao.retrieve(person.getId());
		saved.setFirstName("Paula");
		saved.setLastName("Potter");
		saved.setSexe(SexeEnum.FEMALE);
		personDao.update(saved);
		flush();
		assertEquals(1, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));

		Person updated = personDao.retrieve(person.getId());
		assertEquals("Paula", updated.getFirstName());
		assertEquals("Potter", updated.getLastName());
		assertEquals(person.getId(), saved.getId());
		assertEquals(saved.getId(), updated.getId());
	}

	@Test
	public void testVersion() {
		Person person = new Person("Rembrandt", "van Rhijn");
		personDao.add(person);
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		flush();
		assertEquals(0, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
		person.setFirstName("First");
		flush();
		assertEquals(1, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
		person.setFirstName("Second");
		flush();
		assertEquals(2, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
		flush();
		/*
		 * When nothing is changed the flush does not actually update the row,
		 * and "version" is not changed.
		 */
		assertEquals(2, simpleJdbcTemplate
				.queryForInt("select version from person_table where id = ?",
						person.getId()));
	}

	@Test
	public void testPolymorphism() {
		Person person = new Person("Rembrandt", "van Rhijn");
		personDao.add(person);
		Customer customer = new Customer("Simon", "de Wit", 1);
		personDao.add(customer);
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		flush();
		clear();
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Person_TABLE"));
		assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(
				simpleJdbcTemplate, "Customer_TABLE"));
		List<Person> persons = personDao.listAll();
		assertEquals(2, persons.size());
		Collections.sort(persons, new PersonComparator());
		assertSame(Person.class, persons.get(0).getClass());
		assertSame(Customer.class, persons.get(1).getClass());
	}

	@Test
	public void testUniqueConstraint() {
		personDao.add(new Person("Klaas", "Vaak"));
		personDao.add(new Person("Klaas", "Vaak"));
		try {
			flush();
			fail("Expected ConstraintViolationException");
		} catch (ConstraintViolationException e) {
			assertEquals(ConstraintViolationException.class, e.getClass());
		}
	}

	public class PersonComparator implements Comparator<Person> {
		public int compare(Person one, Person other) {
			return (one.getFirstName() + one.getLastName()).compareTo(other
					.getFirstName()
					+ other.getLastName());
		}
	}
}
