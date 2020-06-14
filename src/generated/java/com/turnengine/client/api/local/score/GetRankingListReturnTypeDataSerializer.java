package com.turnengine.client.api.local.score;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import java.io.IOException;

public class GetRankingListReturnTypeDataSerializer extends ObjectSerializer<IGetRankingList> {

	public GetRankingListReturnTypeDataSerializer() {
		super(false);
	}

	public GetRankingListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetRankingList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		RankingType param3 = reader.readObject(new EnumSerializer<RankingType>(RankingType.class, false));
		int param4 = reader.readInt();
		return new GetRankingList(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetRankingList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getType(), new EnumSerializer<RankingType>(RankingType.class, false));
		writer.writeInt(object.getGroupId());
	}
}
