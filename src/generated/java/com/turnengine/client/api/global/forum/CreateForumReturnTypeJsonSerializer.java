package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class CreateForumReturnTypeJsonSerializer implements IJsonSerializer<IForum> {

	private String name;

	public CreateForumReturnTypeJsonSerializer() {
		this("CreateForumReturnType");
	}

	public CreateForumReturnTypeJsonSerializer(String name) {
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
	public IForum readObject(IJsonReader reader) {
		return new ForumJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IForum object) {
		new ForumJsonSerializer().writeObject(writer, object);
	}
}
