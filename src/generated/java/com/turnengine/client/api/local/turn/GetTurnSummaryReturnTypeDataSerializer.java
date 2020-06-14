package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnSummaryReturnTypeDataSerializer extends ObjectSerializer<IGetTurnSummary> {

	public GetTurnSummaryReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnSummaryReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnSummary readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnSummary(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnSummary object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
