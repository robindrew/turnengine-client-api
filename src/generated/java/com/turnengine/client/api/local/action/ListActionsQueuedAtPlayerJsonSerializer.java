package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ListActionsQueuedAtPlayerJsonSerializer implements IJsonSerializer<IListActionsQueuedAtPlayer> {

	private String name;

	public ListActionsQueuedAtPlayerJsonSerializer() {
		this("ListActionsQueuedAtPlayer");
	}

	public ListActionsQueuedAtPlayerJsonSerializer(String name) {
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
	public IListActionsQueuedAtPlayer readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IListActionsQueuedAtPlayer object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
