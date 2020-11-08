package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsAtPlayerByGroupIdReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsAtPlayerByGroupId> {

	public GetUnitsAtPlayerByGroupIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsAtPlayerByGroupIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsAtPlayerByGroupId readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUnitsAtPlayerByGroupId(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsAtPlayerByGroupId object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
	}
}
