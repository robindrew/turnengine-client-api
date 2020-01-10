package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import java.util.List;

public class AllianceForumXmlSerializer implements IXmlSerializer<IAllianceForum> {

	private String name;

	public AllianceForumXmlSerializer() {
		this("AllianceForum");
	}

	public AllianceForumXmlSerializer(String name) {
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
	public IAllianceForum readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("order");
		boolean param4 = reader.readBoolean("locked");
		boolean param5 = reader.readBoolean("archived");
		boolean param6 = reader.readBoolean("deleted");
		int param7 = reader.readInt("threads");
		int param8 = reader.readInt("posts");
		List<IAllianceForum> param9 = reader.readObject(new ListSerializer<IAllianceForum>("forumList", new AllianceForumXmlSerializer("element")));
		List<IAllianceForumThread> param10 = reader.readObject(new ListSerializer<IAllianceForumThread>("threadList", new AllianceForumThreadXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new AllianceForum(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceForum object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("order", object.getOrder());
		writer.writeBoolean("locked", object.getLocked());
		writer.writeBoolean("archived", object.getArchived());
		writer.writeBoolean("deleted", object.getDeleted());
		writer.writeInt("threads", object.getThreads());
		writer.writeInt("posts", object.getPosts());
		writer.writeObject(object.getForumList(), new ListSerializer<IAllianceForum>("forumList", new AllianceForumXmlSerializer("element")));
		writer.writeObject(object.getThreadList(), new ListSerializer<IAllianceForumThread>("threadList", new AllianceForumThreadXmlSerializer("element")));
		writer.endElement(getName());
	}
}
