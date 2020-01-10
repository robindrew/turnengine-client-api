package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerActionQueueLimitReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerActionQueueLimit> {

	public GetPlayerActionQueueLimitReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerActionQueueLimitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerActionQueueLimit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetPlayerActionQueueLimit(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerActionQueueLimit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
