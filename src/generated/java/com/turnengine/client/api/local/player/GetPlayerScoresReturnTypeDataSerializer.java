package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerScoresReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerScores> {

	public GetPlayerScoresReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerScoresReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerScores readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		return new GetPlayerScores(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerScores object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getMaxSize());
		writer.writeInt(object.getMinTurn());
		writer.writeInt(object.getMaxTurn());
	}
}
