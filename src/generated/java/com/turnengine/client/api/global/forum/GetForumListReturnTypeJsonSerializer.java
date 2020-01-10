package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetForumListReturnTypeJsonSerializer implements IJsonSerializer<List<IForum>> {

	private String name;

	public GetForumListReturnTypeJsonSerializer() {
		this("GetForumListReturnType");
	}

	public GetForumListReturnTypeJsonSerializer(String name) {
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
	public List<IForum> readObject(IJsonReader reader) {
		return new ListSerializer<IForum>(new ForumJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IForum> object) {
		new ListSerializer<IForum>(new ForumJsonSerializer()).writeObject(writer, object);
	}
}
