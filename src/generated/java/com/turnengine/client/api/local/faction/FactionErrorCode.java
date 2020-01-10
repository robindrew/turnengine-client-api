package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum FactionErrorCode implements IErrorCode {

	/** The FACTION_EXISTS constant. */
	FACTION_EXISTS(5501),
	/** The FACTION_NOT_EXISTS constant. */
	FACTION_NOT_EXISTS(5502),
	/** The FACTION_PLAYER_LIMIT_REACHED constant. */
	FACTION_PLAYER_LIMIT_REACHED(5503),
	/** The FACTION_NOT_MEMBER constant. */
	FACTION_NOT_MEMBER(5504);

	/** The id field. */
	private final int id;

	private FactionErrorCode(int id) {
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
