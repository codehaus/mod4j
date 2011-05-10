package org.company.recordshop.bd.data;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.bd.domain.BeautifulName;
import org.company.recordshop.bd.domain.BeautifulSubClass;
import org.company.recordshop.bd.domain.ReferencedClass;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jdbc.SimpleJdbcTestUtils;

/**
 * @author Eric Jan Malotaux
 */
public class AnnotationTest extends AbstractDaoTestCase {

    @Autowired
    private BeautifulNameDao beautifulNameDao;

    @Autowired
    private BeautifulSubClassDao beautifulSubClassDao;

    @Autowired
    private ReferencedClassDao referencedClassDao;

    /**
     * Test method for the {@link BeautifulNam} annotations.
     * 
     * The BeautifulName class is generated from the following Mod4J Business Domain code:
     * 
     * <pre>
     *      @legacy(table="LEGACY") 
     *      class BeautifulName [
     *          @legacy(column="UGLY")
     *          string beautifulName;
     *          boolean secondo;
     *          integer fourth;
     *          decimal fifth;
     *      ]
     * </pre>
     * 
     * This test verfies that the table name is in fact "LEGACY" and the column for property
     * "beautifulName" is in fact "UGLY".
     */
    @Test
    public void testAddBeautifulSubClass() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "SUBTABLE"));
        BeautifulSubClass beautifulName = new BeautifulSubClass("Vermeer", true, 4, 5.0F, false);
        beautifulNameDao.add(beautifulName);
        flush();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "SUBTABLE"));
        assertEquals(false, simpleJdbcTemplate.queryForObject(
                "select yes_no from SUBTABLE where id = ?", Boolean.class, beautifulName.getId()));
    }

    /**
     * Test method for the {@link BeautifulName} annotations
     * 
     * This test verfies that the table name is in fact "LEGACY" and the column for property
     * "beautifulName" is in fact "UGLY".
     */
    @Test
    public void testAddBeautifulName() {
        assertEquals(0, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "LEGACY"));
        BeautifulName beautifulName = new BeautifulName("Vermeer", true, 4, 5.0F);
        beautifulNameDao.add(beautifulName);
        flush();
        assertEquals(1, SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "LEGACY"));
        assertEquals("Vermeer", simpleJdbcTemplate.queryForObject(
                "select UGLY from LEGACY where id = ?", String.class, beautifulName.getId()));
    }

    /**
     * Test for the annotations to the association between {@link BeautifulName} and
     * {@link ReferencedClass}.
     */
    @Test
    public void testAnnotatedAssociation() {
        BeautifulName beautifulName = new BeautifulName("Vermeer", true, 4, 5.0F);
        ReferencedClass referencedClass = new ReferencedClass("a property");
        beautifulNameDao.add(beautifulName);
        referencedClassDao.add(referencedClass);
        flush();
        beautifulName.addToReferences(referencedClass);
        flush();
        assertEquals(1,
                SimpleJdbcTestUtils.countRowsInTable(simpleJdbcTemplate, "REF_CLASS"));
        beautifulName = beautifulNameDao.retrieve(beautifulName.getId());
        Assert.assertNotNull(beautifulName);
        Assert.assertEquals(1, beautifulName.getReferences().size());
        simpleJdbcTemplate
                .queryForLong("select NAME_FK from REF_CLASS order by ORDERING");
    }

    /**
     * Test many to one with foreign key names.
     */
    @Test
    public void testManyToOneWithFK() {
        BeautifulSubClass beautifulSubClass = new BeautifulSubClass("Beautiful", true, 4, 5.0F, false);
        ReferencedClass referencedClass = new ReferencedClass("Nothing");
        beautifulSubClassDao.add(beautifulSubClass);
        referencedClassDao.add(referencedClass);
        beautifulSubClass.setReference(referencedClass);
        flush();
        simpleJdbcTemplate.queryForLong("select REFERENCE_FK from SUBTABLE");
    }

    /**
     * Test many to many with foreign key names and link table name.
     */
    @Test
    public void testManyToManyWithFKAndLinkTable() {
        BeautifulName beautifulName = new BeautifulName("Beautiful", true, 4, 5.0F);
        ReferencedClass referencedClass = new ReferencedClass("Nothing");
        beautifulNameDao.add(beautifulName);
        referencedClassDao.add(referencedClass);
        beautifulName.addToReferencedClasses(referencedClass);
        flush();
        simpleJdbcTemplate.queryForLong("select BEAUTIFUL_NAME_FK from LINK_TABLE");
        simpleJdbcTemplate.queryForLong("select REFERENCE_FK from LINK_TABLE");
    }
}
