package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ClearActionsQueuedAtLocationJsonSerializer implements IJsonSerializer<IClearActionsQueuedAtLocation> {

	private String name;

	public ClearActionsQueuedAtLocationJsonSerializer() {
		this("ClearActionsQueuedAtLocation");
	}

	public ClearActionsQueuedAtLocationJsonSerializer(String name) {
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
	public IClearActionsQueuedAtLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IClearActionsQueuedAtLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getGroupId());
		writer.closeObject();
	}
}
