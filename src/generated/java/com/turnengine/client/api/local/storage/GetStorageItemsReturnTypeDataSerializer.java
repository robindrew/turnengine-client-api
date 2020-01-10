package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetStorageItemsReturnTypeDataSerializer extends ObjectSerializer<IGetStorageItems> {

	public GetStorageItemsReturnTypeDataSerializer() {
		super(false);
	}

	public GetStorageItemsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetStorageItems readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetStorageItems(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetStorageItems object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
