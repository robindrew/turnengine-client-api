package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetSignupUserEmailReturnTypeDataSerializer extends ObjectSerializer<ISetSignupUserEmail> {

	public SetSignupUserEmailReturnTypeDataSerializer() {
		super(false);
	}

	public SetSignupUserEmailReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetSignupUserEmail readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new SetSignupUserEmail(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetSignupUserEmail object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
