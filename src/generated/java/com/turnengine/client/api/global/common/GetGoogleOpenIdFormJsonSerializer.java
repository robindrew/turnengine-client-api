package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGoogleOpenIdFormJsonSerializer implements IJsonSerializer<IGetGoogleOpenIdForm> {

	private String name;

	public GetGoogleOpenIdFormJsonSerializer() {
		this("GetGoogleOpenIdForm");
	}

	public GetGoogleOpenIdFormJsonSerializer(String name) {
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
	public IGetGoogleOpenIdForm readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGoogleOpenIdForm object) {
		writer.openObject();
		writer.closeObject();
	}
}
