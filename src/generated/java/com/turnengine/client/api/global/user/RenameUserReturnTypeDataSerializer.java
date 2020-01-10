package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class RenameUserReturnTypeDataSerializer extends ObjectSerializer<IRenameUser> {

	public RenameUserReturnTypeDataSerializer() {
		super(false);
	}

	public RenameUserReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IRenameUser readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new RenameUser(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IRenameUser object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getFrom(), new StringSerializer(false));
		writer.writeObject(object.getTo(), new StringSerializer(false));
	}
}
