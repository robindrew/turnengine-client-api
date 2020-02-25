package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum MobileErrorCode implements IErrorCode {

	/** The MOBILE_EXISTS constant. */
	MOBILE_EXISTS(3001),
	/** The MOBILE_NOT_EXISTS constant. */
	MOBILE_NOT_EXISTS(3002),
	/** The MOBILE_MOVING constant. */
	MOBILE_MOVING(3003),
	/** The MOBILE_NOT_MOVING constant. */
	MOBILE_NOT_MOVING(3004),
	/** The MOBILE_DESTINATION_INVALID constant. */
	MOBILE_DESTINATION_INVALID(3005),
	/** The MOBILE_OWNED constant. */
	MOBILE_OWNED(3006),
	/** The MOBILE_NOT_OWNED constant. */
	MOBILE_NOT_OWNED(3007),
	/** The MOBILE_EMPTY constant. */
	MOBILE_EMPTY(3008),
	/** The MOBILE_NOT_EMPTY constant. */
	MOBILE_NOT_EMPTY(3009),
	/** The MOBILES_ARE_SAME constant. */
	MOBILES_ARE_SAME(3010),
	/** The MOBILES_NOT_AT_SAME_LOCATION constant. */
	MOBILES_NOT_AT_SAME_LOCATION(3011),
	/** The MOBILE_WAITING constant. */
	MOBILE_WAITING(3012);

	/** The id field. */
	private final int id;

	private MobileErrorCode(int id) {
		this.id = id;
	}

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	public int getId() {
		return id;
	}
}
