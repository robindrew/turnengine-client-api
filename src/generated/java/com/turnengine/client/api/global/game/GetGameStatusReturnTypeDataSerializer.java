package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameStatusReturnTypeDataSerializer extends ObjectSerializer<IGetGameStatus> {

	public GetGameStatusReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameStatusReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameStatus readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetGameStatus(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameStatus object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
