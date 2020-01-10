package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum MessageErrorCode implements IErrorCode {

	/** The MESSAGE_RECIPIENT_INVALID constant. */
	MESSAGE_RECIPIENT_INVALID(5801),
	/** The MESSAGE_NOT_SENDER_OR_RECIPIENT constant. */
	MESSAGE_NOT_SENDER_OR_RECIPIENT(5802),
	/** The MESSAGE_NOT_EXISTS constant. */
	MESSAGE_NOT_EXISTS(5803);

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
