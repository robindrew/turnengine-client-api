package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class StartActionMovementReturnTypeJsonSerializer implements IJsonSerializer<IActionStatus> {

	private String name;

	public StartActionMovementReturnTypeJsonSerializer() {
		this("StartActionMovementReturnType");
	}

	public StartActionMovementReturnTypeJsonSerializer(String name) {
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
	public IActionStatus readObject(IJsonReader reader) {
		return new ActionStatusJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionStatus object) {
		new ActionStatusJsonSerializer().writeObject(writer, object);
	}
}
