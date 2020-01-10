package com.turnengine.client.api.common.plugin;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class PluginDetailsJsonSerializer implements IJsonSerializer<IPluginDetails> {

	private String name;

	public PluginDetailsJsonSerializer() {
		this("PluginDetails");
	}

	public PluginDetailsJsonSerializer(String name) {
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
	public IPluginDetails readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPluginDetails object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getXml(), new StringSerializer());
		writer.closeObject();
	}
}
