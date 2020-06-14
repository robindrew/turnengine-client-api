package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CreateMobileAtMobileReturnTypeDataSerializer extends ObjectSerializer<ICreateMobileAtMobile> {

	public CreateMobileAtMobileReturnTypeDataSerializer() {
		super(false);
	}

	public CreateMobileAtMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICreateMobileAtMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		String param4 = reader.readObject(new StringSerializer(false));
		return new CreateMobileAtMobile(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ICreateMobileAtMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
