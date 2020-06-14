package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserAdminInfoReturnTypeDataSerializer extends ObjectSerializer<IGetUserAdminInfo> {

	public GetUserAdminInfoReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserAdminInfoReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserAdminInfo readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUserAdminInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserAdminInfo object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getUserId());
	}
}
