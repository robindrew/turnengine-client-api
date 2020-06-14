package com.turnengine.client.api.local.property;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetLocalPropertyReturnTypeDataSerializer extends ObjectSerializer<ISetLocalProperty> {

	public SetLocalPropertyReturnTypeDataSerializer() {
		super(false);
	}

	public SetLocalPropertyReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetLocalProperty readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new SetLocalProperty(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetLocalProperty object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
