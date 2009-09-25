/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Fri Sep 25 15:56:51 CEST 2009
 *     Application model: OrderServiceModel
 *     Generator        :  Mod4j ServiceDsl generator: LocalServiceImpl.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j.
 */
package org.company.recordshop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.company.recordshop.business.OrderServiceModelDomainService;
import org.company.recordshop.service.OrderServiceModelLocalServiceImplBase;
import org.company.recordshop.service.dto.OrderDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.dto.DateDto;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.company.recordshop.service.dto.OrderLineDto;

import org.company.recordshop.service.dto.OrderNumberAndDateDto;

import org.company.recordshop.service.dto.translators.OrderDtoTranslator;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.translators.SimpleCustomerDtoTranslator;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.translators.OrderNumberAndDateDtoTranslator;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.translators.OrderWithOrderLinesDtoTranslator;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.translators.OrderLineDtoTranslator;
import org.company.recordshop.domain.OrderLine;

/**
 * @author Initially generated by Mod4j
 */
@Component
public class OrderServiceModelLocalServiceImpl extends
        OrderServiceModelLocalServiceImplBase {
    @Autowired
    public OrderServiceModelLocalServiceImpl(
            final OrderServiceModelDomainService orderServiceModelDomainService,
            final OrderNumberAndDateDtoTranslator orderNumberAndDateDtoTranslator,
            final OrderDtoTranslator orderDtoTranslator,
            final SimpleCustomerDtoTranslator simpleCustomerDtoTranslator,
            final OrderWithOrderLinesDtoTranslator orderWithOrderLinesDtoTranslator,
            final OrderLineDtoTranslator orderLineDtoTranslator) {
        super(orderServiceModelDomainService, orderNumberAndDateDtoTranslator,
                orderDtoTranslator, simpleCustomerDtoTranslator,
                orderWithOrderLinesDtoTranslator, orderLineDtoTranslator);
    }

    /** The RecordShop Order Service Model. Contains all services for handling and maintaining Orders
     * @params [customer]
     * @return OrderNumberAndDateList
     */
    public List<OrderNumberAndDateDto> findOrdersByCustomer(
            SimpleCustomerDto customer) {
        // TODO Mod4j: implement this service method manually
        return null;
    }

    /** The RecordShop Order Service Model. Contains all services for handling and maintaining Orders
     * @params [date]
     * @return OrderNumberAndDateList
     */
    public List<OrderNumberAndDateDto> findOrdersByDate(DateDto date) {
        // TODO Mod4j: implement this service method manually
        return null;
    }
}
