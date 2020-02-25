package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum SetupErrorCode implements IErrorCode {

	/** The SETUP_EMPTY constant. */
	SETUP_EMPTY(3401),
	/** The SETUP_NOT_EMPTY constant. */
	SETUP_NOT_EMPTY(3402);

	/** The id field. */
	private final int id;

	private SetupErrorCode(int id) {
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
