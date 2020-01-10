package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import java.util.List;

public class ForumThreadJsonSerializer implements IJsonSerializer<IForumThread> {

	private String name;

	public ForumThreadJsonSerializer() {
		this("ForumThread");
	}

	public ForumThreadJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IForumThread object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getDate());
		writer.writeInt(object.getLastUpdated());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getPoster(), new ForumUserJsonSerializer());
		writer.writeBoolean(object.getSticky());
		writer.writeBoolean(object.getLocked());
		writer.writeBoolean(object.getArchived());
		writer.writeBoolean(object.getDeleted());
		writer.writeObject(object.getPostList(), new ListSerializer<IForumPost>(new ForumPostJsonSerializer()));
		writer.closeObject();
	}
}
