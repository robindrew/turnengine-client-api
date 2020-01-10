package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class ForumPostJsonSerializer implements IJsonSerializer<IForumPost> {

	private String name;

	public ForumPostJsonSerializer() {
		this("ForumPost");
	}

	public ForumPostJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IForumPost object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeInt(object.getThreadId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getDate());
		writer.writeInt(object.getLastEdited());
		writer.writeObject(object.getPoster(), new ForumUserJsonSerializer());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.writeBoolean(object.getDeleted());
		writer.closeObject();
	}
}
