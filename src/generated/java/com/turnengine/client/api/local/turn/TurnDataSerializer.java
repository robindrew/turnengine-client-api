package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class TurnDataSerializer extends ObjectSerializer<ITurn> {

	public TurnDataSerializer() {
		super(false);
	}

	public TurnDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITurn readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		long param3 = reader.readLong();
		return new Turn(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ITurn object) throws IOException {
		writer.writeInt(object.getNumber());
		writer.writeLong(object.getTimestamp());
		writer.writeLong(object.getDuration());
	}
}
