package org.company.recordshop.business.data;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.company.recordshop.business.recordshopcore.data.ArtistDao;
import org.company.recordshop.business.recordshopcore.data.RecordDao;
import org.company.recordshop.business.recordshopcore.domain.Artist;
import org.company.recordshop.business.recordshopcore.domain.Record;
import org.company.recordshop.business.recordshopcore.domain.RecordTypeEnum;
import org.joda.time.DateTime;
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

	protected DateTime date() {
		return new DateTime(2008, 11, 6, 0, 0, 0, 0);
	}

	@Test
	public void testRetrieve() {
		Record record = new Record("Abbey Road", new BigDecimal("25.50"), RecordTypeEnum.BLUERAY);
		recordDao.add(record);
		flush();
		clear();

		Record saved = recordDao.retrieve(record.getId());
		assertEquals("Abbey Road", saved.getAsin());
		assertEquals("25.50", saved.getPrice().toString());
	}

	@Test
	public void testAddContributors() {
		assertEquals(0, countRowsInTable("Record_TABLE"));
		assertEquals(0, countRowsInTable("Artist_TABLE"));
		assertEquals(0, countRowsInTable("records_contributors"));
		Record record = new Record("Abbey Road", new BigDecimal("25.50"), RecordTypeEnum.BLUERAY);
		Artist john = new Artist("John", "Lennon", date(), 
				"singer/guitarist/songwriter");
		Artist paul = new Artist("Paul", "McCartney", date(), "singer/bass/songwriter");
		artistDao.add(john);
		artistDao.add(paul);

		record.addToContributors(john);
		record.addToContributors(paul);
		recordDao.add(record);
		flush();
		clear();
		assertEquals(1, countRowsInTable("Record_TABLE"));
		assertEquals(2, countRowsInTable("Artist_TABLE"));
		assertEquals(2, countRowsInTable("records_contributors"));

		Record saved = recordDao.retrieve(record.getId());
		assertEquals("Abbey Road", saved.getAsin());
		assertEquals(2, countRowsInTable("records_contributors"));
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
		assertEquals("25.50", saved.getPrice().toString());
		assertEquals(1, countRowsInTable("records_contributors"));
	}
}
