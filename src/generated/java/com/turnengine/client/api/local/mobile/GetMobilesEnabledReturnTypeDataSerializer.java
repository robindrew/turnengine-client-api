package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetMobilesEnabledReturnTypeDataSerializer extends ObjectSerializer<IGetMobilesEnabled> {

	public GetMobilesEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public GetMobilesEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetMobilesEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetMobilesEnabled(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetMobilesEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
