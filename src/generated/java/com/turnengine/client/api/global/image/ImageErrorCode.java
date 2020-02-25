package com.turnengine.client.api.global.image;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum ImageErrorCode implements IErrorCode {

	/** The IMAGE_DATA_INVALID constant. */
	IMAGE_DATA_INVALID(201),
	/** The IMAGE_WIDTH_INVALID constant. */
	IMAGE_WIDTH_INVALID(202),
	/** The IMAGE_HEIGHT_INVALID constant. */
	IMAGE_HEIGHT_INVALID(203);

	/** The id field. */
	private final int id;

	private ImageErrorCode(int id) {
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
