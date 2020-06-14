package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerReturnTypeDataSerializer extends ObjectSerializer<IGetPlayer> {

	public GetPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetPlayer(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
