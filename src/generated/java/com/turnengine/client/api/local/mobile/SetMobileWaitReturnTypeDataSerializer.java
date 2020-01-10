package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetMobileWaitReturnTypeDataSerializer extends ObjectSerializer<ISetMobileWait> {

	public SetMobileWaitReturnTypeDataSerializer() {
		super(false);
	}

	public SetMobileWaitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetMobileWait readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new SetMobileWait(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetMobileWait object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getTurns());
	}
}
