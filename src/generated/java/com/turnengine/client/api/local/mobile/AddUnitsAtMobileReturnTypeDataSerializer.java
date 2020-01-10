package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class AddUnitsAtMobileReturnTypeDataSerializer extends ObjectSerializer<IAddUnitsAtMobile> {

	public AddUnitsAtMobileReturnTypeDataSerializer() {
		super(false);
	}

	public AddUnitsAtMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddUnitsAtMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		long param5 = reader.readLong();
		return new AddUnitsAtMobile(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddUnitsAtMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getUnitId());
		writer.writeLong(object.getAmount());
	}
}
