package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;

public class SetupAddUpkeepConditionJsonSerializer implements IJsonSerializer<ISetupAddUpkeepCondition> {

	private String name;

	public SetupAddUpkeepConditionJsonSerializer() {
		this("SetupAddUpkeepCondition");
	}

	public SetupAddUpkeepConditionJsonSerializer(String name) {
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
	public ISetupAddUpkeepCondition readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddUpkeepCondition object) {
		writer.openObject();
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
