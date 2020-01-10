package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum AllianceErrorCode implements IErrorCode {

	/** The ALLIANCE_EXISTS constant. */
	ALLIANCE_EXISTS(5101),
	/** The ALLIANCE_NOT_EXISTS constant. */
	ALLIANCE_NOT_EXISTS(5102),
	/** The ALLIANCE_LEADER constant. */
	ALLIANCE_LEADER(5103),
	/** The ALLIANCE_NOT_LEADER constant. */
	ALLIANCE_NOT_LEADER(5104),
	/** The ALLIANCE_MEMBER constant. */
	ALLIANCE_MEMBER(5105),
	/** The ALLIANCE_NOT_MEMBER constant. */
	ALLIANCE_NOT_MEMBER(5106),
	/** The ALLIANCE_FULL constant. */
	ALLIANCE_FULL(5107),
	/** The ALLIANCE_NOT_FULL constant. */
	ALLIANCE_NOT_FULL(5108),
	/** The ALLIANCE_EMPTY constant. */
	ALLIANCE_EMPTY(5109),
	/** The ALLIANCE_NOT_EMPTY constant. */
	ALLIANCE_NOT_EMPTY(5110),
	/** The ALLIANCE_INVITE_LIMIT_REACHED constant. */
	ALLIANCE_INVITE_LIMIT_REACHED(5111),
	/** The ALLIANCE_NOT_PRIVILEGED constant. */
	ALLIANCE_NOT_PRIVILEGED(5112),
	/** The ALLIANCE_AVATAR_NOT_EXISTS constant. */
	ALLIANCE_AVATAR_NOT_EXISTS(5113),
	/** The ALLIANCE_MEMBER_LEAVING constant. */
	ALLIANCE_MEMBER_LEAVING(5114);

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
