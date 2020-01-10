package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserByIdReturnTypeDataSerializer extends ObjectSerializer<IGetUserById> {

	public GetUserByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserById readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUserById(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserById object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
	}
}
