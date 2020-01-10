package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationListReturnTypeDataSerializer extends ObjectSerializer<IGetLocationList> {

	public GetLocationListReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetLocationList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
