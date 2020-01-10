package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceScoresReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceScores> {

	public GetAllianceScoresReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceScoresReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceScores readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		return new GetAllianceScores(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceScores object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getAllianceId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getMaxSize());
		writer.writeInt(object.getMinTurn());
		writer.writeInt(object.getMaxTurn());
	}
}
