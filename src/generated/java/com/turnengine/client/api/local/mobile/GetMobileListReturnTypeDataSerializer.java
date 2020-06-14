package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetMobileListReturnTypeDataSerializer extends ObjectSerializer<IGetMobileList> {

	public GetMobileListReturnTypeDataSerializer() {
		super(false);
	}

	public GetMobileListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetMobileList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetMobileList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetMobileList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
