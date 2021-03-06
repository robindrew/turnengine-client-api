package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameInstancesByGameNameReturnTypeDataSerializer extends ObjectSerializer<IGetGameInstancesByGameName> {

	public GetGameInstancesByGameNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameInstancesByGameNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameInstancesByGameName readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetGameInstancesByGameName(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameInstancesByGameName object) throws IOException {
		writer.writeObject(object.getGameName(), new StringSerializer(false));
	}
}
