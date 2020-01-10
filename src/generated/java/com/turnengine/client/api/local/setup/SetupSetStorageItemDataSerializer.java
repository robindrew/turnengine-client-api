package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupSetStorageItemDataSerializer extends ObjectSerializer<ISetupSetStorageItem> {

	public SetupSetStorageItemDataSerializer() {
		super(false);
	}

	public SetupSetStorageItemDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupSetStorageItem readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		long param4 = reader.readLong();
		return new SetupSetStorageItem(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupSetStorageItem object) throws IOException {
		writer.writeObject(object.getParentName(), new StringSerializer(false));
		writer.writeObject(object.getGroupName(), new StringSerializer(false));
		writer.writeObject(object.getChildName(), new StringSerializer(false));
		writer.writeLong(object.getSize());
	}
}
