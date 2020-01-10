package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class CreateForumPostReturnTypeJsonSerializer implements IJsonSerializer<IForumPost> {

	private String name;

	public CreateForumPostReturnTypeJsonSerializer() {
		this("CreateForumPostReturnType");
	}

	public CreateForumPostReturnTypeJsonSerializer(String name) {
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
	public IForumPost readObject(IJsonReader reader) {
		return new ForumPostJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IForumPost object) {
		new ForumPostJsonSerializer().writeObject(writer, object);
	}
}
