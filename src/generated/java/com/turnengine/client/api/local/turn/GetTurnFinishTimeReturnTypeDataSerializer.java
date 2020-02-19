package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnFinishTimeReturnTypeDataSerializer extends ObjectSerializer<IGetTurnFinishTime> {

	public GetTurnFinishTimeReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnFinishTimeReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnFinishTime readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnFinishTime(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnFinishTime object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
