package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ListActionsExecutingAtLocationJsonSerializer implements IJsonSerializer<IListActionsExecutingAtLocation> {

	private String name;

	public ListActionsExecutingAtLocationJsonSerializer() {
		this("ListActionsExecutingAtLocation");
	}

	public ListActionsExecutingAtLocationJsonSerializer(String name) {
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
	public IListActionsExecutingAtLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IListActionsExecutingAtLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.closeObject();
	}
}
