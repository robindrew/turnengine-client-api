package com.turnengine.client.api.local.message;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import java.io.IOException;
import java.util.List;

public class MessageListDataSerializer extends ObjectSerializer<IMessageList> {

	public MessageListDataSerializer() {
		super(false);
	}

	public MessageListDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMessageList readValue(IDataReader reader) throws IOException {
		List<IMessage> param1 = reader.readObject(new ListSerializer<IMessage>(new MessageDataSerializer(false), false));
		int param2 = reader.readInt();
		return new MessageList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IMessageList object) throws IOException {
		writer.writeObject(object.getMessageList(), new ListSerializer<IMessage>(new MessageDataSerializer(false), false));
		writer.writeInt(object.getTotal());
	}
}
