package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.unit.UnitType;

public class ActionExecutingXmlSerializer implements IXmlSerializer<IActionExecuting> {

	private String name;

	public ActionExecutingXmlSerializer() {
		this("ActionExecuting");
	}

	public ActionExecutingXmlSerializer(String name) {
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
	public IActionExecuting readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("sourceId");
		UnitType param2 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "sourceType"));
		int param3 = reader.readInt("targetId");
		UnitType param4 = reader.readObject(new EnumSerializer<UnitType>(UnitType.class, "targetType"));
		int param5 = reader.readInt("actionId");
		int param6 = reader.readInt("groupId");
		long param7 = reader.readLong("amount");
		int param8 = reader.readInt("turns");
		reader.endElement(getName());

		// Create the bean
		return new ActionExecuting(param1, param2, param3, param4, param5, param6, param7, param8);
	}

	@Override
	public void writeObject(IXmlWriter writer, IActionExecuting object) {
		writer.startElement(getName());
		writer.writeInt("sourceId", object.getSourceId());
		writer.writeObject(object.getSourceType(), new EnumSerializer<UnitType>(UnitType.class, "sourceType"));
		writer.writeInt("targetId", object.getTargetId());
		writer.writeObject(object.getTargetType(), new EnumSerializer<UnitType>(UnitType.class, "targetType"));
		writer.writeInt("actionId", object.getActionId());
		writer.writeInt("groupId", object.getGroupId());
		writer.writeLong("amount", object.getAmount());
		writer.writeInt("turns", object.getTurns());
		writer.endElement(getName());
	}
}
