package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerPropertyListReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerPropertyList> {

	public GetPlayerPropertyListReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerPropertyListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerPropertyList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetPlayerPropertyList(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerPropertyList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
	}
}
