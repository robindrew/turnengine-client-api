package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CreateForumThreadReturnTypeDataSerializer extends ObjectSerializer<ICreateForumThread> {

	public CreateForumThreadReturnTypeDataSerializer() {
		super(false);
	}

	public CreateForumThreadReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICreateForumThread readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new CreateForumThread(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ICreateForumThread object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getForumId());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
