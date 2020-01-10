package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class LocationPropertyJsonSerializer implements IJsonSerializer<ILocationProperty> {

	private String name;

	public LocationPropertyJsonSerializer() {
		this("LocationProperty");
	}

	public LocationPropertyJsonSerializer(String name) {
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
	public ILocationProperty readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ILocationProperty object) {
		writer.openObject();
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getPlayerId());
		writer.writeObject(object.getKey(), new StringSerializer());
		writer.writeObject(object.getValue(), new StringSerializer());
		writer.closeObject();
	}
}
