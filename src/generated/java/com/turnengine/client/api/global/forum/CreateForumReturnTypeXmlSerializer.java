package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class CreateForumReturnTypeXmlSerializer implements IXmlSerializer<IForum> {

	private String name;

	public CreateForumReturnTypeXmlSerializer() {
		this("CreateForumReturnType");
	}

	public CreateForumReturnTypeXmlSerializer(String name) {
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
	public IForum readObject(IXmlReader reader) {
		return new ForumXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IForum object) {
		new ForumXmlSerializer(getName()).writeObject(writer, object);
	}
}
