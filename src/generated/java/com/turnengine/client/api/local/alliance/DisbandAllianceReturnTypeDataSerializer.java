package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class DisbandAllianceReturnTypeDataSerializer extends ObjectSerializer<IDisbandAlliance> {

	public DisbandAllianceReturnTypeDataSerializer() {
		super(false);
	}

	public DisbandAllianceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IDisbandAlliance readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new DisbandAlliance(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IDisbandAlliance object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
