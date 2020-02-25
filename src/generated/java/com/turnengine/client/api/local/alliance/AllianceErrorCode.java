package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum AllianceErrorCode implements IErrorCode {

	/** The ALLIANCE_EXISTS constant. */
	ALLIANCE_EXISTS(2101),
	/** The ALLIANCE_NOT_EXISTS constant. */
	ALLIANCE_NOT_EXISTS(2102),
	/** The ALLIANCE_LEADER constant. */
	ALLIANCE_LEADER(2103),
	/** The ALLIANCE_NOT_LEADER constant. */
	ALLIANCE_NOT_LEADER(2104),
	/** The ALLIANCE_MEMBER constant. */
	ALLIANCE_MEMBER(2105),
	/** The ALLIANCE_NOT_MEMBER constant. */
	ALLIANCE_NOT_MEMBER(2106),
	/** The ALLIANCE_FULL constant. */
	ALLIANCE_FULL(2107),
	/** The ALLIANCE_NOT_FULL constant. */
	ALLIANCE_NOT_FULL(2108),
	/** The ALLIANCE_EMPTY constant. */
	ALLIANCE_EMPTY(2109),
	/** The ALLIANCE_NOT_EMPTY constant. */
	ALLIANCE_NOT_EMPTY(2110),
	/** The ALLIANCE_INVITE_LIMIT_REACHED constant. */
	ALLIANCE_INVITE_LIMIT_REACHED(2111),
	/** The ALLIANCE_NOT_PRIVILEGED constant. */
	ALLIANCE_NOT_PRIVILEGED(2112),
	/** The ALLIANCE_AVATAR_NOT_EXISTS constant. */
	ALLIANCE_AVATAR_NOT_EXISTS(2113),
	/** The ALLIANCE_MEMBER_LEAVING constant. */
	ALLIANCE_MEMBER_LEAVING(2114);

	/** The id field. */
	private final int id;

	private AllianceErrorCode(int id) {
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
