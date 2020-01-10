package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class MessageSummaryDataSerializer extends ObjectSerializer<IMessageSummary> {

	public MessageSummaryDataSerializer() {
		super(false);
	}

	public MessageSummaryDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMessageSummary readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		return new MessageSummary(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IMessageSummary object) throws IOException {
		writer.writeInt(object.getNewsRead());
		writer.writeInt(object.getNewsUnread());
		writer.writeInt(object.getMailRead());
		writer.writeInt(object.getMailUnread());
		writer.writeInt(object.getNoteRead());
		writer.writeInt(object.getNoteUnread());
	}
}
