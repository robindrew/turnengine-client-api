package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
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
