package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnUpdatingReturnTypeDataSerializer extends ObjectSerializer<IGetTurnUpdating> {

	public GetTurnUpdatingReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnUpdatingReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnUpdating readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnUpdating(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnUpdating object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
