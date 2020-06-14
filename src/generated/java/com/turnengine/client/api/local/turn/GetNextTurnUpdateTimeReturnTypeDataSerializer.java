package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
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
