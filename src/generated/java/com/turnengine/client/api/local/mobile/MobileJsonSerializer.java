package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionExecutingJsonSerializer;
import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.location.LocationInfoJsonSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoJsonSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountJsonSerializer;
import java.util.List;

public class MobileJsonSerializer implements IJsonSerializer<IMobile> {

	private String name;

	public MobileJsonSerializer() {
		this("Mobile");
	}

	public MobileJsonSerializer(String name) {
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
	public IMobile readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMobile object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getPlayer(), new PlayerInfoJsonSerializer());
		writer.writeObject(object.getOrigin(), new LocationInfoJsonSerializer());
		writer.writeObject(object.getDestination(), new LocationInfoJsonSerializer());
		writer.writeInt(object.getMoveTurns());
		writer.writeInt(object.getWaitTurns());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.writeObject(object.getActionExecutingList(), new ListSerializer<IActionExecuting>(new ActionExecutingJsonSerializer()));
		writer.writeObject(object.getUpkeepList(), new ListSerializer<IUnitCount>(new UnitCountJsonSerializer()));
		writer.writeInt(object.getPreviousId());
		writer.writeInt(object.getNextId());
		writer.closeObject();
	}
}
