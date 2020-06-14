package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetThreadReturnTypeDataSerializer extends ObjectSerializer<IGetThread> {

	public GetThreadReturnTypeDataSerializer() {
		super(false);
	}

	public GetThreadReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetThread readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetThread(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetThread object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getThreadId());
	}
}
