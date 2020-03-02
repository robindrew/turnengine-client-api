package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum LocationErrorCode implements IErrorCode {

	/** The LOCATION_EXISTS constant. */
	LOCATION_EXISTS(2801),
	/** The LOCATION_NOT_EXISTS constant. */
	LOCATION_NOT_EXISTS(2802),
	/** The LOCATION_OWNED constant. */
	LOCATION_OWNED(2803),
	/** The LOCATION_NOT_OWNED constant. */
	LOCATION_NOT_OWNED(2804),
	/** The LOCATION_NOT_SIGNUP constant. */
	LOCATION_NOT_SIGNUP(2805),
	/** The LOCATION_SIGNUP_EXISTS constant. */
	LOCATION_SIGNUP_EXISTS(2806),
	/** The LOCATIONS_GENERATED constant. */
	LOCATIONS_GENERATED(2807),
	/** The NO_SIGNUP_LOCATIONS_AVAILABLE constant. */
	NO_SIGNUP_LOCATIONS_AVAILABLE(2808),
	/** The LOCATION_NAME_EXISTS constant. */
	LOCATION_NAME_EXISTS(2809),
	/** The LOCATION_COORDINATES_INVALID constant. */
	LOCATION_COORDINATES_INVALID(2810),
	/** The LOCATIONS_EXIST constant. */
	LOCATIONS_EXIST(2811);

	/** The id field. */
	private final int id;

	private LocationErrorCode(int id) {
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
