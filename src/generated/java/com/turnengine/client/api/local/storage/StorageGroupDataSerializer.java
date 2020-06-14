package com.turnengine.client.api.local.storage;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class StorageGroupDataSerializer extends ObjectSerializer<IStorageGroup> {

	public StorageGroupDataSerializer() {
		super(false);
	}

	public StorageGroupDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStorageGroup readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		StorageType param4 = reader.readObject(new EnumSerializer<StorageType>(StorageType.class, false));
		return new StorageGroup(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IStorageGroup object) throws IOException {
		writer.writeInt(object.getParent());
		writer.writeInt(object.getGroup());
		writer.writeLong(object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class, false));
	}
}
