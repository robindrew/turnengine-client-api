package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ActionAvailableJsonSerializer implements IJsonSerializer<IActionAvailable> {

	private String name;

	public ActionAvailableJsonSerializer() {
		this("ActionAvailable");
	}

	public ActionAvailableJsonSerializer(String name) {
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
	public IActionAvailable readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionAvailable object) {
		writer.openObject();
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.closeObject();
	}
}
