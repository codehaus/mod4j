package com.rosa.breakfast.domain;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * Generated at: Thu Apr 02 14:32:55 CEST 2009
 */
public enum ServingStyle {

	SIMPLE(1), GRAND(2), DELUXE(3);

	private static final Map<Integer, ServingStyle> lookup = new HashMap<Integer, ServingStyle>();
	static {
		for (ServingStyle s : EnumSet.allOf(ServingStyle.class))
			lookup.put(s.id(), s);
	}

	private Integer id;

	private ServingStyle(Integer id) {
		this.id = id;
	}

	public Integer id() {
		return id;
	}

	public static ServingStyle value(Integer id) {
		return lookup.get(id);
	}
}
