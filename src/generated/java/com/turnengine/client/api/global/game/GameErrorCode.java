package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum GameErrorCode implements IErrorCode {

	/** The GAME_EXISTS constant. */
	GAME_EXISTS(1501),
	/** The GAME_NOT_EXISTS constant. */
	GAME_NOT_EXISTS(1502),
	/** The GAME_VERSION_EXISTS constant. */
	GAME_VERSION_EXISTS(1503),
	/** The GAME_VERSION_NOT_EXISTS constant. */
	GAME_VERSION_NOT_EXISTS(1504),
	/** The GAME_INSTANCE_EXISTS constant. */
	GAME_INSTANCE_EXISTS(1505),
	/** The GAME_INSTANCE_NOT_EXISTS constant. */
	GAME_INSTANCE_NOT_EXISTS(1506),
	/** The GAME_HOST_EXISTS constant. */
	GAME_HOST_EXISTS(1507),
	/** The GAME_HOST_NOT_EXISTS constant. */
	GAME_HOST_NOT_EXISTS(1508),
	/** The GAME_RUNNING constant. */
	GAME_RUNNING(1509),
	/** The GAME_NOT_RUNNING constant. */
	GAME_NOT_RUNNING(1510),
	/** The GAME_INSTANCE_NOT_SET constant. */
	GAME_INSTANCE_NOT_SET(1511),
	/** The GAME_INSTANCE_INVALID constant. */
	GAME_INSTANCE_INVALID(1512),
	/** The GAME_ALREADY_SETUP constant. */
	GAME_ALREADY_SETUP(1513);

	/** The id field. */
	private final int id;

	private GameErrorCode(int id) {
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
