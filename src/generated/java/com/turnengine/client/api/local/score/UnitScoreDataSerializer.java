package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class UnitScoreDataSerializer extends ObjectSerializer<IUnitScore> {

	public UnitScoreDataSerializer() {
		super(false);
	}

	public UnitScoreDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUnitScore readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		return new UnitScore(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IUnitScore object) throws IOException {
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getUnitId());
		writer.writeLong(object.getScore());
	}
}
