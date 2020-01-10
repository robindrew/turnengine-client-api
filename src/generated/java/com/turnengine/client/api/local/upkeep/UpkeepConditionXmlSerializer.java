package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;

public class UpkeepConditionXmlSerializer implements IXmlSerializer<IUpkeepCondition> {

	private String name;

	public UpkeepConditionXmlSerializer() {
		this("UpkeepCondition");
	}

	public UpkeepConditionXmlSerializer(String name) {
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
	public IUpkeepCondition readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		CreationConditionType param2 = reader.readObject(new EnumSerializer<CreationConditionType>(CreationConditionType.class, "conditionType"));
		int param3 = reader.readInt("conditionId1");
		long param4 = reader.readLong("conditionAmount1");
		int param5 = reader.readInt("conditionId2");
		long param6 = reader.readLong("conditionAmount2");
		int param7 = reader.readInt("conditionId3");
		long param8 = reader.readLong("conditionAmount3");
		boolean param9 = reader.readBoolean("optional");
		reader.endElement(getName());

		// Create the bean
		return new UpkeepCondition(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUpkeepCondition object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getConditionType(), new EnumSerializer<CreationConditionType>(CreationConditionType.class, "conditionType"));
		writer.writeInt("conditionId1", object.getConditionId1());
		writer.writeLong("conditionAmount1", object.getConditionAmount1());
		writer.writeInt("conditionId2", object.getConditionId2());
		writer.writeLong("conditionAmount2", object.getConditionAmount2());
		writer.writeInt("conditionId3", object.getConditionId3());
		writer.writeLong("conditionAmount3", object.getConditionAmount3());
		writer.writeBoolean("optional", object.getOptional());
		writer.endElement(getName());
	}
}
