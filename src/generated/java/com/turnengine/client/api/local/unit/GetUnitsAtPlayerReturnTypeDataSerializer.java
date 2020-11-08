package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsAtPlayerReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsAtPlayer> {

	public GetUnitsAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUnitsAtPlayer(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
