package com.turnengine.client.api.local.score;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class RankingDataSerializer extends ObjectSerializer<IRanking> {

	public RankingDataSerializer() {
		super(false);
	}

	public RankingDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IRanking readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		return new Ranking(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IRanking object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeInt(object.getRank());
		writer.writeLong(object.getScore());
	}
}
