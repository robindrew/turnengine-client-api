package com.turnengine.client.api.local.score;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetRankingGroupListReturnTypeDataSerializer extends ObjectSerializer<IGetRankingGroupList> {

	public GetRankingGroupListReturnTypeDataSerializer() {
		super(false);
	}

	public GetRankingGroupListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetRankingGroupList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetRankingGroupList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetRankingGroupList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
