package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class EditPostReturnTypeXmlSerializer implements IXmlSerializer<IForumPost> {

	private String name;

	public EditPostReturnTypeXmlSerializer() {
		this("EditPostReturnType");
	}

	public EditPostReturnTypeXmlSerializer(String name) {
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
	public IForumPost readObject(IXmlReader reader) {
		return new ForumPostXmlSerializer(getName()).readObject(reader);
	}

	@Override
	public void writeObject(IXmlWriter writer, IForumPost object) {
		new ForumPostXmlSerializer(getName()).writeObject(writer, object);
	}
}
