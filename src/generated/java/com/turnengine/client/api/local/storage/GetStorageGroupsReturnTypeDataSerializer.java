package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetStorageGroupsReturnTypeDataSerializer extends ObjectSerializer<IGetStorageGroups> {

	public GetStorageGroupsReturnTypeDataSerializer() {
		super(false);
	}

	public GetStorageGroupsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetStorageGroups readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetStorageGroups(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetStorageGroups object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
