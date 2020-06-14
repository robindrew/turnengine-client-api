package com.turnengine.client.api.local.storage;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetStorageItemReturnTypeDataSerializer extends ObjectSerializer<ISetStorageItem> {

	public SetStorageItemReturnTypeDataSerializer() {
		super(false);
	}

	public SetStorageItemReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetStorageItem readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		long param6 = reader.readLong();
		long param7 = reader.readLong();
		return new SetStorageItem(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetStorageItem object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getParentName(), new StringSerializer(false));
		writer.writeObject(object.getGroupName(), new StringSerializer(false));
		writer.writeObject(object.getChildName(), new StringSerializer(false));
		writer.writeLong(object.getSize());
		writer.writeLong(object.getLimit());
	}
}
