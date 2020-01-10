package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerCountByFactionIdReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerCountByFactionId> {

	public GetPlayerCountByFactionIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerCountByFactionIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerCountByFactionId readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetPlayerCountByFactionId(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerCountByFactionId object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
