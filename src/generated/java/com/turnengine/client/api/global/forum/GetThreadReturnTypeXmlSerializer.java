package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetThreadReturnTypeXmlSerializer implements IXmlSerializer<IForumThread> {

	private String name;

	public GetThreadReturnTypeXmlSerializer() {
		this("GetThreadReturnType");
	}

	public GetThreadReturnTypeXmlSerializer(String name) {
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
	public IForumThread readObject(IXmlReader reader) {
		return new ForumThreadXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IForumThread object) {
		new ForumThreadXmlSerializer(getName()).writeObject(writer, object);
	}
}
