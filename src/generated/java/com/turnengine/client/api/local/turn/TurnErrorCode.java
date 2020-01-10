package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum TurnErrorCode implements IErrorCode {

	/** The TURN_UPDATING constant. */
	TURN_UPDATING(6701);

	/** The id field. */
	private final int id;

	private TurnErrorCode(int id) {
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
