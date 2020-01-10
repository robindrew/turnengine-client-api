package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ServicePersistorPropertiesJsonSerializer implements IJsonSerializer<IServicePersistorProperties> {

	private String name;

	public ServicePersistorPropertiesJsonSerializer() {
		this("ServicePersistorProperties");
	}

	public ServicePersistorPropertiesJsonSerializer(String name) {
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
	public IServicePersistorProperties readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IServicePersistorProperties object) {
		writer.openObject();
		writer.writeObject(object.getDatabase(), new StringSerializer());
		writer.closeObject();
	}
}
