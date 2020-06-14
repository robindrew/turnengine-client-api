package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserAdminInfoListReturnTypeDataSerializer extends ObjectSerializer<IGetUserAdminInfoList> {

	public GetUserAdminInfoListReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserAdminInfoListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserAdminInfoList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		return new GetUserAdminInfoList(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserAdminInfoList object) throws IOException {
		writer.writeLong(object.getLoginId());
	}
}
