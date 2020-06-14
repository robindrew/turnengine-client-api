package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class VerifyUserReturnTypeDataSerializer extends ObjectSerializer<IVerifyUser> {

	public VerifyUserReturnTypeDataSerializer() {
		super(false);
	}

	public VerifyUserReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IVerifyUser readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		String param3 = reader.readObject(new StringSerializer(false));
		return new VerifyUser(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IVerifyUser object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeLong(object.getCode());
		writer.writeObject(object.getAddress(), new StringSerializer(false));
	}
}
