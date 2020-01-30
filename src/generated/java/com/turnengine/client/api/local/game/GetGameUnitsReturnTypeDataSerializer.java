package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameUnitsReturnTypeDataSerializer extends ObjectSerializer<IGetGameUnits> {

	public GetGameUnitsReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameUnitsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameUnits readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetGameUnits(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameUnits object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
