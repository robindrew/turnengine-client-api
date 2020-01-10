package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoJsonSerializer;

public class MessageJsonSerializer implements IJsonSerializer<IMessage> {

	private String name;

	public MessageJsonSerializer() {
		this("Message");
	}

	public MessageJsonSerializer(String name) {
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
	public IMessage readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMessage object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getSender(), new PlayerInfoJsonSerializer());
		writer.writeObject(object.getRecipient(), new PlayerInfoJsonSerializer());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeInt(object.getThreadId());
		writer.writeObject(object.getFormat(), new StringSerializer());
		writer.writeInt(object.getCount());
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getStatus(), new EnumSerializer<MessageStatus>(MessageStatus.class));
		writer.writeObject(object.getType(), new EnumSerializer<MessageType>(MessageType.class));
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.closeObject();
	}
}
