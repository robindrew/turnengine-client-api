package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ListActionsAvailableAtMobileReturnTypeDataSerializer extends ObjectSerializer<IListActionsAvailableAtMobile> {

	public ListActionsAvailableAtMobileReturnTypeDataSerializer() {
		super(false);
	}

	public ListActionsAvailableAtMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IListActionsAvailableAtMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new ListActionsAvailableAtMobile(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IListActionsAvailableAtMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
	}
}
