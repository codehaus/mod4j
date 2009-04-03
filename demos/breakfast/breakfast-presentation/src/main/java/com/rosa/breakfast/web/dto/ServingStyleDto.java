package com.rosa.breakfast.web.dto;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * Generated at: Fri Apr 03 14:19:48 CEST 2009
 */
public enum ServingStyleDto {

	SIMPLE(1), GRAND(2), DELUXE(3);

	private static final Map<Integer, ServingStyleDto> lookup = new HashMap<Integer, ServingStyleDto>();
	static {
		for (ServingStyleDto s : EnumSet.allOf(ServingStyleDto.class))
			lookup.put(s.id(), s);
	}

	private Integer id;

	private ServingStyleDto(Integer id) {
		this.id = id;
	}

	public Integer id() {
		return id;
	}

	public static ServingStyleDto value(Integer id) {
		return lookup.get(id);
	}
}
