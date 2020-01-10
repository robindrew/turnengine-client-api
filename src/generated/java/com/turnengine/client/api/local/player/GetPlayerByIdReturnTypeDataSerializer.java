package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerByIdReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerById> {

	public GetPlayerByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerById readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetPlayerById(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerById object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
