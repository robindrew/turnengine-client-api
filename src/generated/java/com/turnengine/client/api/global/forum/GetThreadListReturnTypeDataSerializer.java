package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetThreadListReturnTypeDataSerializer extends ObjectSerializer<IGetThreadList> {

	public GetThreadListReturnTypeDataSerializer() {
		super(false);
	}

	public GetThreadListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetThreadList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new GetThreadList(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetThreadList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
	}
}
