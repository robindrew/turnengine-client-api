package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class StartActionAtMobileToLocationJsonSerializer implements IJsonSerializer<IStartActionAtMobileToLocation> {

	private String name;

	public StartActionAtMobileToLocationJsonSerializer() {
		this("StartActionAtMobileToLocation");
	}

	public StartActionAtMobileToLocationJsonSerializer(String name) {
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
	public IStartActionAtMobileToLocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IStartActionAtMobileToLocation object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.writeBoolean(object.getAddToQueue());
		writer.closeObject();
	}
}
