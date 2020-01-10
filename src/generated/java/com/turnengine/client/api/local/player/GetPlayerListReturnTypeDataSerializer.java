package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerListReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerList> {

	public GetPlayerListReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetPlayerList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
