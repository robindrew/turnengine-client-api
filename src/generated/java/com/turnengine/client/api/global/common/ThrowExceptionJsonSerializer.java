package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ThrowExceptionJsonSerializer implements IJsonSerializer<IThrowException> {

	private String name;

	public ThrowExceptionJsonSerializer() {
		this("ThrowException");
	}

	public ThrowExceptionJsonSerializer(String name) {
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
	public IThrowException readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IThrowException object) {
		writer.openObject();
		writer.closeObject();
	}
}
