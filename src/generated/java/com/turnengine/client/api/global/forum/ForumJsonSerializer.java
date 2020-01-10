package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import java.util.List;

public class ForumJsonSerializer implements IJsonSerializer<IForum> {

	private String name;

	public ForumJsonSerializer() {
		this("Forum");
	}

	public ForumJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IForum object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getOrder());
		writer.writeBoolean(object.getLocked());
		writer.writeBoolean(object.getArchived());
		writer.writeBoolean(object.getDeleted());
		writer.writeInt(object.getThreads());
		writer.writeInt(object.getPosts());
		writer.writeObject(object.getForumList(), new ListSerializer<IForum>(new ForumJsonSerializer()));
		writer.writeObject(object.getThreadList(), new ListSerializer<IForumThread>(new ForumThreadJsonSerializer()));
		writer.closeObject();
	}
}
