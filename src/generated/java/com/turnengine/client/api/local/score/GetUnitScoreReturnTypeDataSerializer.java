package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitScoreReturnTypeDataSerializer extends ObjectSerializer<IGetUnitScore> {

	public GetUnitScoreReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitScoreReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitScore readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new GetUnitScore(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitScore object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getUnitId());
	}
}
