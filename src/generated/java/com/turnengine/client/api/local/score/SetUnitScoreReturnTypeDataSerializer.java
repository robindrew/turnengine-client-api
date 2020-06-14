package com.turnengine.client.api.local.score;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetUnitScoreReturnTypeDataSerializer extends ObjectSerializer<ISetUnitScore> {

	public SetUnitScoreReturnTypeDataSerializer() {
		super(false);
	}

	public SetUnitScoreReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetUnitScore readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		long param5 = reader.readLong();
		return new SetUnitScore(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetUnitScore object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer(false));
		writer.writeObject(object.getUnit(), new StringSerializer(false));
		writer.writeLong(object.getScore());
	}
}
