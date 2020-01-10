package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetUnitByNameReturnTypeDataSerializer extends ObjectSerializer<IGetUnitByName> {

	public GetUnitByNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitByName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetUnitByName(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitByName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
