package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetTurnFinishTimeReturnTypeDataSerializer extends ObjectSerializer<ISetTurnFinishTime> {

	public SetTurnFinishTimeReturnTypeDataSerializer() {
		super(false);
	}

	public SetTurnFinishTimeReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetTurnFinishTime readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		return new SetTurnFinishTime(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetTurnFinishTime object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getTimestamp());
	}
}
