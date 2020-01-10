package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoDataSerializer;
import java.io.IOException;

public class MobileInfoDataSerializer extends ObjectSerializer<IMobileInfo> {

	public MobileInfoDataSerializer() {
		super(false);
	}

	public MobileInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMobileInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		IPlayerInfo param3 = reader.readObject(new PlayerInfoDataSerializer(false));
		return new MobileInfo(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IMobileInfo object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPlayer(), new PlayerInfoDataSerializer(false));
	}
}
