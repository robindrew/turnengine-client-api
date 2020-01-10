package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetMobileSetupInfoReturnTypeDataSerializer extends ObjectSerializer<IGetMobileSetupInfo> {

	public GetMobileSetupInfoReturnTypeDataSerializer() {
		super(false);
	}

	public GetMobileSetupInfoReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetMobileSetupInfo readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetMobileSetupInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetMobileSetupInfo object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
