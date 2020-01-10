package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
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
