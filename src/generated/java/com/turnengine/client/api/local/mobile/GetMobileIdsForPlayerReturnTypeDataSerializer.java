package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetMobileIdsForPlayerReturnTypeDataSerializer extends ObjectSerializer<IGetMobileIdsForPlayer> {

	public GetMobileIdsForPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public GetMobileIdsForPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetMobileIdsForPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetMobileIdsForPlayer(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetMobileIdsForPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
	}
}
