
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Fri Sep 24 20:15:31 CEST 2010
 *     Application model: CustomerServiceModel
 *     Generator        :  Mod4j ServiceDsl generator: LocalServiceImpl.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.recordshop.service;

import java.util.List;

//import CustomerServiceModelDao;
import org.company.recordshop.service.CustomerServiceModelLocalServiceImplBase;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.dto.UniqueCustomerDto;
import org.company.recordshop.service.dto.StringDto;
import org.company.recordshop.service.dto.FullCustomerDto;
import org.company.recordshop.service.dto.OrderDto;
import org.company.recordshop.service.dto.OrderNumberAndDateDto;
import org.company.recordshop.service.dto.OrderWithOrderLinesDto;
import org.company.recordshop.service.dto.OrderLineDto;
import org.company.recordshop.service.dto.CustomerWithOrdersAndOrderLines;
import org.company.recordshop.service.dto.CustomerWithAddressDto;
import org.company.recordshop.service.dto.ProductWithCustomersDto;
import org.company.recordshop.service.dto.FullProductDto;
import org.company.recordshop.service.dto.ArtistDto;
import org.company.recordshop.service.dto.PersonDto;
import org.company.recordshop.service.dto.RelationDto;
import org.company.recordshop.service.dto.AddressDto;

import org.company.recordshop.service.dto.translators.SimpleCustomerDtoTranslator;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.translators.FullCustomerDtoTranslator;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.translators.OrderDtoTranslator;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.translators.OrderNumberAndDateDtoTranslator;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.translators.OrderWithOrderLinesDtoTranslator;
import org.company.recordshop.domain.Order;
import org.company.recordshop.service.dto.translators.OrderLineDtoTranslator;
import org.company.recordshop.domain.OrderLine;
import org.company.recordshop.service.dto.translators.CustomerWithOrdersAndOrderLinesTranslator;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.translators.CustomerWithAddressDtoTranslator;
import org.company.recordshop.domain.Customer;
import org.company.recordshop.service.dto.translators.ProductWithCustomersDtoTranslator;
import org.company.recordshop.domain.Product;
import org.company.recordshop.service.dto.translators.FullProductDtoTranslator;
import org.company.recordshop.domain.Product;
import org.company.recordshop.service.dto.translators.ArtistDtoTranslator;
import org.company.recordshop.domain.Artist;
import org.company.recordshop.service.dto.translators.PersonDtoTranslator;
import org.company.recordshop.domain.Person;
import org.company.recordshop.service.dto.translators.RelationDtoTranslator;
import org.company.recordshop.domain.Relation;
import org.company.recordshop.service.dto.translators.AddressDtoTranslator;
import org.company.recordshop.domain.Address;

/**
 * @author Initially generated by Mod4j
 */
public class CustomerServiceModelLocalServiceImpl
		extends
			CustomerServiceModelLocalServiceImplBase {

	/** 
	 * {@inheritDoc}
	 */
	public void voidreturn(OrderDto ord) {

		// TODO Mod4j: implement this service method manually

	}

	/** 
	 * {@inheritDoc}
	 */
	public OrderDto addToOrders(OrderDto order, SimpleCustomerDto customer) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

	/** 
	 * {@inheritDoc}
	 */
	public SimpleCustomerDto findCustomerByUniqueKey(UniqueCustomerDto cust) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

	/** 
	 * {@inheritDoc}
	 */
	public List<SimpleCustomerDto> findCustomerByName(StringDto name) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

	/** 
	 * {@inheritDoc}
	 */
	public List<SimpleCustomerDto> findCustomersByNames(List<StringDto> name) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

}
