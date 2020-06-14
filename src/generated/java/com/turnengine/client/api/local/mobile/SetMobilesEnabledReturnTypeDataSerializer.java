package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetMobilesEnabledReturnTypeDataSerializer extends ObjectSerializer<ISetMobilesEnabled> {

	public SetMobilesEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public SetMobilesEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetMobilesEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		boolean param3 = reader.readBoolean();
		return new SetMobilesEnabled(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetMobilesEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
	}
}
