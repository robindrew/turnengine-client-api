package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetUserByNameReturnTypeDataSerializer extends ObjectSerializer<IGetUserByName> {

	public GetUserByNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserByName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		return new GetUserByName(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserByName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
