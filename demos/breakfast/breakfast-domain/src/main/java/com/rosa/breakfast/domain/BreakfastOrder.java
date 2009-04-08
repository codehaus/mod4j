
/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in NewJavaBean.xpt at: Wed Apr 08 06:50:05 CEST 2009
 */
package com.rosa.breakfast.domain;

import org.joda.time.DateTime;

/**
 * 
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class BreakfastOrder extends BreakfastOrderImplBase {

	/**
	 * Default no-argument constructor for BreakfastOrder 
	 */
	protected BreakfastOrder() {

	}

	/**
	 * Minimal constructor for BreakfastOrder
	 * @param discount (float) 
	 * @param orderDate (DateTime) 
	 */
	public BreakfastOrder(float discount, DateTime orderDate) {
		super(discount, orderDate);
	}

}
