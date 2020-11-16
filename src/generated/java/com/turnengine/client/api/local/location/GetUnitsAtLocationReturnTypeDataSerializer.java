package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsAtLocationReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsAtLocation> {

	public GetUnitsAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUnitsAtLocation(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
	}
}
