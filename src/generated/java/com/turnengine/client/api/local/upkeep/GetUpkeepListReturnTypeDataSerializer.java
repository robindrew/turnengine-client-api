package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUpkeepListReturnTypeDataSerializer extends ObjectSerializer<IGetUpkeepList> {

	public GetUpkeepListReturnTypeDataSerializer() {
		super(false);
	}

	public GetUpkeepListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUpkeepList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUpkeepList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUpkeepList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
