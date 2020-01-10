package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserReturnTypeDataSerializer extends ObjectSerializer<IGetUser> {

	public GetUserReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUser readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		return new GetUser(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUser object) throws IOException {
		writer.writeLong(object.getLoginId());
	}
}
