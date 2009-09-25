/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Fri Sep 25 13:14:53 CEST 2009
 *     Application model: CustomerServiceModel
 *     Generator        :  Mod4j ServiceDsl generator: BusinessServiceImpl.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j.
 */
package org.company.recordshop.business;

import org.company.recordshop.domain.Customer;
import org.company.recordshop.data.CustomerDao;
import org.company.recordshop.domain.Order;
import org.company.recordshop.data.OrderDao;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.data.OrderLineDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Generated by Mod4j, use as extension point to implement custom
 *         business services
 */
@Component
public class CustomerServiceModelDomainServiceImpl extends
        CustomerServiceModelDomainServiceImplBase implements
        CustomerServiceModelDomainService {

    @Autowired
    public CustomerServiceModelDomainServiceImpl(@Qualifier("default") final CustomerDao customerDao,
            final OrderDao orderDao, final OrderLineDao orderLineDao) {
        super(customerDao, orderDao, orderLineDao);
    }
}
