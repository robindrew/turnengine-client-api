package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CreateForumReturnTypeDataSerializer extends ObjectSerializer<ICreateForum> {

	public CreateForumReturnTypeDataSerializer() {
		super(false);
	}

	public CreateForumReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICreateForum readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		return new CreateForum(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ICreateForum object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getParent());
	}
}
