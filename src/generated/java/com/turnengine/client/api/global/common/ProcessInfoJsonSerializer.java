package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ProcessInfoJsonSerializer implements IJsonSerializer<IProcessInfo> {

	private String name;

	public ProcessInfoJsonSerializer() {
		this("ProcessInfo");
	}

	public ProcessInfoJsonSerializer(String name) {
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
	public IProcessInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IProcessInfo object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getProject(), new ProjectInfoJsonSerializer());
		writer.writeObject(object.getService(), new ServiceInfoJsonSerializer());
		writer.writeObject(object.getRelease(), new ReleaseInfoJsonSerializer());
		writer.writeInt(object.getPort());
		writer.closeObject();
	}
}
