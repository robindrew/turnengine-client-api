package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ForumPostXmlSerializer implements IXmlSerializer<IForumPost> {

	private String name;

	public ForumPostXmlSerializer() {
		this("ForumPost");
	}

	public ForumPostXmlSerializer(String name) {
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
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		int param2 = reader.readInt("threadId");
		int param3 = reader.readInt("forumId");
		int param4 = reader.readInt("date");
		int param5 = reader.readInt("lastEdited");
		IForumUser param6 = reader.readObject(new ForumUserXmlSerializer("poster"));
		String param7 = reader.readObject(new StringSerializer("subject"));
		String param8 = reader.readObject(new StringSerializer("content"));
		boolean param9 = reader.readBoolean("deleted");
		reader.endElement(getName());

		// Create the bean
		return new ForumPost(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeObject(IXmlWriter writer, IForumPost object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeInt("threadId", object.getThreadId());
		writer.writeInt("forumId", object.getForumId());
		writer.writeInt("date", object.getDate());
		writer.writeInt("lastEdited", object.getLastEdited());
		writer.writeObject(object.getPoster(), new ForumUserXmlSerializer("poster"));
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.writeBoolean("deleted", object.getDeleted());
		writer.endElement(getName());
	}
}
