package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetUnitsByFactionNameReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsByFactionName> {

	public GetUnitsByFactionNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsByFactionNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsByFactionName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetUnitsByFactionName(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsByFactionName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
