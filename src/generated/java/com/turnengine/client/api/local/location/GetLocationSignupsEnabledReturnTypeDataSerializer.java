package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationSignupsEnabledReturnTypeDataSerializer extends ObjectSerializer<IGetLocationSignupsEnabled> {

	public GetLocationSignupsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationSignupsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationSignupsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetLocationSignupsEnabled(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationSignupsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
