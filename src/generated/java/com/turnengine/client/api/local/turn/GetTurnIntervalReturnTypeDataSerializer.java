package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnIntervalReturnTypeDataSerializer extends ObjectSerializer<IGetTurnInterval> {

	public GetTurnIntervalReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnIntervalReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnInterval readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnInterval(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnInterval object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
