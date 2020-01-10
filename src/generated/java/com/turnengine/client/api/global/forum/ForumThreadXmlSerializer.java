package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import java.util.List;

public class ForumThreadXmlSerializer implements IXmlSerializer<IForumThread> {

	private String name;

	public ForumThreadXmlSerializer() {
		this("ForumThread");
	}

	public ForumThreadXmlSerializer(String name) {
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
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		int param2 = reader.readInt("forumId");
		int param3 = reader.readInt("date");
		int param4 = reader.readInt("lastUpdated");
		String param5 = reader.readObject(new StringSerializer("subject"));
		IForumUser param6 = reader.readObject(new ForumUserXmlSerializer("poster"));
		boolean param7 = reader.readBoolean("sticky");
		boolean param8 = reader.readBoolean("locked");
		boolean param9 = reader.readBoolean("archived");
		boolean param10 = reader.readBoolean("deleted");
		List<IForumPost> param11 = reader.readObject(new ListSerializer<IForumPost>("postList", new ForumPostXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new ForumThread(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
	}

	@Override
	public void writeObject(IXmlWriter writer, IForumThread object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeInt("forumId", object.getForumId());
		writer.writeInt("date", object.getDate());
		writer.writeInt("lastUpdated", object.getLastUpdated());
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getPoster(), new ForumUserXmlSerializer("poster"));
		writer.writeBoolean("sticky", object.getSticky());
		writer.writeBoolean("locked", object.getLocked());
		writer.writeBoolean("archived", object.getArchived());
		writer.writeBoolean("deleted", object.getDeleted());
		writer.writeObject(object.getPostList(), new ListSerializer<IForumPost>("postList", new ForumPostXmlSerializer("element")));
		writer.endElement(getName());
	}
}
