package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class EditPostXmlSerializer implements IXmlSerializer<IEditPost> {

	private String name;

	public EditPostXmlSerializer() {
		this("EditPost");
	}

	public EditPostXmlSerializer(String name) {
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
	public IEditPost readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("postId");
		String param3 = reader.readObject(new StringSerializer("subject"));
		String param4 = reader.readObject(new StringSerializer("content"));
		reader.endElement(getName());

		// Create the bean
		return new EditPost(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IEditPost object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("postId", object.getPostId());
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.endElement(getName());
	}
}
