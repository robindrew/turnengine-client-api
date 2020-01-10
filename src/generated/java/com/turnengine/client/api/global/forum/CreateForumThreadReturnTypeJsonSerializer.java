package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class CreateForumThreadReturnTypeJsonSerializer implements IJsonSerializer<IForumThread> {

	private String name;

	public CreateForumThreadReturnTypeJsonSerializer() {
		this("CreateForumThreadReturnType");
	}

	public CreateForumThreadReturnTypeJsonSerializer(String name) {
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
	public IForumThread readObject(IJsonReader reader) {
		return new ForumThreadJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IForumThread object) {
		new ForumThreadJsonSerializer().writeObject(writer, object);
	}
}
