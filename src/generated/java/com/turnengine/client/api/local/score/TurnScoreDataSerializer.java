package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class TurnScoreDataSerializer extends ObjectSerializer<ITurnScore> {

	public TurnScoreDataSerializer() {
		super(false);
	}

	public TurnScoreDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITurnScore readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		return new TurnScore(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ITurnScore object) throws IOException {
		writer.writeInt(object.getTurn());
		writer.writeLong(object.getScore());
	}
}
