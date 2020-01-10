package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetCommandStackTraceJsonSerializer implements IJsonSerializer<IGetCommandStackTrace> {

	private String name;

	public GetCommandStackTraceJsonSerializer() {
		this("GetCommandStackTrace");
	}

	public GetCommandStackTraceJsonSerializer(String name) {
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
	public IGetCommandStackTrace readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetCommandStackTrace object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeLong(object.getId());
		writer.closeObject();
	}
}
