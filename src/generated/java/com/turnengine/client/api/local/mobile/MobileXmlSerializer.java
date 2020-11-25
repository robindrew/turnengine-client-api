package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionExecutingXmlSerializer;
import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.location.LocationInfoXmlSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class MobileXmlSerializer implements IXmlSerializer<IMobile> {

	private String name;

	public MobileXmlSerializer() {
		this("Mobile");
	}

	public MobileXmlSerializer(String name) {
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
	public IMobile readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		IPlayerInfo param3 = reader.readObject(new PlayerInfoXmlSerializer("player"));
		ILocationInfo param4 = reader.readObject(new LocationInfoXmlSerializer("origin"));
		ILocationInfo param5 = reader.readObject(new LocationInfoXmlSerializer("destination"));
		int param6 = reader.readInt("moveTurns");
		int param7 = reader.readInt("waitTurns");
		List<IUnitCount> param8 = reader.readObject(new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		List<IActionExecuting> param9 = reader.readObject(new ListSerializer<IActionExecuting>("actionExecutingList", new ActionExecutingXmlSerializer("element")));
		List<IUnitCount> param10 = reader.readObject(new ListSerializer<IUnitCount>("upkeepList", new UnitCountXmlSerializer("element")));
		int param11 = reader.readInt("previousId");
		int param12 = reader.readInt("nextId");
		reader.endElement(getName());

		// Create the bean
		return new Mobile(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobile object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPlayer(), new PlayerInfoXmlSerializer("player"));
		writer.writeObject(object.getOrigin(), new LocationInfoXmlSerializer("origin"));
		writer.writeObject(object.getDestination(), new LocationInfoXmlSerializer("destination"));
		writer.writeInt("moveTurns", object.getMoveTurns());
		writer.writeInt("waitTurns", object.getWaitTurns());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		writer.writeObject(object.getActionExecutingList(), new ListSerializer<IActionExecuting>("actionExecutingList", new ActionExecutingXmlSerializer("element")));
		writer.writeObject(object.getUpkeepList(), new ListSerializer<IUnitCount>("upkeepList", new UnitCountXmlSerializer("element")));
		writer.writeInt("previousId", object.getPreviousId());
		writer.writeInt("nextId", object.getNextId());
		writer.endElement(getName());
	}
}
