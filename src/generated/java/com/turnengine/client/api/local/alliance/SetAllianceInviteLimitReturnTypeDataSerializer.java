package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetAllianceInviteLimitReturnTypeDataSerializer extends ObjectSerializer<ISetAllianceInviteLimit> {

	public SetAllianceInviteLimitReturnTypeDataSerializer() {
		super(false);
	}

	public SetAllianceInviteLimitReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetAllianceInviteLimit readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new SetAllianceInviteLimit(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetAllianceInviteLimit object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLimit());
	}
}
