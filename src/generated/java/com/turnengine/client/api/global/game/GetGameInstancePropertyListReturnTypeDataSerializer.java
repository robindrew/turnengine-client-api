package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameInstancePropertyListReturnTypeDataSerializer extends ObjectSerializer<IGetGameInstancePropertyList> {

	public GetGameInstancePropertyListReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameInstancePropertyListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameInstancePropertyList readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		return new GetGameInstancePropertyList(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameInstancePropertyList object) throws IOException {
		writer.writeInt(object.getInstanceId());
	}
}
