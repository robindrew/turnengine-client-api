package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.error.IErrorCode;

public enum StorageErrorCode implements IErrorCode {

	/** The STORAGE_INVALID constant. */
	STORAGE_INVALID(6501);

	/** The id field. */
	private final int id;

	private StorageErrorCode(int id) {
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
