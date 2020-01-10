package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class CreateForumJsonSerializer implements IJsonSerializer<ICreateForum> {

	private String name;

	public CreateForumJsonSerializer() {
		this("CreateForum");
	}

	public CreateForumJsonSerializer(String name) {
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
	public ICreateForum readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ICreateForum object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getParent());
		writer.closeObject();
	}
}
