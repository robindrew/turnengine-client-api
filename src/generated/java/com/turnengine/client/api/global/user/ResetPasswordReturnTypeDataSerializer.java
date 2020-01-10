package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ResetPasswordReturnTypeDataSerializer extends ObjectSerializer<IResetPassword> {

	public ResetPasswordReturnTypeDataSerializer() {
		super(false);
	}

	public ResetPasswordReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IResetPassword readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		long param3 = reader.readLong();
		return new ResetPassword(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IResetPassword object) throws IOException {
		writer.writeObject(object.getEmail(), new StringSerializer(false));
		writer.writeObject(object.getPassword(), new StringSerializer(false));
		writer.writeLong(object.getCode());
	}
}
