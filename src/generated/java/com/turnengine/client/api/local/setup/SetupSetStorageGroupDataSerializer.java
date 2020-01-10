package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.storage.StorageType;
import java.io.IOException;

public class SetupSetStorageGroupDataSerializer extends ObjectSerializer<ISetupSetStorageGroup> {

	public SetupSetStorageGroupDataSerializer() {
		super(false);
	}

	public SetupSetStorageGroupDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupSetStorageGroup readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		long param3 = reader.readLong();
		StorageType param4 = reader.readObject(new EnumSerializer<StorageType>(StorageType.class, false));
		return new SetupSetStorageGroup(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupSetStorageGroup object) throws IOException {
		writer.writeObject(object.getParentName(), new StringSerializer(false));
		writer.writeObject(object.getGroupName(), new StringSerializer(false));
		writer.writeLong(object.getCapacity());
		writer.writeObject(object.getType(), new EnumSerializer<StorageType>(StorageType.class, false));
	}
}
