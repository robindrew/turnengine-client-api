package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class AddChildGroupJsonSerializer implements IJsonSerializer<IAddChildGroup> {

	private String name;

	public AddChildGroupJsonSerializer() {
		this("AddChildGroup");
	}

	public AddChildGroupJsonSerializer(String name) {
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
	public IAddChildGroup readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddChildGroup object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getParentName(), new StringSerializer());
		writer.writeObject(object.getFactionName(), new StringSerializer());
		writer.closeObject();
	}
}
