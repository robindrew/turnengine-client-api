package com.turnengine.client.api.local.allianceforum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceForumListReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceForumList> {

	public GetAllianceForumListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceForumListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceForumList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAllianceForumList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceForumList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
