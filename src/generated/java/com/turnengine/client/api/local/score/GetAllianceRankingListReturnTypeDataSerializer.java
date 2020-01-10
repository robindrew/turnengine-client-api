package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceRankingListReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceRankingList> {

	public GetAllianceRankingListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceRankingListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceRankingList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new GetAllianceRankingList(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceRankingList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
	}
}
