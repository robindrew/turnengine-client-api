package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class MobilePropertyJsonSerializer implements IJsonSerializer<IMobileProperty> {

	private String name;

	public MobilePropertyJsonSerializer() {
		this("MobileProperty");
	}

	public MobilePropertyJsonSerializer(String name) {
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
	public IMobileProperty readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMobileProperty object) {
		writer.openObject();
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getKey(), new StringSerializer());
		writer.writeObject(object.getValue(), new StringSerializer());
		writer.closeObject();
	}
}
