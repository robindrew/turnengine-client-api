package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class KickAllianceMemberReturnTypeDataSerializer extends ObjectSerializer<IKickAllianceMember> {

	public KickAllianceMemberReturnTypeDataSerializer() {
		super(false);
	}

	public KickAllianceMemberReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IKickAllianceMember readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new KickAllianceMember(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IKickAllianceMember object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getPlayerId());
	}
}
