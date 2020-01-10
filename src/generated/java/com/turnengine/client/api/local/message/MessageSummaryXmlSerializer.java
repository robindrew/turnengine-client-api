package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class MessageSummaryXmlSerializer implements IXmlSerializer<IMessageSummary> {

	private String name;

	public MessageSummaryXmlSerializer() {
		this("MessageSummary");
	}

	public MessageSummaryXmlSerializer(String name) {
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
	public IMessageSummary readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("newsRead");
		int param2 = reader.readInt("newsUnread");
		int param3 = reader.readInt("mailRead");
		int param4 = reader.readInt("mailUnread");
		int param5 = reader.readInt("noteRead");
		int param6 = reader.readInt("noteUnread");
		reader.endElement(getName());

		// Create the bean
		return new MessageSummary(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMessageSummary object) {
		writer.startElement(getName());
		writer.writeInt("newsRead", object.getNewsRead());
		writer.writeInt("newsUnread", object.getNewsUnread());
		writer.writeInt("mailRead", object.getMailRead());
		writer.writeInt("mailUnread", object.getMailUnread());
		writer.writeInt("noteRead", object.getNoteRead());
		writer.writeInt("noteUnread", object.getNoteUnread());
		writer.endElement(getName());
	}
}
