package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitScoresReturnTypeDataSerializer extends ObjectSerializer<IGetUnitScores> {

	public GetUnitScoresReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitScoresReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitScores readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUnitScores(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitScores object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
