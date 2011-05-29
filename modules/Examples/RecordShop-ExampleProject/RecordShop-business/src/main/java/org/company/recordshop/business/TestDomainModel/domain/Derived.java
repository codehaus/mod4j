
/**
 * Extension point, initially generated by Mod4j. 
 *     Time             : Sat Oct 02 13:29:18 CEST 2010
 *     Application model: Derived
 *     Generator        :  Mod4j BusinessDomainDsl generator: NewJavaBean.xpt
 *
 * It is intended to customize and maintain this file by hand. 
 * If you remove this file, it will be regenerated by Mod4j to its original state.
 */

package org.company.recordshop.business.TestDomainModel.domain;

import org.joda.time.DateTime;

/**
 * Test derived attributes
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
@SuppressWarnings("serial")
public class Derived extends DerivedImplBase {

	/**
	 * Minimal constructor for Derived
	 */
	public Derived(

	) {
		super();
	}

	/**
	 * Creates a Derived with the specified ID.
	 */
	protected Derived(Long id) {
		super(id);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getFirst() {
		return "first";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean isSecondo() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DateTime getThird() {
		return new DateTime(3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer getFourth() {
		return 4;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Float getFifth() {
		return 5.0F;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setSecondo(final Boolean secondo) {
		// TODO Mod4j: add setter rule for writable derived attribute secondo
		validation.validate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFourth(final Integer fourth) {
		// TODO Mod4j: add setter rule for writable derived attribute fourth
		validation.validate();
	}

}