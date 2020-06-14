package com.turnengine.client.api.local.unit;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsReturnTypeDataSerializer extends ObjectSerializer<IGetUnits> {

	public GetUnitsReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnits readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUnits(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnits object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
