package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ClearSetupReturnTypeDataSerializer extends ObjectSerializer<IClearSetup> {

	public ClearSetupReturnTypeDataSerializer() {
		super(false);
	}

	public ClearSetupReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IClearSetup readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new ClearSetup(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IClearSetup object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
