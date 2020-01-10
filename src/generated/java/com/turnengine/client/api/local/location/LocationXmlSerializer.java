package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.array.IntArraySerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionExecutingXmlSerializer;
import com.turnengine.client.api.local.action.IActionExecuting;
import com.turnengine.client.api.local.mobile.IMobileInfo;
import com.turnengine.client.api.local.mobile.MobileInfoXmlSerializer;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.player.PlayerInfoXmlSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class LocationXmlSerializer implements IXmlSerializer<ILocation> {

	private String name;

	public LocationXmlSerializer() {
		this("Location");
	}

	public LocationXmlSerializer(String name) {
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
	public ILocation readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int[] param3 = reader.readObject(new IntArraySerializer("coordinates"));
		int param4 = reader.readInt("groupId");
		IPlayerInfo param5 = reader.readObject(new PlayerInfoXmlSerializer("player"));
		LocationSignup param6 = reader.readObject(new EnumSerializer<LocationSignup>(LocationSignup.class, "signup"));
		int param7 = reader.readInt("signupFactionId");
		List<IUnitCount> param8 = reader.readObject(new ListSerializer<IUnitCount>("locationUnitList", new UnitCountXmlSerializer("element")));
		List<IUnitCount> param9 = reader.readObject(new ListSerializer<IUnitCount>("mobileUnitList", new UnitCountXmlSerializer("element")));
		List<IActionExecuting> param10 = reader.readObject(new ListSerializer<IActionExecuting>("actionExecutingList", new ActionExecutingXmlSerializer("element")));
		List<IUnitCount> param11 = reader.readObject(new ListSerializer<IUnitCount>("upkeepList", new UnitCountXmlSerializer("element")));
		List<IMobileInfo> param12 = reader.readObject(new ListSerializer<IMobileInfo>("mobileList", new MobileInfoXmlSerializer("element")));
		int param13 = reader.readInt("previousId");
		int param14 = reader.readInt("nextId");
		reader.endElement(getName());

		// Create the bean
		return new Location(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocation object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getCoordinates(), new IntArraySerializer("coordinates"));
		writer.writeInt("groupId", object.getGroupId());
		writer.writeObject(object.getPlayer(), new PlayerInfoXmlSerializer("player"));
		writer.writeObject(object.getSignup(), new EnumSerializer<LocationSignup>(LocationSignup.class, "signup"));
		writer.writeInt("signupFactionId", object.getSignupFactionId());
		writer.writeObject(object.getLocationUnitList(), new ListSerializer<IUnitCount>("locationUnitList", new UnitCountXmlSerializer("element")));
		writer.writeObject(object.getMobileUnitList(), new ListSerializer<IUnitCount>("mobileUnitList", new UnitCountXmlSerializer("element")));
		writer.writeObject(object.getActionExecutingList(), new ListSerializer<IActionExecuting>("actionExecutingList", new ActionExecutingXmlSerializer("element")));
		writer.writeObject(object.getUpkeepList(), new ListSerializer<IUnitCount>("upkeepList", new UnitCountXmlSerializer("element")));
		writer.writeObject(object.getMobileList(), new ListSerializer<IMobileInfo>("mobileList", new MobileInfoXmlSerializer("element")));
		writer.writeInt("previousId", object.getPreviousId());
		writer.writeInt("nextId", object.getNextId());
		writer.endElement(getName());
	}
}
