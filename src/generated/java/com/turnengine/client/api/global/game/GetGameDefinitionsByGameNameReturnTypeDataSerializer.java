package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameDefinitionsByGameNameReturnTypeDataSerializer extends ObjectSerializer<IGetGameDefinitionsByGameName> {

	public GetGameDefinitionsByGameNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameDefinitionsByGameNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameDefinitionsByGameName readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetGameDefinitionsByGameName(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameDefinitionsByGameName object) throws IOException {
		writer.writeObject(object.getGameName(), new StringSerializer(false));
	}
}
