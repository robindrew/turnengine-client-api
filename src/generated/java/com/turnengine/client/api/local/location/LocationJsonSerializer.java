package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.IntArraySerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionExecutingJsonSerializer;
import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.mobile.IMobileInfo;
import com.turnengine.client.api.local.mobile.MobileInfoJsonSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoJsonSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountJsonSerializer;
import java.util.List;

public class LocationJsonSerializer implements IJsonSerializer<ILocation> {

	private String name;

	public LocationJsonSerializer() {
		this("Location");
	}

	public LocationJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public ILocation readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ILocation object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getCoordinates(), new IntArraySerializer());
		writer.writeInt(object.getGroupId());
		writer.writeObject(object.getPlayer(), new PlayerInfoJsonSerializer());
		writer.writeObject(object.getSignup(), new EnumSerializer<LocationSignup>(LocationSignup.class));
		writer.writeInt(object.getSignupFactionId());
		writer.writeObject(object.getLocationUnitList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.writeObject(object.getMobileUnitList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.writeObject(object.getActionExecutingList(), new ListSerializer<IActionExecuting>(new ActionExecutingJsonSerializer()));
		writer.writeObject(object.getUpkeepList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.writeObject(object.getMobileList(), new ListSerializer<IMobileInfo>(new MobileInfoJsonSerializer()));
		writer.writeInt(object.getPreviousId());
		writer.writeInt(object.getNextId());
		writer.closeObject();
	}
}
