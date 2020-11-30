package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class MobileCreationDataJsonSerializer implements IJsonSerializer<IMobileCreationData> {

	private String name;

	public MobileCreationDataJsonSerializer() {
		this("MobileCreationData");
	}

	public MobileCreationDataJsonSerializer(String name) {
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
	public IMobileCreationData readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMobileCreationData object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getPlayerId());
		writer.writeInt(object.getOriginId());
		writer.writeInt(object.getDestinationId());
		writer.writeInt(object.getMoveTurns());
		writer.writeInt(object.getWaitTurns());
		writer.closeObject();
	}
}
