package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ClearActionQueuedAtPlayerJsonSerializer implements IJsonSerializer<IClearActionQueuedAtPlayer> {

	private String name;

	public ClearActionQueuedAtPlayerJsonSerializer() {
		this("ClearActionQueuedAtPlayer");
	}

	public ClearActionQueuedAtPlayerJsonSerializer(String name) {
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
	public IClearActionQueuedAtPlayer readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IClearActionQueuedAtPlayer object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getIndex());
		writer.closeObject();
	}
}
