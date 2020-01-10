package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetServiceProcessListJsonSerializer implements IJsonSerializer<IGetServiceProcessList> {

	private String name;

	public GetServiceProcessListJsonSerializer() {
		this("GetServiceProcessList");
	}

	public GetServiceProcessListJsonSerializer(String name) {
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
	public IGetServiceProcessList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetServiceProcessList object) {
		writer.openObject();
		writer.writeObject(object.getProject(), new StringSerializer());
		writer.closeObject();
	}
}
