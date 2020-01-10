package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetUserByEmailReturnTypeDataSerializer extends ObjectSerializer<IGetUserByEmail> {

	public GetUserByEmailReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserByEmailReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserByEmail readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		return new GetUserByEmail(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserByEmail object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getEmail(), new StringSerializer(false));
	}
}
