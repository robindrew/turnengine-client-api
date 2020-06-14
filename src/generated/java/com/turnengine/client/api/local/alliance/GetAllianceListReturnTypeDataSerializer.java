package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceListReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceList> {

	public GetAllianceListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAllianceList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
