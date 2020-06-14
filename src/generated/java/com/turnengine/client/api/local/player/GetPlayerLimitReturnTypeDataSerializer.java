package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerLimitReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerLimit> {

	public GetPlayerLimitReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerLimitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerLimit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetPlayerLimit(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerLimit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
