package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceThreadListReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceThreadList> {

	public GetAllianceThreadListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceThreadListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceThreadList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new GetAllianceThreadList(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceThreadList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getPageNumber());
		writer.writeInt(object.getPageSize());
	}
}
