package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum PlayerErrorCode implements IErrorCode {

	/** The PLAYER_EXISTS constant. */
	PLAYER_EXISTS(6001),
	/** The PLAYER_NOT_EXISTS constant. */
	PLAYER_NOT_EXISTS(6002),
	/** The PLAYER_NAME_EXISTS constant. */
	PLAYER_NAME_EXISTS(6003),
	/** The PLAYER_AVATAR_EXISTS constant. */
	PLAYER_AVATAR_EXISTS(6004),
	/** The PLAYER_AVATAR_NOT_EXISTS constant. */
	PLAYER_AVATAR_NOT_EXISTS(6005),
	/** The PLAYER_LIMIT_REACHED constant. */
	PLAYER_LIMIT_REACHED(6006),
	/** The PLAYER_ACTION_QUEUE_LIMIT_REACHED constant. */
	PLAYER_ACTION_QUEUE_LIMIT_REACHED(6007),
	/** The PLAYER_SIGNUPS_NOT_ENABLED constant. */
	PLAYER_SIGNUPS_NOT_ENABLED(6008),
	/** The PLAYER_NOT_LOGGED_IN constant. */
	PLAYER_NOT_LOGGED_IN(6009),
	/** The PLAYER_NOT_SIGNED_UP constant. */
	PLAYER_NOT_SIGNED_UP(6010),
	/** The PLAYER_ALREADY_SIGNED_UP constant. */
	PLAYER_ALREADY_SIGNED_UP(6011);

	/** The id field. */
	private final int id;

	private PlayerErrorCode(int id) {
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
