package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ServiceStatusJsonSerializer implements IJsonSerializer<IServiceStatus> {

	private String name;

	public ServiceStatusJsonSerializer() {
		this("ServiceStatus");
	}

	public ServiceStatusJsonSerializer(String name) {
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
	public IServiceStatus readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IServiceStatus object) {
		writer.openObject();
		writer.writeObject(object.getService(), new StringSerializer());
		writer.writeObject(object.getRelease(), new StringSerializer());
		writer.writeLong(object.getMemory());
		writer.writeDouble(object.getHeap());
		writer.writeDouble(object.getPerm());
		writer.writeDouble(object.getCpu());
		writer.writeInt(object.getCpuCount());
		writer.writeInt(object.getThreads());
		writer.writeInt(object.getClasses());
		writer.writeLong(object.getExceptions());
		writer.writeLong(object.getStarted());
		writer.writeLong(object.getUptime());
		writer.writeObject(object.getUser(), new StringSerializer());
		writer.writeObject(object.getHost(), new StringSerializer());
		writer.writeObject(object.getAddress(), new StringSerializer());
		writer.writeLong(object.getProcess());
		writer.closeObject();
	}
}
