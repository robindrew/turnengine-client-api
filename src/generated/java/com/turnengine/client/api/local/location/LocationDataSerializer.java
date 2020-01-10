package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.array.IntArraySerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionExecutingDataSerializer;
import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.mobile.IMobileInfo;
import com.turnengine.client.api.local.mobile.MobileInfoDataSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoDataSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;
import java.io.IOException;
import java.util.List;

public class LocationDataSerializer extends ObjectSerializer<ILocation> {

	public LocationDataSerializer() {
		super(false);
	}

	public LocationDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILocation readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int[] param3 = reader.readObject(new IntArraySerializer(false));
		int param4 = reader.readInt();
		IPlayerInfo param5 = reader.readObject(new PlayerInfoDataSerializer(false));
		LocationSignup param6 = reader.readObject(new EnumSerializer<LocationSignup>(LocationSignup.class, false));
		int param7 = reader.readInt();
		List<IUnitCount> param8 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		List<IUnitCount> param9 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		List<IActionExecuting> param10 = reader.readObject(new ListSerializer<IActionExecuting>(new ActionExecutingDataSerializer(false), false));
		List<IUnitCount> param11 = reader.readObject(new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		List<IMobileInfo> param12 = reader.readObject(new ListSerializer<IMobileInfo>(new MobileInfoDataSerializer(false), false));
		int param13 = reader.readInt();
		int param14 = reader.readInt();
		return new Location(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
	}

	@Override
	public void writeValue(IDataWriter writer, ILocation object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getCoordinates(), new IntArraySerializer(false));
		writer.writeInt(object.getGroupId());
		writer.writeObject(object.getPlayer(), new PlayerInfoDataSerializer(false));
		writer.writeObject(object.getSignup(), new EnumSerializer<LocationSignup>(LocationSignup.class, false));
		writer.writeInt(object.getSignupFactionId());
		writer.writeObject(object.getLocationUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		writer.writeObject(object.getMobileUnitList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		writer.writeObject(object.getActionExecutingList(), new ListSerializer<IActionExecuting>(new ActionExecutingDataSerializer(false), false));
		writer.writeObject(object.getUpkeepList(), new ListSerializer<IUnitCount>(new UnitCountDataSerializer(false), false));
		writer.writeObject(object.getMobileList(), new ListSerializer<IMobileInfo>(new MobileInfoDataSerializer(false), false));
		writer.writeInt(object.getPreviousId());
		writer.writeInt(object.getNextId());
	}
}
