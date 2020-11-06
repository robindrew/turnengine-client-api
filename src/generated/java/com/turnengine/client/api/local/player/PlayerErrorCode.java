package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum PlayerErrorCode implements IErrorCode {

	/** The PLAYER_EXISTS constant. */
	PLAYER_EXISTS(3101),
	/** The PLAYER_NOT_EXISTS constant. */
	PLAYER_NOT_EXISTS(3102),
	/** The PLAYER_NAME_EXISTS constant. */
	PLAYER_NAME_EXISTS(3103),
	/** The PLAYER_AVATAR_EXISTS constant. */
	PLAYER_AVATAR_EXISTS(3104),
	/** The PLAYER_AVATAR_NOT_EXISTS constant. */
	PLAYER_AVATAR_NOT_EXISTS(3105),
	/** The PLAYER_LIMIT_REACHED constant. */
	PLAYER_LIMIT_REACHED(3106),
	/** The PLAYER_ACTION_QUEUE_LIMIT_REACHED constant. */
	PLAYER_ACTION_QUEUE_LIMIT_REACHED(3107),
	/** The PLAYER_SIGNUPS_NOT_ENABLED constant. */
	PLAYER_SIGNUPS_NOT_ENABLED(3108),
	/** The PLAYER_NOT_LOGGED_IN constant. */
	PLAYER_NOT_LOGGED_IN(3109),
	/** The PLAYER_NOT_SIGNED_UP constant. */
	PLAYER_NOT_SIGNED_UP(3110),
	/** The PLAYER_ALREADY_SIGNED_UP constant. */
	PLAYER_ALREADY_SIGNED_UP(3111),
	/** The PLAYERS_EXIST constant. */
	PLAYERS_EXIST(3112),
	/** The PLAYER_SIGNUP_PLUGIN_NOT_CONFIGURED constant. */
	PLAYER_SIGNUP_PLUGIN_NOT_CONFIGURED(3113);

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
