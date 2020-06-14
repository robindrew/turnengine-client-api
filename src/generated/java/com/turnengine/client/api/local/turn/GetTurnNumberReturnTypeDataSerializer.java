package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnNumberReturnTypeDataSerializer extends ObjectSerializer<IGetTurnNumber> {

	public GetTurnNumberReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnNumberReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnNumber readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnNumber(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnNumber object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
