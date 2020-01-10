package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetInvitedToJoinAllianceListReturnTypeDataSerializer extends ObjectSerializer<IGetInvitedToJoinAllianceList> {

	public GetInvitedToJoinAllianceListReturnTypeDataSerializer() {
		super(false);
	}

	public GetInvitedToJoinAllianceListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetInvitedToJoinAllianceList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetInvitedToJoinAllianceList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetInvitedToJoinAllianceList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
