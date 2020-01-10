package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum ForumErrorCode implements IErrorCode {

	/** The FORUM_EXISTS constant. */
	FORUM_EXISTS(4001),
	/** The FORUM_NOT_EXISTS constant. */
	FORUM_NOT_EXISTS(4002),
	/** The FORUM_INVALID_SUBJECT constant. */
	FORUM_INVALID_SUBJECT(4003),
	/** The FORUM_INVALID_CONTENT constant. */
	FORUM_INVALID_CONTENT(4004),
	/** The FORUM_THREAD_EXISTS constant. */
	FORUM_THREAD_EXISTS(4005),
	/** The FORUM_THREAD_NOT_EXISTS constant. */
	FORUM_THREAD_NOT_EXISTS(4006),
	/** The FORUM_POST_EXISTS constant. */
	FORUM_POST_EXISTS(4007),
	/** The FORUM_POST_NOT_EXISTS constant. */
	FORUM_POST_NOT_EXISTS(4008),
	/** The FORUM_FLAG_INVALID constant. */
	FORUM_FLAG_INVALID(4009);

	/** The id field. */
	private final int id;

	private ForumErrorCode(int id) {
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
