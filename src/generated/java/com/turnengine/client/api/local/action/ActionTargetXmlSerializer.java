package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public class ActionTargetXmlSerializer implements IXmlSerializer<IActionTarget> {

	private String name;

	public ActionTargetXmlSerializer() {
		this("ActionTarget");
	}

	public ActionTargetXmlSerializer(String name) {
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
	public IActionTarget readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		ActionTargetType param2 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, "targetType"));
		UnitType param3 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "type"));
		UnitRelation param4 = reader.readObject(new EnumSerializer<UnitRelation>(UnitRelation.class, "relation"));
		reader.endElement(getName());

		// Create the bean
		return new ActionTarget(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IActionTarget object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getTargetType(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, "targetType"));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, "type"));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class, "relation"));
		writer.endElement(getName());
	}
}
