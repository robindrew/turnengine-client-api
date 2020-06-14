package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class InviteToJoinAllianceByNameReturnTypeDataSerializer extends ObjectSerializer<IInviteToJoinAllianceByName> {

	public InviteToJoinAllianceByNameReturnTypeDataSerializer() {
		super(false);
	}

	public InviteToJoinAllianceByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IInviteToJoinAllianceByName readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new InviteToJoinAllianceByName(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IInviteToJoinAllianceByName object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getPlayerName(), new StringSerializer(false));
	}
}
