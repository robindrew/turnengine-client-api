package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerSetupInfoReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerSetupInfo> {

	public GetPlayerSetupInfoReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerSetupInfoReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerSetupInfo readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetPlayerSetupInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerSetupInfo object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
