package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ReleaseInfoJsonSerializer implements IJsonSerializer<IReleaseInfo> {

	private String name;

	public ReleaseInfoJsonSerializer() {
		this("ReleaseInfo");
	}

	public ReleaseInfoJsonSerializer(String name) {
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
	public IReleaseInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IReleaseInfo object) {
		writer.openObject();
		writer.writeInt(object.getNumber());
		writer.writeObject(object.getProject(), new ProjectInfoJsonSerializer());
		writer.closeObject();
	}
}
