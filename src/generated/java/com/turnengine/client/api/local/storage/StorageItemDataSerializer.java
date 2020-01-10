package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class StorageItemDataSerializer extends ObjectSerializer<IStorageItem> {

	public StorageItemDataSerializer() {
		super(false);
	}

	public StorageItemDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStorageItem readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		long param4 = reader.readLong();
		long param5 = reader.readLong();
		return new StorageItem(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IStorageItem object) throws IOException {
		writer.writeInt(object.getParent());
		writer.writeInt(object.getGroup());
		writer.writeInt(object.getChild());
		writer.writeLong(object.getSize());
		writer.writeLong(object.getLimit());
	}
}
