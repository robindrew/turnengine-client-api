package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GroupScoreDataSerializer extends ObjectSerializer<IGroupScore> {

	public GroupScoreDataSerializer() {
		super(false);
	}

	public GroupScoreDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGroupScore readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		return new GroupScore(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGroupScore object) throws IOException {
		writer.writeInt(object.getGroupId());
		writer.writeLong(object.getScore());
	}
}
