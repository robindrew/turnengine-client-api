package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserByLoginIdReturnTypeDataSerializer extends ObjectSerializer<IGetUserByLoginId> {

	public GetUserByLoginIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserByLoginIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserByLoginId readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		long param2 = reader.readLong();
		return new GetUserByLoginId(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserByLoginId object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeLong(object.getId());
	}
}
