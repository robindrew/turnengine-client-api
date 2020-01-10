package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetTradeAtLocationPluginJsonSerializer implements IJsonSerializer<ISetTradeAtLocationPlugin> {

	private String name;

	public SetTradeAtLocationPluginJsonSerializer() {
		this("SetTradeAtLocationPlugin");
	}

	public SetTradeAtLocationPluginJsonSerializer(String name) {
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
	public ISetTradeAtLocationPlugin readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetTradeAtLocationPlugin object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPlugin(), new StringSerializer());
		writer.closeObject();
	}
}
