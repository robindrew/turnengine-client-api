package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ListActionsAvailableAtLocationReturnTypeDataSerializer extends ObjectSerializer<IListActionsAvailableAtLocation> {

	public ListActionsAvailableAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public ListActionsAvailableAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IListActionsAvailableAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new ListActionsAvailableAtLocation(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IListActionsAvailableAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
	}
}
