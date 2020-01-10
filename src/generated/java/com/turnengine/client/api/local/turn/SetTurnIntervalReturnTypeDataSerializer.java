package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetTurnIntervalReturnTypeDataSerializer extends ObjectSerializer<ISetTurnInterval> {

	public SetTurnIntervalReturnTypeDataSerializer() {
		super(false);
	}

	public SetTurnIntervalReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetTurnInterval readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		return new SetTurnInterval(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetTurnInterval object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getInterval());
	}
}
