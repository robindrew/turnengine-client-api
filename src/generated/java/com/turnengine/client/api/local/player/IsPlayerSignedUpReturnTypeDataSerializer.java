package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class IsPlayerSignedUpReturnTypeDataSerializer extends ObjectSerializer<IIsPlayerSignedUp> {

	public IsPlayerSignedUpReturnTypeDataSerializer() {
		super(false);
	}

	public IsPlayerSignedUpReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IIsPlayerSignedUp readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new IsPlayerSignedUp(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IIsPlayerSignedUp object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
