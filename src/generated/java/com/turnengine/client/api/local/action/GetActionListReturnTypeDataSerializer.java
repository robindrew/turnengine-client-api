package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetActionListReturnTypeDataSerializer extends ObjectSerializer<IGetActionList> {

	public GetActionListReturnTypeDataSerializer() {
		super(false);
	}

	public GetActionListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetActionList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetActionList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetActionList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
