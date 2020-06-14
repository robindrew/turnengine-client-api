package com.turnengine.client.api.local.upkeep;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUpkeepConditionListReturnTypeDataSerializer extends ObjectSerializer<IGetUpkeepConditionList> {

	public GetUpkeepConditionListReturnTypeDataSerializer() {
		super(false);
	}

	public GetUpkeepConditionListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUpkeepConditionList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetUpkeepConditionList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUpkeepConditionList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
