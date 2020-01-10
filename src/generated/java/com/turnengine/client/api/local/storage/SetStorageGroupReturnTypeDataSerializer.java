package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetStorageGroupReturnTypeDataSerializer extends ObjectSerializer<ISetStorageGroup> {

	public SetStorageGroupReturnTypeDataSerializer() {
		super(false);
	}

	public SetStorageGroupReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetStorageGroup readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		long param5 = reader.readLong();
		StorageType param6 = reader.readObject(new EnumSerializer<StorageType>(StorageType.class, false));
		return new SetStorageGroup(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetStorageGroup object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getParentName(), new StringSerializer(false));
		writer.writeObject(object.getGroupName(), new StringSerializer(false));
		writer.writeLong(object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class, false));
	}
}
