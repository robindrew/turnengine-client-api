package com.turnengine.client.api.global.translation;

public enum TranslationErrorCode {

	/** The TRANSLATION_EXISTS constant. */
	TRANSLATION_EXISTS(1601),
	/** The TRANSLATION_NOT_EXISTS constant. */
	TRANSLATION_NOT_EXISTS(1602);

	/** The id field. */
	private final int id;

	private TranslationErrorCode(int id) {
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
