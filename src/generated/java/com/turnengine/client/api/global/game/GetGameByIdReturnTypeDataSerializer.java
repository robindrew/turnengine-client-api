package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameByIdReturnTypeDataSerializer extends ObjectSerializer<IGetGameById> {

	public GetGameByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameById readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		return new GetGameById(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameById object) throws IOException {
		writer.writeInt(object.getGameId());
	}
}
