package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.location.LocationInfoDataSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoDataSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class MobileDataSerializer extends ObjectSerializer<IMobile> {

	public MobileDataSerializer() {
		super(false);
	}

	public MobileDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMobile readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		IPlayerInfo param3 = reader.readObject(new PlayerInfoDataSerializer(false));
		ILocationInfo param4 = reader.readObject(new LocationInfoDataSerializer(false));
		ILocationInfo param5 = reader.readObject(new LocationInfoDataSerializer(false));
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		List<IUnitCount> param8 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		return new Mobile(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeValue(IDataWriter writer, IMobile object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPlayer(), new PlayerInfoDataSerializer(false));
		writer.writeObject(object.getOrigin(), new LocationInfoDataSerializer(false));
		writer.writeObject(object.getDestination(), new LocationInfoDataSerializer(false));
		writer.writeInt(object.getMoveTurns());
		writer.writeInt(object.getWaitTurns());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
	}
}
