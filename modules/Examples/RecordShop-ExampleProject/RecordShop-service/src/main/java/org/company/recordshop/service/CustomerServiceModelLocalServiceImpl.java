/**
 * Generated by Mod4j Service DSL: LocalServiceImpl::LocalServiceImpl at: Thu Nov 06 15:24:37 CET 2008
 * from model CustomerServiceModel
 * Extension point: intended to be changed by hand.
 */
package org.company.recordshop.service;

import java.util.List;

import org.company.recordshop.business.CustomerServiceModelDomainService;
import org.company.recordshop.service.CustomerServiceModelLocalServiceImplBase;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.dto.UniqueCustomerDto;
import org.company.recordshop.service.dto.StringDto;

import org.company.recordshop.service.dto.translators.SimpleCustomerDtoTranslator;
import org.company.recordshop.domain.Customer;

/**
 * @author Generated by Mod4j
 */
public class CustomerServiceModelLocalServiceImpl
		extends
			CustomerServiceModelLocalServiceImplBase {

	/**
	 * @params [cust]
	 * @return SimpleCustomerDto
	 */
	public SimpleCustomerDto findCustomerByUniqueKey(UniqueCustomerDto cust) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

	/**
	 * @params [name]
	 * @return SimpleCustomerList
	 */
	public List<SimpleCustomerDto> findCustomerByName(StringDto name) {

		// TODO Mod4j: implement this service method manually
		return null;

	}

}
