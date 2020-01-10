package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class AddActionPluginJsonSerializer implements IJsonSerializer<IAddActionPlugin> {

	private String name;

	public AddActionPluginJsonSerializer() {
		this("AddActionPlugin");
	}

	public AddActionPluginJsonSerializer(String name) {
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
	public IAddActionPlugin readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddActionPlugin object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPluginName(), new StringSerializer());
		writer.writeObject(object.getPlugin(), new StringSerializer());
		writer.closeObject();
	}
}
