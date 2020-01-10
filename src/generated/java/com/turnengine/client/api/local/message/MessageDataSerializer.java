package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoDataSerializer;
import java.io.IOException;

public class MessageDataSerializer extends ObjectSerializer<IMessage> {

	public MessageDataSerializer() {
		super(false);
	}

	public MessageDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMessage readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		IPlayerInfo param2 = reader.readObject(new PlayerInfoDataSerializer(false));
		IPlayerInfo param3 = reader.readObject(new PlayerInfoDataSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		int param5 = reader.readInt();
		String param6 = reader.readObject(new StringSerializer(false));
		int param7 = reader.readInt();
		long param8 = reader.readLong();
		MessageStatus param9 = reader.readObject(new EnumSerializer<MessageStatus>(MessageStatus.class, false));
		MessageType param10 = reader.readObject(new EnumSerializer<MessageType>(MessageType.class, false));
		int param11 = reader.readInt();
		int param12 = reader.readInt();
		String param13 = reader.readObject(new StringSerializer(false));
		return new Message(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13);
	}

	@Override
	public void writeValue(IDataWriter writer, IMessage object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getSender(), new PlayerInfoDataSerializer(false));
		writer.writeObject(object.getRecipient(), new PlayerInfoDataSerializer(false));
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeInt(object.getThreadId());
		writer.writeObject(object.getFormat(), new StringSerializer(false));
		writer.writeInt(object.getCount());
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getStatus(), new EnumSerializer<MessageStatus>(MessageStatus.class, false));
		writer.writeObject(object.getType(), new EnumSerializer<MessageType>(MessageType.class, false));
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
