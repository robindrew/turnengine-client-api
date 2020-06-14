package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceSetupInfoReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceSetupInfo> {

	public GetAllianceSetupInfoReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceSetupInfoReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceSetupInfo readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAllianceSetupInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceSetupInfo object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
