package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddActionTargetReturnTypeJsonSerializer implements IJsonSerializer<IActionTarget> {

	private String name;

	public AddActionTargetReturnTypeJsonSerializer() {
		this("AddActionTargetReturnType");
	}

	public AddActionTargetReturnTypeJsonSerializer(String name) {
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
	public IActionTarget readObject(IJsonReader reader) {
		return new ActionTargetJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionTarget object) {
		new ActionTargetJsonSerializer().writeObject(writer, object);
	}
}
