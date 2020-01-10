package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum MobileErrorCode implements IErrorCode {

	/** The MOBILE_EXISTS constant. */
	MOBILE_EXISTS(5901),
	/** The MOBILE_NOT_EXISTS constant. */
	MOBILE_NOT_EXISTS(5902),
	/** The MOBILE_MOVING constant. */
	MOBILE_MOVING(5903),
	/** The MOBILE_NOT_MOVING constant. */
	MOBILE_NOT_MOVING(5904),
	/** The MOBILE_DESTINATION_INVALID constant. */
	MOBILE_DESTINATION_INVALID(5905),
	/** The MOBILE_OWNED constant. */
	MOBILE_OWNED(5906),
	/** The MOBILE_NOT_OWNED constant. */
	MOBILE_NOT_OWNED(5907),
	/** The MOBILE_EMPTY constant. */
	MOBILE_EMPTY(5908),
	/** The MOBILE_NOT_EMPTY constant. */
	MOBILE_NOT_EMPTY(5909),
	/** The MOBILES_ARE_SAME constant. */
	MOBILES_ARE_SAME(5910),
	/** The MOBILES_NOT_AT_SAME_LOCATION constant. */
	MOBILES_NOT_AT_SAME_LOCATION(5911),
	/** The MOBILE_WAITING constant. */
	MOBILE_WAITING(5912);

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
