package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsByGroupIdReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsByGroupId> {

	public GetUnitsByGroupIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsByGroupIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsByGroupId readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUnitsByGroupId(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsByGroupId object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
