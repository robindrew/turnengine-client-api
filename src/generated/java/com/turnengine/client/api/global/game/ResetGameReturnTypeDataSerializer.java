package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ResetGameReturnTypeDataSerializer extends ObjectSerializer<IResetGame> {

	public ResetGameReturnTypeDataSerializer() {
		super(false);
	}

	public ResetGameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IResetGame readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new ResetGame(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IResetGame object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
