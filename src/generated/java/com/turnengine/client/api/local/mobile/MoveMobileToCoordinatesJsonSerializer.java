package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.IntArraySerializer;

public class MoveMobileToCoordinatesJsonSerializer implements IJsonSerializer<IMoveMobileToCoordinates> {

	private String name;

	public MoveMobileToCoordinatesJsonSerializer() {
		this("MoveMobileToCoordinates");
	}

	public MoveMobileToCoordinatesJsonSerializer(String name) {
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
	public IMoveMobileToCoordinates readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMoveMobileToCoordinates object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer());
		writer.writeBoolean(object.getAddToQueue());
		writer.writeBoolean(object.getRepeat());
		writer.closeObject();
	}
}
