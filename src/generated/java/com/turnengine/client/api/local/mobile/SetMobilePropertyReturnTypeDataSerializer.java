package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetMobilePropertyReturnTypeDataSerializer extends ObjectSerializer<ISetMobileProperty> {

	public SetMobilePropertyReturnTypeDataSerializer() {
		super(false);
	}

	public SetMobilePropertyReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetMobileProperty readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		return new SetMobileProperty(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetMobileProperty object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
