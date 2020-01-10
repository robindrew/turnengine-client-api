package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.creation.CreationConditionType;

public class SetupAddActionConditionXmlSerializer implements IXmlSerializer<ISetupAddActionCondition> {

	private String name;

	public SetupAddActionConditionXmlSerializer() {
		this("SetupAddActionCondition");
	}

	public SetupAddActionConditionXmlSerializer(String name) {
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
	public ISetupAddActionCondition readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		ActionTargetType param2 = reader.readObject(new EnumSerializer<ActionTargetType>(ActionTargetType.class, "target"));
		ActionConditionExecute param3 = reader.readObject(new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class, "execute"));
		CreationConditionType param4 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, "condition"));
		String param5 = reader.readObject(new StringSerializer("conditionName1"));
		long param6 = reader.readLong("conditionAmount1");
		String param7 = reader.readObject(new StringSerializer("conditionName2"));
		long param8 = reader.readLong("conditionAmount2");
		String param9 = reader.readObject(new StringSerializer("conditionName3"));
		long param10 = reader.readLong("conditionAmount3");
		boolean param11 = reader.readBoolean("optional");
		reader.endElement(getName());

		// Create the bean
		return new SetupAddActionCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupAddActionCondition object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class, "target"));
		writer.writeObject(object.getExecute(), new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class, "execute"));
		writer.writeObject(object.getCondition(), new EnumSerializer<CreationConditionType>(CreationConditionType.class, "condition"));
		writer.writeObject(object.getConditionName1(), new StringSerializer("conditionName1"));
		writer.writeLong("conditionAmount1", object.getConditionAmount1());
		writer.writeObject(object.getConditionName2(), new StringSerializer("conditionName2"));
		writer.writeLong("conditionAmount2", object.getConditionAmount2());
		writer.writeObject(object.getConditionName3(), new StringSerializer("conditionName3"));
		writer.writeLong("conditionAmount3", object.getConditionAmount3());
		writer.writeBoolean("optional", object.getOptional());
		writer.endElement(getName());
	}
}
