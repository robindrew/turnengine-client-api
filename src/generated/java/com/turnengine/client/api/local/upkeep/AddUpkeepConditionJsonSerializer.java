package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;

public class AddUpkeepConditionJsonSerializer implements IJsonSerializer<IAddUpkeepCondition> {

	private String name;

	public AddUpkeepConditionJsonSerializer() {
		this("AddUpkeepCondition");
	}

	public AddUpkeepConditionJsonSerializer(String name) {
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
	public IAddUpkeepCondition readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddUpkeepCondition object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getCondition(), new EnumSerializer<CreationConditionType>(CreationConditionType.class));
		writer.writeObject(object.getConditionName1(), new StringSerializer());
		writer.writeLong(object.getConditionAmount1());
		writer.writeObject(object.getConditionName2(), new StringSerializer());
		writer.writeLong(object.getConditionAmount2());
		writer.writeObject(object.getConditionName3(), new StringSerializer());
		writer.writeLong(object.getConditionAmount3());
		writer.writeBoolean(object.getOptional());
		writer.closeObject();
	}
}
