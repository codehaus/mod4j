package org.company.recordshop.domain;

/**
 * Extension point initially generated at: Sat May 10 20:48:22 CEST 2008
 */
public class OrderLine extends OrderLineImplBase {

	/**
	 *  Minimal constructor for OrderLine
	
	 * @param lineNumber (int) 
	 * @param description (String) 
	 * @param lineAmount (float) 
	
	 */
	public OrderLine(int lineNumber, String description, float lineAmount) {

		super(lineNumber, description, lineAmount);
	}

}
