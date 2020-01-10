package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGamesReturnTypeDataSerializer extends ObjectSerializer<IGetGames> {

	public GetGamesReturnTypeDataSerializer() {
		super(false);
	}

	public GetGamesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGames readValue(IDataReader reader) throws IOException {
		return new GetGames();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGames object) throws IOException {
	}
}
