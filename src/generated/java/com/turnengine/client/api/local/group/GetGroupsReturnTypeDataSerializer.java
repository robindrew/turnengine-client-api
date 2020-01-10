package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGroupsReturnTypeDataSerializer extends ObjectSerializer<IGetGroups> {

	public GetGroupsReturnTypeDataSerializer() {
		super(false);
	}

	public GetGroupsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGroups readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetGroups(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGroups object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
