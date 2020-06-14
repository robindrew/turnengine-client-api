package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceCountReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceCount> {

	public GetAllianceCountReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceCountReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceCount readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAllianceCount(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceCount object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
