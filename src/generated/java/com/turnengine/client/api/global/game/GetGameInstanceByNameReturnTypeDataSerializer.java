package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameInstanceByNameReturnTypeDataSerializer extends ObjectSerializer<IGetGameInstanceByName> {

	public GetGameInstanceByNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameInstanceByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameInstanceByName readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		int param2 = reader.readInt();
		return new GetGameInstanceByName(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameInstanceByName object) throws IOException {
		writer.writeObject(object.getInstanceName(), new StringSerializer(false));
		writer.writeInt(object.getVersionId());
	}
}
