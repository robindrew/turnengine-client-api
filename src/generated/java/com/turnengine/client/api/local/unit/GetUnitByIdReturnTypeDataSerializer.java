package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitByIdReturnTypeDataSerializer extends ObjectSerializer<IGetUnitById> {

	public GetUnitByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitById readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUnitById(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitById object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
