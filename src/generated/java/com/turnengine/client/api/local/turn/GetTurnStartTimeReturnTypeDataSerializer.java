package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnStartTimeReturnTypeDataSerializer extends ObjectSerializer<IGetTurnStartTime> {

	public GetTurnStartTimeReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnStartTimeReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnStartTime readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnStartTime(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnStartTime object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
