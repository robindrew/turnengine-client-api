package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetTurnsEnabledReturnTypeDataSerializer extends ObjectSerializer<IGetTurnsEnabled> {

	public GetTurnsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public GetTurnsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetTurnsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetTurnsEnabled(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetTurnsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
