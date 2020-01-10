package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum UserErrorCode implements IErrorCode {

	/** The USER_EXISTS constant. */
	USER_EXISTS(1701),
	/** The USER_NAME_EXISTS constant. */
	USER_NAME_EXISTS(1702),
	/** The USER_NAME_NOT_EXISTS constant. */
	USER_NAME_NOT_EXISTS(1703),
	/** The USER_EMAIL_EXISTS constant. */
	USER_EMAIL_EXISTS(1704),
	/** The USER_NOT_EXISTS constant. */
	USER_NOT_EXISTS(1705),
	/** The USER_NOT_VERIFIED constant. */
	USER_NOT_VERIFIED(1706),
	/** The USER_INCORRECT_VERIFICATION_CODE constant. */
	USER_INCORRECT_VERIFICATION_CODE(1707),
	/** The USER_NOT_LOGGED_IN constant. */
	USER_NOT_LOGGED_IN(1708),
	/** The USER_NOT_SIGNED_UP constant. */
	USER_NOT_SIGNED_UP(1709),
	/** The USER_LOGIN_FAILED constant. */
	USER_LOGIN_FAILED(1710),
	/** The USER_LOGIN_EXPIRED constant. */
	USER_LOGIN_EXPIRED(1711),
	/** The USER_LOGIN_BLOCKED constant. */
	USER_LOGIN_BLOCKED(1712),
	/** The USER_INCORRECT_PASSWORD constant. */
	USER_INCORRECT_PASSWORD(1713),
	/** The USER_NOT_AUTHORISED constant. */
	USER_NOT_AUTHORISED(1714),
	/** The USER_LOGIN_INVALID constant. */
	USER_LOGIN_INVALID(1715),
	/** The USER_PASSWORD_INVALID constant. */
	USER_PASSWORD_INVALID(1716),
	/** The USER_NAME_INVALID constant. */
	USER_NAME_INVALID(1717),
	/** The USER_EMAIL_NOT_EXISTS constant. */
	USER_EMAIL_NOT_EXISTS(1718);

	/** The id field. */
	private final int id;

	private UserErrorCode(int id) {
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
