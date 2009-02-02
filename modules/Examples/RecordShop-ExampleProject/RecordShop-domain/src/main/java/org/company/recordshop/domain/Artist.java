/**
 * Extension point generated initially by Mod4j BusinessDomain DSL by BeanClassExtensionPoint in JavaBean.xpt at: Mon Feb 02 20:47:53 CET 2009
 */
package org.company.recordshop.domain;

/**
 * An artist is a Person who has had a role in producing a Record
 *
 * @author Generated by Mod4j BusinessDomain DSL
 */
public class Artist extends ArtistImplBase {

	/**
	 * Default no-argument constructor for Artist 
	 */
	protected Artist() {
		super();
	}

	/**
	 * Minimal constructor for Artist
	 * @param firstName (string) First name of the person.
	 * @param lastName (string) Last name of the person.
	 * @param artistName (string) 
	 */
	public Artist(String firstName, String lastName, String artistName) {
		super(firstName, lastName, artistName);
	}

}
