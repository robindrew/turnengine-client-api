package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AddUnitXmlSerializer implements IXmlSerializer<IAddUnit> {

	private String name;

	public AddUnitXmlSerializer() {
		this("AddUnit");
	}

	public AddUnitXmlSerializer(String name) {
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
	public IAddUnit readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		UnitNode param4 = reader.readObject(new EnumSerializer<UnitNode>(UnitNode.class, "node"));
		UnitType param5 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "type"));
		UnitMove param6 = reader.readObject(new EnumSerializer<UnitMove>(UnitMove.class, "move"));
		String param7 = reader.readObject(new StringSerializer("groupName"));
		String param8 = reader.readObject(new StringSerializer("factionName"));
		reader.endElement(getName());

		// Create the bean
		return new AddUnit(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddUnit object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class, "node"));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, "type"));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class, "move"));
		writer.writeObject(object.getGroupName(), new StringSerializer("groupName"));
		writer.writeObject(object.getFactionName(), new StringSerializer("factionName"));
		writer.endElement(getName());
	}
}
