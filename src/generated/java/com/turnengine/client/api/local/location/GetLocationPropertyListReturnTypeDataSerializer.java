package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationPropertyListReturnTypeDataSerializer extends ObjectSerializer<IGetLocationPropertyList> {

	public GetLocationPropertyListReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationPropertyListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationPropertyList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new GetLocationPropertyList(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationPropertyList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
		writer.writeInt(object.getLocationId());
	}
}
