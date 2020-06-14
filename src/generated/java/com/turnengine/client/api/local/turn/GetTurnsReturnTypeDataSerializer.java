package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnsReturnTypeDataSerializer extends ObjectSerializer<IGetTurns> {

	public GetTurnsReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurns readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurns(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurns object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
