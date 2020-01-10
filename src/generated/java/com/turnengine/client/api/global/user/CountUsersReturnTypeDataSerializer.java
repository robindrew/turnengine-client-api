package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class CountUsersReturnTypeDataSerializer extends ObjectSerializer<ICountUsers> {

	public CountUsersReturnTypeDataSerializer() {
		super(false);
	}

	public CountUsersReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICountUsers readValue(IDataReader reader) throws IOException {
		return new CountUsers();
	}

	@Override
	public void writeValue(IDataWriter writer, ICountUsers object) throws IOException {
	}
}
