package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ClearMobileQueueReturnTypeDataSerializer extends ObjectSerializer<IClearMobileQueue> {

	public ClearMobileQueueReturnTypeDataSerializer() {
		super(false);
	}

	public ClearMobileQueueReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IClearMobileQueue readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new ClearMobileQueue(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IClearMobileQueue object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
	}
}
