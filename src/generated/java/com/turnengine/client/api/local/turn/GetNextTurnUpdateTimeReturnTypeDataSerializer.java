package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetNextTurnUpdateTimeReturnTypeDataSerializer extends ObjectSerializer<IGetNextTurnUpdateTime> {

	public GetNextTurnUpdateTimeReturnTypeDataSerializer() {
		super(false);
	}

	public GetNextTurnUpdateTimeReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetNextTurnUpdateTime readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetNextTurnUpdateTime(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetNextTurnUpdateTime object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
