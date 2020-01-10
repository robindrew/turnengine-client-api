package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetRequestedToJoinAllianceListReturnTypeDataSerializer extends ObjectSerializer<IGetRequestedToJoinAllianceList> {

	public GetRequestedToJoinAllianceListReturnTypeDataSerializer() {
		super(false);
	}

	public GetRequestedToJoinAllianceListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetRequestedToJoinAllianceList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetRequestedToJoinAllianceList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetRequestedToJoinAllianceList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
