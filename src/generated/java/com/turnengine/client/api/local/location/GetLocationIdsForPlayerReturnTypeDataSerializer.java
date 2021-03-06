package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationIdsForPlayerReturnTypeDataSerializer extends ObjectSerializer<IGetLocationIdsForPlayer> {

	public GetLocationIdsForPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationIdsForPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationIdsForPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetLocationIdsForPlayer(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationIdsForPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
	}
}
