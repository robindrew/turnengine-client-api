package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
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
