package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ActionJsonSerializer implements IJsonSerializer<IAction> {

	private String name;

	public ActionJsonSerializer() {
		this("Action");
	}

	public ActionJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAction object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeInt(object.getTurns());
		writer.writeInt(object.getLimit());
		writer.closeObject();
	}
}
