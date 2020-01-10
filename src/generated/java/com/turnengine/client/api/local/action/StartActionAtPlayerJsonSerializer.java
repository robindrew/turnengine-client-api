package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class StartActionAtPlayerJsonSerializer implements IJsonSerializer<IStartActionAtPlayer> {

	private String name;

	public StartActionAtPlayerJsonSerializer() {
		this("StartActionAtPlayer");
	}

	public StartActionAtPlayerJsonSerializer(String name) {
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
	public IStartActionAtPlayer readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IStartActionAtPlayer object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.writeBoolean(object.getAddToQueue());
		writer.closeObject();
	}
}
