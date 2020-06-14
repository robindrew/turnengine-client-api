package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationReturnTypeDataSerializer extends ObjectSerializer<IGetLocation> {

	public GetLocationReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetLocation(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
	}
}
