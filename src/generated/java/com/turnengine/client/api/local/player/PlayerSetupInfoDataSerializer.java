package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class PlayerSetupInfoDataSerializer extends ObjectSerializer<IPlayerSetupInfo> {

	public PlayerSetupInfoDataSerializer() {
		super(false);
	}

	public PlayerSetupInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPlayerSetupInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		boolean param3 = reader.readBoolean();
		return new PlayerSetupInfo(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IPlayerSetupInfo object) throws IOException {
		writer.writeInt(object.getCount());
		writer.writeInt(object.getLimit());
		writer.writeBoolean(object.getSignupsEnabled());
	}
}
