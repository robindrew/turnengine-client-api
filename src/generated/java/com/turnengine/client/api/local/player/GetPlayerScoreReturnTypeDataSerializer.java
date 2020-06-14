package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerScoreReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerScore> {

	public GetPlayerScoreReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerScoreReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerScore readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetPlayerScore(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerScore object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
	}
}
