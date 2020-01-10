package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ListMessagesReturnTypeDataSerializer extends ObjectSerializer<IListMessages> {

	public ListMessagesReturnTypeDataSerializer() {
		super(false);
	}

	public ListMessagesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IListMessages readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		MessageType param3 = reader.readObject(new EnumSerializer<MessageType>(MessageType.class, false));
		boolean param4 = reader.readBoolean();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		int param8 = reader.readInt();
		String param9 = reader.readObject(new StringSerializer(false));
		return new ListMessages(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeValue(IDataWriter writer, IListMessages object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getType(), new EnumSerializer<MessageType>(MessageType.class, false));
		writer.writeBoolean(object.getIncludeContent());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getLocationId());
		writer.writeObject(object.getFormat(), new StringSerializer(false));
	}
}
