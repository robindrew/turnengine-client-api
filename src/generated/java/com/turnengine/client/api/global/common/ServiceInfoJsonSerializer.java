package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ServiceInfoJsonSerializer implements IJsonSerializer<IServiceInfo> {

	private String name;

	public ServiceInfoJsonSerializer() {
		this("ServiceInfo");
	}

	public ServiceInfoJsonSerializer(String name) {
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
	public IServiceInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IServiceInfo object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getProject(), new ProjectInfoJsonSerializer());
		writer.closeObject();
	}
}
