package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ChangeUserPasswordReturnTypeDataSerializer extends ObjectSerializer<IChangeUserPassword> {

	public ChangeUserPasswordReturnTypeDataSerializer() {
		super(false);
	}

	public ChangeUserPasswordReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IChangeUserPassword readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new ChangeUserPassword(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IChangeUserPassword object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getOldPassword(), new StringSerializer(false));
		writer.writeObject(object.getNewPassword(), new StringSerializer(false));
	}
}
