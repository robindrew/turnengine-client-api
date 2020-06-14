package com.turnengine.client.api.local.property;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetLocalPropertyReturnTypeDataSerializer extends ObjectSerializer<IGetLocalProperty> {

	public GetLocalPropertyReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocalPropertyReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocalProperty readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetLocalProperty(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocalProperty object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
	}
}
