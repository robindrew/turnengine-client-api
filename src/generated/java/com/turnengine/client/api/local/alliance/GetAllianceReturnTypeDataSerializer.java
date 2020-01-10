package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceReturnTypeDataSerializer extends ObjectSerializer<IGetAlliance> {

	public GetAllianceReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAlliance readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAlliance(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAlliance object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
