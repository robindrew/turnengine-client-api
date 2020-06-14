package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllUnitsAtPlayerReturnTypeDataSerializer extends ObjectSerializer<IGetAllUnitsAtPlayer> {

	public GetAllUnitsAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllUnitsAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllUnitsAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAllUnitsAtPlayer(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllUnitsAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
