package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.UnitMove;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitType;

public class SetupAddUnitXmlSerializer implements IXmlSerializer<ISetupAddUnit> {

	private String name;

	public SetupAddUnitXmlSerializer() {
		this("SetupAddUnit");
	}

	public SetupAddUnitXmlSerializer(String name) {
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
	public ISetupAddUnit readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		UnitNode param2 = reader.readObject(new EnumSerializer<UnitNode>(UnitNode.class, "node"));
		UnitType param3 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "type"));
		UnitMove param4 = reader.readObject(new EnumSerializer<UnitMove>(UnitMove.class, "move"));
		String param5 = reader.readObject(new StringSerializer("groupName"));
		String param6 = reader.readObject(new StringSerializer("factionName"));
		reader.endElement(getName());

		// Create the bean
		return new SetupAddUnit(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupAddUnit object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getNode(), new EnumSerializer<UnitNode>(UnitNode.class, "node"));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, "type"));
		writer.writeObject(object.getMove(), new EnumSerializer<UnitMove>(UnitMove.class, "move"));
		writer.writeObject(object.getGroupName(), new StringSerializer("groupName"));
		writer.writeObject(object.getFactionName(), new StringSerializer("factionName"));
		writer.endElement(getName());
	}
}
