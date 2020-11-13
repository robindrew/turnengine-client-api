package com.turnengine.client.api.local.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsAtGameReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsAtGame> {

	public GetUnitsAtGameReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsAtGameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsAtGame readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUnitsAtGame(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsAtGame object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
