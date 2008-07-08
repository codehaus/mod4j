/**
 * Extension Point initial generated at: Thu Jul 03 22:38:37 CEST 2008
 */
package org.company.recordshop.domain;

/**
 * A Record is a representation of a physical medium containing one or more musical compositions.
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Record extends RecordImplBase {

	/**
	 * Default no-argument constructor for Record 
	 */
	protected Record() {

	}

	/**
	 * Minimal constructor for Record
	 * @param asin (string) 
	 * @param price (decimal) 
	 */
	public Record(String asin, float price) {
		super(asin, price);
	}

}
