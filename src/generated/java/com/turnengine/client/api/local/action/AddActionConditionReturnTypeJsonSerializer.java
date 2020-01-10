package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddActionConditionReturnTypeJsonSerializer implements IJsonSerializer<IActionCondition> {

	private String name;

	public AddActionConditionReturnTypeJsonSerializer() {
		this("AddActionConditionReturnType");
	}

	public AddActionConditionReturnTypeJsonSerializer(String name) {
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
	public IActionCondition readObject(IJsonReader reader) {
		return new ActionConditionJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionCondition object) {
		new ActionConditionJsonSerializer().writeObject(writer, object);
	}
}
