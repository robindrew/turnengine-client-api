package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;

public class MessageXmlSerializer implements IXmlSerializer<IMessage> {

	private String name;

	public MessageXmlSerializer() {
		this("Message");
	}

	public MessageXmlSerializer(String name) {
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
	public IMessage readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		IPlayerInfo param2 = reader.readObject(new PlayerInfoXmlSerializer("sender"));
		IPlayerInfo param3 = reader.readObject(new PlayerInfoXmlSerializer("recipient"));
		String param4 = reader.readObject(new StringSerializer("subject"));
		int param5 = reader.readInt("threadId");
		String param6 = reader.readObject(new StringSerializer("format"));
		int param7 = reader.readInt("count");
		long param8 = reader.readLong("timestamp");
		MessageStatus param9 = reader.readObject(new EnumSerializer<MessageStatus>(MessageStatus.class, "status"));
		MessageType param10 = reader.readObject(new EnumSerializer<MessageType>(MessageType.class, "type"));
		int param11 = reader.readInt("locationId");
		int param12 = reader.readInt("mobileId");
		String param13 = reader.readObject(new StringSerializer("content"));
		reader.endElement(getName());

		// Create the bean
		return new Message(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMessage object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getSender(), new PlayerInfoXmlSerializer("sender"));
		writer.writeObject(object.getRecipient(), new PlayerInfoXmlSerializer("recipient"));
		writer.writeObject(object.getSubject(), new StringSerializer("subject"));
		writer.writeInt("threadId", object.getThreadId());
		writer.writeObject(object.getFormat(), new StringSerializer("format"));
		writer.writeInt("count", object.getCount());
		writer.writeLong("timestamp", object.getTimestamp());
		writer.writeObject(object.getStatus(), new EnumSerializer<MessageStatus>(MessageStatus.class, "status"));
		writer.writeObject(object.getType(), new EnumSerializer<MessageType>(MessageType.class, "type"));
		writer.writeInt("locationId", object.getLocationId());
		writer.writeInt("mobileId", object.getMobileId());
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.endElement(getName());
	}
}
