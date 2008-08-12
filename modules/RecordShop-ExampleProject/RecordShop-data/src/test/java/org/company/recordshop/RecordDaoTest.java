package org.company.recordshop;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.data.spring.dao.ArtistDao;
import org.company.recordshop.data.spring.dao.RecordDao;
import org.company.recordshop.domain.Artist;
import org.company.recordshop.domain.Record;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Eric Jan Malotaux
 */
public class RecordDaoTest extends AbstractDaoTestCase {

	@Autowired
	private RecordDao recordDao;

	@Autowired
	private ArtistDao artistDao;

	@Test
	public void testRetrieve() {
		Record record = new Record("Abbey Road", 25.50F);
		recordDao.add(record);
		flush();
		clear();

		Record saved = recordDao.retrieve(record.getId());
		assertEquals("Abbey Road", saved.getAsin());
	}

	@Test
	public void testAddContributors() {
		assertEquals(0, countRowsInTable("Record_TABLE"));
		assertEquals(0, countRowsInTable("Artist_TABLE"));
		assertEquals(0, countRowsInTable("Record_Artist"));
		Record record = new Record("Abbey Road", 25.50F);
		Artist john = new Artist("John", "Lennon",
				"singer/guitarist/songwriter");
		Artist paul = new Artist("Paul", "McCartney", "singer/bass/songwriter");
		artistDao.add(john);
		artistDao.add(paul);

		record.addToContributors(john);
		record.addToContributors(paul);
		recordDao.add(record);
		flush();
		clear();
		assertEquals(1, countRowsInTable("Record_TABLE"));
		assertEquals(2, countRowsInTable("Artist_TABLE"));
		assertEquals(2, countRowsInTable("Record_Artist"));

		Record saved = recordDao.retrieve(record.getId());
		assertEquals("Abbey Road", saved.getAsin());
		assertEquals(2, countRowsInTable("Record_Artist"));
		assertEquals(2, saved.getContributors().size());
		for (Artist artist : saved.getContributors()) {
			if ("John".equals(artist.getFirstName())) {
				john = artist;
			} else if ("Paul".equals(artist.getFirstName())) {
				paul = artist;
			}
		}
		saved.removeFromContributors(john);
		flush();
		clear();

		saved = recordDao.retrieve(record.getId());
		assertEquals("Abbey Road", saved.getAsin());
		assertEquals(1, saved.getContributors().size());
		assertEquals(1, countRowsInTable("Record_Artist"));
	}
}
