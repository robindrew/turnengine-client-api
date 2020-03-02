package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum TurnErrorCode implements IErrorCode {

	/** The TURN_UPDATING constant. */
	TURN_UPDATING(3801),
	/** The TURN_INTERVAL_INVALID constant. */
	TURN_INTERVAL_INVALID(3802),
	/** The TURN_START_TIME_INVALID constant. */
	TURN_START_TIME_INVALID(3803),
	/** The TURN_FINISH_TIME_INVALID constant. */
	TURN_FINISH_TIME_INVALID(3804),
	/** The TURNS_ENABLED constant. */
	TURNS_ENABLED(3805);

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
