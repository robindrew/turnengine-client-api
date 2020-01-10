package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ClearActionsQueuedAtPlayerJsonSerializer implements IJsonSerializer<IClearActionsQueuedAtPlayer> {

	private String name;

	public ClearActionsQueuedAtPlayerJsonSerializer() {
		this("ClearActionsQueuedAtPlayer");
	}

	public ClearActionsQueuedAtPlayerJsonSerializer(String name) {
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
	public IClearActionsQueuedAtPlayer readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IClearActionsQueuedAtPlayer object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
		writer.closeObject();
	}
}
