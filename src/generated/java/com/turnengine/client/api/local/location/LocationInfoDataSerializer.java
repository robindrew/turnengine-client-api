package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.array.IntArraySerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoDataSerializer;
import java.io.IOException;

public class LocationInfoDataSerializer extends ObjectSerializer<ILocationInfo> {

	public LocationInfoDataSerializer() {
		super(false);
	}

	public LocationInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILocationInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int[] param3 = reader.readObject(new IntArraySerializer(false));
		IPlayerInfo param4 = reader.readObject(new PlayerInfoDataSerializer(false));
		return new LocationInfo(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ILocationInfo object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getCoordinates(), new IntArraySerializer(false));
		writer.writeObject(object.getPlayer(), new PlayerInfoDataSerializer(false));
	}
}
