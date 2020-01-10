package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameInstanceByNamesReturnTypeDataSerializer extends ObjectSerializer<IGetGameInstanceByNames> {

	public GetGameInstanceByNamesReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameInstanceByNamesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameInstanceByNames readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetGameInstanceByNames(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameInstanceByNames object) throws IOException {
		writer.writeObject(object.getGameName(), new StringSerializer(false));
		writer.writeObject(object.getVersionName(), new StringSerializer(false));
		writer.writeObject(object.getInstanceName(), new StringSerializer(false));
	}
}
