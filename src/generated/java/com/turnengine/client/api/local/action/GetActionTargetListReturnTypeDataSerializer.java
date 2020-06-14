package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetActionTargetListReturnTypeDataSerializer extends ObjectSerializer<IGetActionTargetList> {

	public GetActionTargetListReturnTypeDataSerializer() {
		super(false);
	}

	public GetActionTargetListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetActionTargetList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetActionTargetList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetActionTargetList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
