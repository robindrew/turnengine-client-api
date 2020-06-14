package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPlayerSignupsEnabledReturnTypeDataSerializer extends ObjectSerializer<IGetPlayerSignupsEnabled> {

	public GetPlayerSignupsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public GetPlayerSignupsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPlayerSignupsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetPlayerSignupsEnabled(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPlayerSignupsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
