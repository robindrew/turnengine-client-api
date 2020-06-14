package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
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
