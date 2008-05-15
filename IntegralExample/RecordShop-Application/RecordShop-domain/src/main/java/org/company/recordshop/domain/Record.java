package org.company.recordshop.domain;

/**
 * Extension point initially generated at: Tue May 13 12:39:03 CEST 2008
 */
public class Record extends RecordImplBase {

	/**
	 *  Minimal constructor for Record
	
	 * @param asin (String) 
	 * @param title (String) 
	 * @param mediumCode (int) 
	 * @param price (float) 
	
	 */
	public Record(String asin, String title, int mediumCode, float price) {

		super(asin, title, mediumCode, price);
	}

}
