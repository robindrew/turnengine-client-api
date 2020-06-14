package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetTurnStartTimeReturnTypeDataSerializer extends ObjectSerializer<ISetTurnStartTime> {

	public SetTurnStartTimeReturnTypeDataSerializer() {
		super(false);
	}

	public SetTurnStartTimeReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetTurnStartTime readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		return new SetTurnStartTime(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetTurnStartTime object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getTimestamp());
	}
}
