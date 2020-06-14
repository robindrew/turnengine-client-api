package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CreateMobileAtLocationReturnTypeDataSerializer extends ObjectSerializer<ICreateMobileAtLocation> {

	public CreateMobileAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public CreateMobileAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICreateMobileAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		String param4 = reader.readObject(new StringSerializer(false));
		return new CreateMobileAtLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ICreateMobileAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
