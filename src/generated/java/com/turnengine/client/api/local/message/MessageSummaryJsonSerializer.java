package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class MessageSummaryJsonSerializer implements IJsonSerializer<IMessageSummary> {

	private String name;

	public MessageSummaryJsonSerializer() {
		this("MessageSummary");
	}

	public MessageSummaryJsonSerializer(String name) {
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
	public IMessageSummary readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMessageSummary object) {
		writer.openObject();
		writer.writeInt(object.getNewsRead());
		writer.writeInt(object.getNewsUnread());
		writer.writeInt(object.getMailRead());
		writer.writeInt(object.getMailUnread());
		writer.writeInt(object.getNoteRead());
		writer.writeInt(object.getNoteUnread());
		writer.closeObject();
	}
}
