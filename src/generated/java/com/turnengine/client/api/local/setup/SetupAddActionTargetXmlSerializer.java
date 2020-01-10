package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public class SetupAddActionTargetXmlSerializer implements IXmlSerializer<ISetupAddActionTarget> {

	private String name;

	public SetupAddActionTargetXmlSerializer() {
		this("SetupAddActionTarget");
	}

	public SetupAddActionTargetXmlSerializer(String name) {
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
	public ISetupAddActionTarget readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		ActionTargetType param2 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, "target"));
		UnitType param3 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "type"));
		UnitRelation param4 = reader.readObject(new EnumSerializer<UnitRelation>(UnitRelation.class, "relation"));
		reader.endElement(getName());

		// Create the bean
		return new SetupAddActionTarget(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupAddActionTarget object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, "target"));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, "type"));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class, "relation"));
		writer.endElement(getName());
	}
}
