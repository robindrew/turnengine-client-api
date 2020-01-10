package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class CreateAllianceForumThreadXmlSerializer implements IXmlSerializer<ICreateAllianceForumThread> {

	private String name;

	public CreateAllianceForumThreadXmlSerializer() {
		this("CreateAllianceForumThread");
	}

	public CreateAllianceForumThreadXmlSerializer(String name) {
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
	public ICreateAllianceForumThread readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("forumId");
		String param4 = reader.readObject(new StringSerializer("subject"));
		String param5 = reader.readObject(new StringSerializer("content"));
		reader.endElement(getName());

		// Create the bean
		return new CreateAllianceForumThread(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICreateAllianceForumThread object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("forumId", object.getForumId());
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.endElement(getName());
	}
}
