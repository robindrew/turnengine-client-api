package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetMessageSummaryReturnTypeDataSerializer extends ObjectSerializer<IGetMessageSummary> {

	public GetMessageSummaryReturnTypeDataSerializer() {
		super(false);
	}

	public GetMessageSummaryReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetMessageSummary readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetMessageSummary(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetMessageSummary object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
