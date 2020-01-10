package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetPostListReturnTypeDataSerializer extends ObjectSerializer<IGetPostList> {

	public GetPostListReturnTypeDataSerializer() {
		super(false);
	}

	public GetPostListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetPostList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new GetPostList(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetPostList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getThreadId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
	}
}
