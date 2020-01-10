package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.IntArraySerializer;

public class CoordinateJsonSerializer implements IJsonSerializer<ICoordinate> {

	private String name;

	public CoordinateJsonSerializer() {
		this("Coordinate");
	}

	public CoordinateJsonSerializer(String name) {
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
	public ICoordinate readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ICoordinate object) {
		writer.openObject();
		writer.writeInt(object.getLocationId());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer());
		writer.closeObject();
	}
}
