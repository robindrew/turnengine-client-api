package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ProjectInfoJsonSerializer implements IJsonSerializer<IProjectInfo> {

	private String name;

	public ProjectInfoJsonSerializer() {
		this("ProjectInfo");
	}

	public ProjectInfoJsonSerializer(String name) {
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
	public IProjectInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IProjectInfo object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.closeObject();
	}
}
