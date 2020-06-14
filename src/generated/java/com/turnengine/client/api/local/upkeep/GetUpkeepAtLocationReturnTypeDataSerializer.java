package com.turnengine.client.api.local.upkeep;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUpkeepAtLocationReturnTypeDataSerializer extends ObjectSerializer<IGetUpkeepAtLocation> {

	public GetUpkeepAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public GetUpkeepAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUpkeepAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUpkeepAtLocation(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUpkeepAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
	}
}
