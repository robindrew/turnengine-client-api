package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetAvailableServiceListJsonSerializer implements IJsonSerializer<IGetAvailableServiceList> {

	private String name;

	public GetAvailableServiceListJsonSerializer() {
		this("GetAvailableServiceList");
	}

	public GetAvailableServiceListJsonSerializer(String name) {
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
	public IGetAvailableServiceList readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAvailableServiceList object) {
		writer.openObject();
		writer.writeObject(object.getProject(), new StringSerializer());
		writer.closeObject();
	}
}
