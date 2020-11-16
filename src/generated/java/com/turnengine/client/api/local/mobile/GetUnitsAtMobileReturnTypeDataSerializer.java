package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUnitsAtMobileReturnTypeDataSerializer extends ObjectSerializer<IGetUnitsAtMobile> {

	public GetUnitsAtMobileReturnTypeDataSerializer() {
		super(false);
	}

	public GetUnitsAtMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUnitsAtMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetUnitsAtMobile(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUnitsAtMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
	}
}
