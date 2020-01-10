package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ActionStatusJsonSerializer implements IJsonSerializer<IActionStatus> {

	private String name;

	public ActionStatusJsonSerializer() {
		this("ActionStatus");
	}

	public ActionStatusJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionStatus object) {
		writer.openObject();
		writer.writeLong(object.getAmount());
		writer.writeObject(object.getFormat(), new StringSerializer());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.closeObject();
	}
}
