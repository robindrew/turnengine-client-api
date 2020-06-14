package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnDetailsReturnTypeDataSerializer extends ObjectSerializer<IGetTurnDetails> {

	public GetTurnDetailsReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnDetailsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnDetails readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnDetails(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnDetails object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
