package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetCommandStackTraceListJsonSerializer implements IJsonSerializer<IGetCommandStackTraceList> {

	private String name;

	public GetCommandStackTraceListJsonSerializer() {
		this("GetCommandStackTraceList");
	}

	public GetCommandStackTraceListJsonSerializer(String name) {
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
	public IGetCommandStackTraceList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetCommandStackTraceList object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeLong(object.getFrom());
		writer.writeLong(object.getTo());
		writer.closeObject();
	}
}
