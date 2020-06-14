package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameHostByIdReturnTypeDataSerializer extends ObjectSerializer<IGetGameHostById> {

	public GetGameHostByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameHostByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameHostById readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		return new GetGameHostById(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameHostById object) throws IOException {
		writer.writeInt(object.getId());
	}
}
