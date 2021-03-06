
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Fri Sep 04 19:28:14 CEST 2009
 *     Application model: StandardBreakfast
 *     Generator        :  Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j.
 */

package com.rosa.breakfast.domain;

/**
 * 
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class StandardBreakfast extends StandardBreakfastImplBase {

	/**
	 * Default no-argument constructor for StandardBreakfast 
	 */
	protected StandardBreakfast() {

	}

	/**
	 * Minimal constructor for StandardBreakfast
	 * @param name (String) 
	 * @param price (float) 
	 * @param style (ServingStyle) 
	 */
	public StandardBreakfast(String name, float price, ServingStyle style) {
		super(name, price, style);
	}

}
