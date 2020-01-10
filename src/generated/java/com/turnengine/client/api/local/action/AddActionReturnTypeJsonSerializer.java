package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddActionReturnTypeJsonSerializer implements IJsonSerializer<IAction> {

	private String name;

	public AddActionReturnTypeJsonSerializer() {
		this("AddActionReturnType");
	}

	public AddActionReturnTypeJsonSerializer(String name) {
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
	public IAction readObject(IJsonReader reader) {
		return new ActionJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAction object) {
		new ActionJsonSerializer().writeObject(writer, object);
	}
}
