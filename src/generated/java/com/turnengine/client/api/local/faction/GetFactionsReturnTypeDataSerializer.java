package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetFactionsReturnTypeDataSerializer extends ObjectSerializer<IGetFactions> {

	public GetFactionsReturnTypeDataSerializer() {
		super(false);
	}

	public GetFactionsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetFactions readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetFactions(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetFactions object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
