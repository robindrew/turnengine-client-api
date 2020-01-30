package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class AddGameUnitsReturnTypeDataSerializer extends ObjectSerializer<IAddGameUnits> {

	public AddGameUnitsReturnTypeDataSerializer() {
		super(false);
	}

	public AddGameUnitsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddGameUnits readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		long param4 = reader.readLong();
		return new AddGameUnits(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddGameUnits object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getUnitId());
		writer.writeLong(object.getAmount());
	}
}
