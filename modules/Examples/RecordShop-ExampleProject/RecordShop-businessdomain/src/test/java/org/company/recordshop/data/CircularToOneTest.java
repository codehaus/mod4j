package org.company.recordshop.data;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.data.BicycleDao;
import org.company.recordshop.data.BikerDao;
import org.company.recordshop.data.OwnerDao;
import org.company.recordshop.domain.Bicycle;
import org.company.recordshop.domain.BicycleExample;
import org.company.recordshop.domain.Biker;
import org.company.recordshop.domain.BikerExample;
import org.company.recordshop.domain.Owner;
import org.company.recordshop.domain.OwnerExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class CircularToOneTest extends AbstractDaoTestCase {

    @Autowired
    private BikerDao bikerDao;
    @Autowired
    private BicycleDao bicycleDao;
    @Autowired
    private OwnerDao ownerDao;
    
    @Test
    public void circularToOneTest (){
        
       Biker biker = new Biker("John");
       Bicycle bicycle = new Bicycle("TheBike");
       Owner owner = new Owner("TheOwner");
       
       bikerDao.add(biker);
       bicycleDao.add(bicycle);
       ownerDao.add(owner);
       
       biker.setBicycle(bicycle);
       bicycle.setBikeowner(owner);
       owner.setBiker(biker);
       flush();
       
       BikerExample bikerExample = new BikerExample();
       BicycleExample bicycleExample = new BicycleExample();
       OwnerExample ownerExample = new OwnerExample();
       
       // Find all Bikers that have a Bicycle owned by the 'TheOwner';
       ownerExample.setName("TheOwner");
       bikerExample.setBicycle(bicycleExample);
       bicycleExample.setBikeowner(ownerExample);
       ownerExample.setBiker(bikerExample);
       
       assertEquals(1, bikerDao.findByExample(bikerExample).size());
       
    }
    
}
