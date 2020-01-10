package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetLoggedExceptionsJsonSerializer implements IJsonSerializer<IGetLoggedExceptions> {

	private String name;

	public GetLoggedExceptionsJsonSerializer() {
		this("GetLoggedExceptions");
	}

	public GetLoggedExceptionsJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public IGetLoggedExceptions readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetLoggedExceptions object) {
		writer.openObject();
		writer.closeObject();
	}
}
