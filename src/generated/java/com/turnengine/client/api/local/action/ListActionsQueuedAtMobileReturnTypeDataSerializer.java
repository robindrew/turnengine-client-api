package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ListActionsQueuedAtMobileReturnTypeDataSerializer extends ObjectSerializer<IListActionsQueuedAtMobile> {

	public ListActionsQueuedAtMobileReturnTypeDataSerializer() {
		super(false);
	}

	public ListActionsQueuedAtMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IListActionsQueuedAtMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new ListActionsQueuedAtMobile(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IListActionsQueuedAtMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
	}
}
