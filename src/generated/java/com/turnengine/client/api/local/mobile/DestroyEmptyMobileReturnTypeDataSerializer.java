package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class DestroyEmptyMobileReturnTypeDataSerializer extends ObjectSerializer<IDestroyEmptyMobile> {

	public DestroyEmptyMobileReturnTypeDataSerializer() {
		super(false);
	}

	public DestroyEmptyMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IDestroyEmptyMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new DestroyEmptyMobile(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IDestroyEmptyMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
	}
}
