package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceMemberLimitReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceMemberLimit> {

	public GetAllianceMemberLimitReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceMemberLimitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceMemberLimit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAllianceMemberLimit(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceMemberLimit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
