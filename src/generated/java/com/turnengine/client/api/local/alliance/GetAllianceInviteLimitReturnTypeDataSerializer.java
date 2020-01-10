package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAllianceInviteLimitReturnTypeDataSerializer extends ObjectSerializer<IGetAllianceInviteLimit> {

	public GetAllianceInviteLimitReturnTypeDataSerializer() {
		super(false);
	}

	public GetAllianceInviteLimitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAllianceInviteLimit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetAllianceInviteLimit(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAllianceInviteLimit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
