package com.turnengine.client.api.local.alliance;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class AllianceSetupInfoDataSerializer extends ObjectSerializer<IAllianceSetupInfo> {

	public AllianceSetupInfoDataSerializer() {
		super(false);
	}

	public AllianceSetupInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAllianceSetupInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		boolean param2 = reader.readBoolean();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new AllianceSetupInfo(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IAllianceSetupInfo object) throws IOException {
		writer.writeInt(object.getCount());
		writer.writeBoolean(object.getEnabled());
		writer.writeInt(object.getMemberLimit());
		writer.writeInt(object.getInviteLimit());
		writer.writeInt(object.getLeaveTurns());
	}
}
