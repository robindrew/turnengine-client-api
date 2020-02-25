package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum MessageErrorCode implements IErrorCode {

	/** The MESSAGE_RECIPIENT_INVALID constant. */
	MESSAGE_RECIPIENT_INVALID(2901),
	/** The MESSAGE_NOT_SENDER_OR_RECIPIENT constant. */
	MESSAGE_NOT_SENDER_OR_RECIPIENT(2902),
	/** The MESSAGE_NOT_EXISTS constant. */
	MESSAGE_NOT_EXISTS(2903);

	/** The id field. */
	private final int id;

	private MessageErrorCode(int id) {
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
