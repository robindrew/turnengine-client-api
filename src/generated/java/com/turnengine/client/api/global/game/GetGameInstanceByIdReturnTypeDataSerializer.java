package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameInstanceByIdReturnTypeDataSerializer extends ObjectSerializer<IGetGameInstanceById> {

	public GetGameInstanceByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameInstanceByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameInstanceById readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		return new GetGameInstanceById(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameInstanceById object) throws IOException {
		writer.writeInt(object.getInstanceId());
	}
}
