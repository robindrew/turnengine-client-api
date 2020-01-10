package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum AdminErrorCode implements IErrorCode {

	/** The INTERNAL_SERVER_ERROR constant. */
	INTERNAL_SERVER_ERROR(601),
	/** The SERVER_LOCKED constant. */
	SERVER_LOCKED(602);

	/** The id field. */
	private final int id;

	private AdminErrorCode(int id) {
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
