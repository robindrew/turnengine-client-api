package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AdminSetUserPasswordReturnTypeDataSerializer extends ObjectSerializer<IAdminSetUserPassword> {

	public AdminSetUserPasswordReturnTypeDataSerializer() {
		super(false);
	}

	public AdminSetUserPasswordReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAdminSetUserPassword readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new AdminSetUserPassword(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IAdminSetUserPassword object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPassword(), new StringSerializer(false));
	}
}
