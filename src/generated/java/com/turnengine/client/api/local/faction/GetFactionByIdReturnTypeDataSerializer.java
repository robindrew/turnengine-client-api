package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetFactionByIdReturnTypeDataSerializer extends ObjectSerializer<IGetFactionById> {

	public GetFactionByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetFactionByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetFactionById readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetFactionById(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetFactionById object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
