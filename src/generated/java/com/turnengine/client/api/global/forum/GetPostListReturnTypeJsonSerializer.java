package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetPostListReturnTypeJsonSerializer implements IJsonSerializer<List<IForumPost>> {

	private String name;

	public GetPostListReturnTypeJsonSerializer() {
		this("GetPostListReturnType");
	}

	public GetPostListReturnTypeJsonSerializer(String name) {
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
	public List<IForumPost> readObject(IJsonReader reader) {
		return new ListSerializer<IForumPost>(new ForumPostJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IForumPost> object) {
		new ListSerializer<IForumPost>(new ForumPostJsonSerializer()).writeObject(writer, object);
	}
}
