package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum GroupErrorCode implements IErrorCode {

	/** The GROUP_EXISTS constant. */
	GROUP_EXISTS(2701),
	/** The GROUP_NOT_EXISTS constant. */
	GROUP_NOT_EXISTS(2702);

	/** The id field. */
	private final int id;

	private GroupErrorCode(int id) {
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
