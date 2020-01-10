package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum LocationErrorCode implements IErrorCode {

	/** The LOCATION_EXISTS constant. */
	LOCATION_EXISTS(5701),
	/** The LOCATION_NOT_EXISTS constant. */
	LOCATION_NOT_EXISTS(5702),
	/** The LOCATION_OWNED constant. */
	LOCATION_OWNED(5703),
	/** The LOCATION_NOT_OWNED constant. */
	LOCATION_NOT_OWNED(5704),
	/** The LOCATION_NOT_SIGNUP constant. */
	LOCATION_NOT_SIGNUP(5705),
	/** The LOCATION_SIGNUP_EXISTS constant. */
	LOCATION_SIGNUP_EXISTS(5706),
	/** The LOCATIONS_GENERATED constant. */
	LOCATIONS_GENERATED(5707),
	/** The NO_SIGNUP_LOCATIONS_AVAILABLE constant. */
	NO_SIGNUP_LOCATIONS_AVAILABLE(5708),
	/** The LOCATION_NAME_EXISTS constant. */
	LOCATION_NAME_EXISTS(5709),
	/** The LOCATION_COORDINATES_INVALID constant. */
	LOCATION_COORDINATES_INVALID(5710);

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
