package com.turnengine.client.api.local.allianceforum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAlliancePostListReturnTypeDataSerializer extends ObjectSerializer<IGetAlliancePostList> {

	public GetAlliancePostListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAlliancePostListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAlliancePostList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new GetAlliancePostList(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAlliancePostList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getThreadId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
	}
}
