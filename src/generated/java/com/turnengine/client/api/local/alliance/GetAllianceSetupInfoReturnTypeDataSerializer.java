package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
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
