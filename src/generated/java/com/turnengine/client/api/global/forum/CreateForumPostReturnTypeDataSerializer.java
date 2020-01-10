package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CreateForumPostReturnTypeDataSerializer extends ObjectSerializer<ICreateForumPost> {

	public CreateForumPostReturnTypeDataSerializer() {
		super(false);
	}

	public CreateForumPostReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICreateForumPost readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new CreateForumPost(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ICreateForumPost object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getThreadId());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
