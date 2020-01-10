package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.location.LocationInfoXmlSerializer;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountXmlSerializer;
import java.util.List;

public class MobileQueueItemXmlSerializer implements IXmlSerializer<IMobileQueueItem> {

	private String name;

	public MobileQueueItemXmlSerializer() {
		this("MobileQueueItem");
	}

	public MobileQueueItemXmlSerializer(String name) {
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
	public IMobileQueueItem readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		MobileQueueType param2 = reader.readObject(new EnumSerializer<MobileQueueType>(MobileQueueType.class, "type"));
		int param3 = reader.readInt("index");
		boolean param4 = reader.readBoolean("repeat");
		ILocationInfo param5 = reader.readObject(new LocationInfoXmlSerializer("location"));
		IMobileInfo param6 = reader.readObject(new MobileInfoXmlSerializer("mobile"));
		int param7 = reader.readInt("turns");
		List<IUnitCount> param8 = reader.readObject(new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		reader.endElement(getName());

		// Create the bean
		return new MobileQueueItem(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeObject(IXmlWriter writer, IMobileQueueItem object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getType(), new EnumSerializer<MobileQueueType>(MobileQueueType.class, "type"));
		writer.writeInt("index", object.getIndex());
		writer.writeBoolean("repeat", object.getRepeat());
		writer.writeObject(object.getLocation(), new LocationInfoXmlSerializer("location"));
		writer.writeObject(object.getMobile(), new MobileInfoXmlSerializer("mobile"));
		writer.writeInt("turns", object.getTurns());
		writer.writeObject(object.getUnitList(), new ListSerializer<IUnitCount>("unitList", new UnitCountXmlSerializer("element")));
		writer.endElement(getName());
	}
}
