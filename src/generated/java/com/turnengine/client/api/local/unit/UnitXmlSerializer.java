package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class UnitXmlSerializer implements IXmlSerializer<IUnit> {

	private String name;

	public UnitXmlSerializer() {
		this("Unit");
	}

	public UnitXmlSerializer(String name) {
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
	public IUnit readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		UnitNode param3 = reader.readObject(new EnumSerializer<UnitNode>(UnitNode.class, "node"));
		UnitType param4 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "type"));
		UnitMove param5 = reader.readObject(new EnumSerializer<UnitMove>(UnitMove.class, "move"));
		int param6 = reader.readInt("groupId");
		int param7 = reader.readInt("factionId");
		reader.endElement(getName());

		// Create the bean
		return new Unit(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUnit object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class, "node"));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, "type"));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class, "move"));
		writer.writeInt("groupId", object.getGroupId());
		writer.writeInt("factionId", object.getFactionId());
		writer.endElement(getName());
	}
}
