package com.turnengine.client.api.local.property;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetLocalPropertyJsonSerializer implements IJsonSerializer<ISetLocalProperty> {

	private String name;

	public SetLocalPropertyJsonSerializer() {
		this("SetLocalProperty");
	}

	public SetLocalPropertyJsonSerializer(String name) {
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
	public ISetLocalProperty readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetLocalProperty object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer());
		writer.writeObject(object.getValue(), new StringSerializer());
		writer.closeObject();
	}
}
