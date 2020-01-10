package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum AnnouncementErrorCode implements IErrorCode {

	/** The ANNOUNCEMENT_EXISTS constant. */
	ANNOUNCEMENT_EXISTS(101),
	/** The ANNOUNCEMENT_NOT_EXISTS constant. */
	ANNOUNCEMENT_NOT_EXISTS(102);

	/** The id field. */
	private final int id;

	private AnnouncementErrorCode(int id) {
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
