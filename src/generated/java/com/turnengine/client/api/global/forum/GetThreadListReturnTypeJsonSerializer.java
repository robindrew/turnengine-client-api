package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetThreadListReturnTypeJsonSerializer implements IJsonSerializer<List<IForumThread>> {

	private String name;

	public GetThreadListReturnTypeJsonSerializer() {
		this("GetThreadListReturnType");
	}

	public GetThreadListReturnTypeJsonSerializer(String name) {
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
	public List<IForumThread> readObject(IJsonReader reader) {
		return new ListSerializer<IForumThread>(new ForumThreadJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IForumThread> object) {
		new ListSerializer<IForumThread>(new ForumThreadJsonSerializer()).writeObject(writer, object);
	}
}
