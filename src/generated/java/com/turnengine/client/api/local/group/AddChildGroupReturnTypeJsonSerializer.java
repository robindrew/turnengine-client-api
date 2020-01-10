package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddChildGroupReturnTypeJsonSerializer implements IJsonSerializer<IGroup> {

	private String name;

	public AddChildGroupReturnTypeJsonSerializer() {
		this("AddChildGroupReturnType");
	}

	public AddChildGroupReturnTypeJsonSerializer(String name) {
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
	public IGroup readObject(IJsonReader reader) {
		return new GroupJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGroup object) {
		new GroupJsonSerializer().writeObject(writer, object);
	}
}
