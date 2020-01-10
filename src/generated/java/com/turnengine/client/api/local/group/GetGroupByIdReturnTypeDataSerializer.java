package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGroupByIdReturnTypeDataSerializer extends ObjectSerializer<IGetGroupById> {

	public GetGroupByIdReturnTypeDataSerializer() {
		super(false);
	}

	public GetGroupByIdReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGroupById readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new GetGroupById(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGroupById object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getId());
	}
}
