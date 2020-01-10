package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum UnitErrorCode implements IErrorCode {

	/** The UNIT_EXISTS constant. */
	UNIT_EXISTS(6801),
	/** The UNIT_NOT_EXISTS constant. */
	UNIT_NOT_EXISTS(6802);

	/** The id field. */
	private final int id;

	private UnitErrorCode(int id) {
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
