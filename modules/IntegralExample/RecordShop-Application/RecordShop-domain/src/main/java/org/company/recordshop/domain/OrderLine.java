package org.company.recordshop.domain;

/**
 * Extension point initially generated at: Tue May 13 12:39:03 CEST 2008
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
