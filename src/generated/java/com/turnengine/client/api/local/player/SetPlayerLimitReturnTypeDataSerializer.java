package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetPlayerLimitReturnTypeDataSerializer extends ObjectSerializer<ISetPlayerLimit> {

	public SetPlayerLimitReturnTypeDataSerializer() {
		super(false);
	}

	public SetPlayerLimitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetPlayerLimit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new SetPlayerLimit(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetPlayerLimit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLimit());
	}
}
