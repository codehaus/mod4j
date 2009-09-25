/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Fri Sep 25 15:56:51 CEST 2009
 *     Application model: CustomerServiceModel
 *     Generator        :  Mod4j ServiceDsl generator: LocalServiceImpl.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j.
 */
package org.company.recordshop.service;

import java.util.List;

import org.company.recordshop.business.CustomerServiceModelDomainService;
import org.company.recordshop.service.dto.OrderDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.dto.StringDto;
import org.company.recordshop.service.dto.UniqueCustomerDto;
import org.company.recordshop.service.dto.translators.CustomerWithOrdersAndOrderLinesTranslator;
import org.company.recordshop.service.dto.translators.FullCustomerDtoTranslator;
import org.company.recordshop.service.dto.translators.OrderDtoTranslator;
import org.company.recordshop.service.dto.translators.OrderLineDtoTranslator;
import org.company.recordshop.service.dto.translators.OrderNumberAndDateDtoTranslator;
import org.company.recordshop.service.dto.translators.OrderWithOrderLinesDtoTranslator;
import org.company.recordshop.service.dto.translators.SimpleCustomerDtoTranslator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Initially generated by Mod4j
 */
@Component
public class CustomerServiceModelLocalServiceImpl extends
        CustomerServiceModelLocalServiceImplBase {
    @Autowired
    public CustomerServiceModelLocalServiceImpl(
            final CustomerServiceModelDomainService customerServiceModelDomainService,
            final SimpleCustomerDtoTranslator simpleCustomerDtoTranslator,
            final OrderNumberAndDateDtoTranslator orderNumberAndDateDtoTranslator,
            final FullCustomerDtoTranslator fullCustomerDtoTranslator,
            final OrderDtoTranslator orderDtoTranslator,
            final OrderWithOrderLinesDtoTranslator orderWithOrderLinesDtoTranslator,
            final OrderLineDtoTranslator orderLineDtoTranslator,
            final CustomerWithOrdersAndOrderLinesTranslator customerWithOrdersAndOrderLinesTranslator) {
        super(customerServiceModelDomainService, simpleCustomerDtoTranslator,
                orderNumberAndDateDtoTranslator, fullCustomerDtoTranslator,
                orderDtoTranslator, orderWithOrderLinesDtoTranslator,
                orderLineDtoTranslator,
                customerWithOrdersAndOrderLinesTranslator);
    }

    /** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
     * @params [ord]
     * @return 
     */
    public void voidreturn(OrderDto ord) {
        // TODO Mod4j: implement this service method manually
    }

    /** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
     * @params [order, customer]
     * @return OrderDto
     */
    public OrderDto addToOrdersa(OrderDto order, SimpleCustomerDto customer) {
        // TODO Mod4j: implement this service method manually
        return null;
    }

    /** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
     * @params [cust]
     * @return SimpleCustomerDto
     */
    public SimpleCustomerDto findCustomerByUniqueKey(UniqueCustomerDto cust) {
        // TODO Mod4j: implement this service method manually
        return null;
    }

    /** The RecordShop Customer Service Model. Contains all services needed to maintain Customers.
     * @params [name]
     * @return SimpleCustomerList
     */
    public List<SimpleCustomerDto> findCustomerByName(StringDto name) {
        // TODO Mod4j: implement this service method manually
        return null;
    }
}
