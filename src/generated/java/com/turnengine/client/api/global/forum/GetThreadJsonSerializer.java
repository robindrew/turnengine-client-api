package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetThreadJsonSerializer implements IJsonSerializer<IGetThread> {

	private String name;

	public GetThreadJsonSerializer() {
		this("GetThread");
	}

	public GetThreadJsonSerializer(String name) {
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
	public IGetThread readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetThread object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getThreadId());
		writer.closeObject();
	}
}
