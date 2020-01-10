package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
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
		int param3 = reader.readInt();
		return new GetUnitsAtPlayer(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
	}
}
