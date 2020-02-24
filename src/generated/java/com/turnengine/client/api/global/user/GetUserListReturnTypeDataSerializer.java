package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserListReturnTypeDataSerializer extends ObjectSerializer<IGetUserList> {

	public GetUserListReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		return new GetUserList(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserList object) throws IOException {
		writer.writeLong(object.getLoginId());
	}
}
