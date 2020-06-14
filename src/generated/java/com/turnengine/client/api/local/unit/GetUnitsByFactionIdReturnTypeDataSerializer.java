package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsByFactionIdReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsByFactionId> {

	public GetUnitsByFactionIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsByFactionIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsByFactionId readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUnitsByFactionId(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsByFactionId object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
