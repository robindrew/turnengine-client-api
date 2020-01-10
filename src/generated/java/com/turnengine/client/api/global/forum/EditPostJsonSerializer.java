package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class EditPostJsonSerializer implements IJsonSerializer<IEditPost> {

	private String name;

	public EditPostJsonSerializer() {
		this("EditPost");
	}

	public EditPostJsonSerializer(String name) {
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
	public IEditPost readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IEditPost object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getPostId());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.closeObject();
	}
}
