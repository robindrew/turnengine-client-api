package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserNamesReturnTypeDataSerializer extends ObjectSerializer<IGetUserNames> {

	public GetUserNamesReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserNamesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserNames readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		return new GetUserNames(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserNames object) throws IOException {
		writer.writeLong(object.getLoginId());
	}
}
