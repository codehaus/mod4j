package org.company.recordshop.service;

import junit.framework.Assert;

import org.company.recordshop.service.dto.PersonDto;
import org.company.recordshop.service.dto.RelationDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class MultipleAssociationsTest extends AbstractServiceTestCase {

    @Autowired
    private CustomerServiceModelLocalService customerServiceModelService;

    @Test
    public void testCreateCrossRelations() {

        PersonDto manDto = new PersonDto();
        manDto.setLastName("Johnson");
        manDto.setFirstName("John");
        manDto.setBirthDate(new DateTime());
        manDto = customerServiceModelService.createPerson(manDto);

        PersonDto womanDto = new PersonDto();
        womanDto.setLastName("Butterfly");
        womanDto.setFirstName("Susan");
        womanDto.setBirthDate(new DateTime());
        womanDto = customerServiceModelService.createPerson(womanDto);
        flush();

        /* Husband: Relation from man to woman */
        RelationDto husbandRelationDto = new RelationDto();
        husbandRelationDto.setName("Husband");
        husbandRelationDto.setPersonFrom(manDto);
        husbandRelationDto.setPersonTo(womanDto);
        husbandRelationDto = customerServiceModelService.createRelation(husbandRelationDto);
        flush();

        Assert.assertTrue(husbandRelationDto.getId() > 0);
        Assert.assertEquals(0, husbandRelationDto.getVersion().intValue());
        /*
         * This is not good. The versions of the personFrom and personTo should be 1, like after the 
         * call to the readRelationAsRelationDto method. We will refactor the create-methods to return
         * just the generated id, and the update-methods to return void.
         */
        Assert.assertEquals(0, husbandRelationDto.getPersonFrom().getVersion().intValue());
        Assert.assertEquals(0, husbandRelationDto.getPersonTo().getVersion().intValue());
        husbandRelationDto = customerServiceModelService.readRelationAsRelationDto(husbandRelationDto.getId());
        Assert.assertEquals(0, husbandRelationDto.getVersion().intValue());
        Assert.assertEquals(1, husbandRelationDto.getPersonFrom().getVersion().intValue());
        Assert.assertEquals(1, husbandRelationDto.getPersonTo().getVersion().intValue());

        /*
         * Within the create service the opposite of a bi-directional association is updated, so we
         * always need to get the latest version of the associated object after the transaction has
         * finished. Here it's not sufficient to do: manDto = husbandRelationDto.getPersonFrom();
         * Because the man Person object is flushed at the end of the transaction and a new version
         * is born. So in these situations you'll need to use the read serivce method to get the
         * latest version from the store. If you forget to do this you will run into a
         * ConcurrentUpdateException.
         */
        manDto = customerServiceModelService.readPersonAsPersonDto(manDto.getId());
        womanDto = customerServiceModelService.readPersonAsPersonDto(womanDto.getId());
        Assert.assertEquals(1, manDto.getVersion().intValue());
        Assert.assertEquals(1, womanDto.getVersion().intValue());

        /* Wife: Relation form woman to man */
        RelationDto wifeRelationDto = new RelationDto();
        wifeRelationDto.setName("Wife");
        wifeRelationDto.setPersonFrom(husbandRelationDto.getPersonTo());
        wifeRelationDto.setPersonTo(husbandRelationDto.getPersonFrom());
        wifeRelationDto = customerServiceModelService.createRelation(wifeRelationDto);
        flush();

        wifeRelationDto = customerServiceModelService.readRelationAsRelationDto(wifeRelationDto
                .getId());

        Assert.assertTrue(wifeRelationDto.getPersonFrom().getId() == womanDto.getId());
        Assert.assertTrue(wifeRelationDto.getPersonTo().getId() == manDto.getId());

        manDto = customerServiceModelService.readPersonAsPersonDto(manDto.getId());
        womanDto = customerServiceModelService.readPersonAsPersonDto(womanDto.getId());
        Assert.assertEquals(2, manDto.getVersion().intValue());
        Assert.assertEquals(2, womanDto.getVersion().intValue());
    }

    /**
     * Update test. First create and store each dto separately. Then add the associated objects and
     * update.
     * 
     */
    @Test
    public void testUpdateCrossRelations() {

        PersonDto manDto = new PersonDto();
        manDto.setLastName("Johnson");
        manDto.setFirstName("John");
        manDto.setBirthDate(new DateTime());
        manDto = customerServiceModelService.createPerson(manDto);

        PersonDto womanDto = new PersonDto();
        womanDto.setLastName("Butterfly");
        womanDto.setFirstName("Susan");
        womanDto.setBirthDate(new DateTime());
        womanDto = customerServiceModelService.createPerson(womanDto);

        /* Husband: Relation from man to woman */
        RelationDto husbandRelationDto = new RelationDto();
        husbandRelationDto.setName("Husband");
        husbandRelationDto = customerServiceModelService.createRelation(husbandRelationDto);

        /* Wife: Relation from woman to man */
        RelationDto wifeRelationDto = new RelationDto();
        wifeRelationDto.setName("Wife");
        wifeRelationDto = customerServiceModelService.createRelation(wifeRelationDto);
        flush();

        /* Add man and woman to the husbandRelationDto */
        husbandRelationDto.setPersonFrom(manDto);
        husbandRelationDto.setPersonTo(womanDto);
        husbandRelationDto = customerServiceModelService.updateRelation(husbandRelationDto);
        flush();
        Assert.assertEquals(1, husbandRelationDto.getPersonFrom().getVersion().intValue());
        Assert.assertEquals(1, husbandRelationDto.getPersonTo().getVersion().intValue());
        Assert.assertEquals(1, customerServiceModelService.readPersonAsPersonDto(manDto.getId())
                .getVersion().intValue());
        Assert.assertEquals(1, customerServiceModelService.readPersonAsPersonDto(womanDto.getId())
                .getVersion().intValue());

        /* Now add woman and man to the wifeRelation */
        wifeRelationDto.setPersonFrom(husbandRelationDto.getPersonTo());
        wifeRelationDto.setPersonTo(husbandRelationDto.getPersonFrom());
        wifeRelationDto = customerServiceModelService.updateRelation(wifeRelationDto);
        flush();
        Assert.assertEquals(2, wifeRelationDto.getPersonFrom().getVersion().intValue());
        Assert.assertEquals(2, wifeRelationDto.getPersonTo().getVersion().intValue());
        Assert.assertEquals(2, customerServiceModelService.readPersonAsPersonDto(manDto.getId())
                .getVersion().intValue());
        Assert.assertEquals(2, customerServiceModelService.readPersonAsPersonDto(womanDto.getId())
                .getVersion().intValue());
    }
}