package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetActionConditionListReturnTypeDataSerializer extends ObjectSerializer<IGetActionConditionList> {

	public GetActionConditionListReturnTypeDataSerializer() {
		super(false);
	}

	public GetActionConditionListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetActionConditionList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetActionConditionList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetActionConditionList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
