package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class StartActionAtLocationToLocationJsonSerializer implements IJsonSerializer<IStartActionAtLocationToLocation> {

	private String name;

	public StartActionAtLocationToLocationJsonSerializer() {
		this("StartActionAtLocationToLocation");
	}

	public StartActionAtLocationToLocationJsonSerializer(String name) {
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
	public IStartActionAtLocationToLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IStartActionAtLocationToLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getFromLocationId());
		writer.writeInt(object.getToLocationId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.writeBoolean(object.getAddToQueue());
		writer.closeObject();
	}
}
