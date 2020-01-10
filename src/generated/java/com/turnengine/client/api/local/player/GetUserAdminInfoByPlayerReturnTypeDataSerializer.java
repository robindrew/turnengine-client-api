package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserAdminInfoByPlayerReturnTypeDataSerializer extends ObjectSerializer<IGetUserAdminInfoByPlayer> {

	public GetUserAdminInfoByPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserAdminInfoByPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserAdminInfoByPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUserAdminInfoByPlayer(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserAdminInfoByPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
	}
}
