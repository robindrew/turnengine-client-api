package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameVersionByIdReturnTypeDataSerializer extends ObjectSerializer<IGetGameVersionById> {

	public GetGameVersionByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameVersionByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameVersionById readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		return new GetGameVersionById(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameVersionById object) throws IOException {
		writer.writeInt(object.getVersionId());
	}
}
