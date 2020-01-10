package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public class AddActionTargetXmlSerializer implements IXmlSerializer<IAddActionTarget> {

	private String name;

	public AddActionTargetXmlSerializer() {
		this("AddActionTarget");
	}

	public AddActionTargetXmlSerializer(String name) {
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
	public IAddActionTarget readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		ActionTargetType param4 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, "target"));
		UnitType param5 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "type"));
		UnitRelation param6 = reader.readObject(new EnumSerializer<UnitRelation>(UnitRelation.class, "relation"));
		reader.endElement(getName());

		// Create the bean
		return new AddActionTarget(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddActionTarget object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, "target"));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class, "type"));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class, "relation"));
		writer.endElement(getName());
	}
}
