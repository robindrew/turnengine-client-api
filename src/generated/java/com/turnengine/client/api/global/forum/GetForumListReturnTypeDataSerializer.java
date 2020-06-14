package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetForumListReturnTypeDataSerializer extends ObjectSerializer<IGetForumList> {

	public GetForumListReturnTypeDataSerializer() {
		super(false);
	}

	public GetForumListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetForumList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		return new GetForumList(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetForumList object) throws IOException {
		writer.writeLong(object.getLoginId());
	}
}
