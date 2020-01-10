package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.creation.CreationConditionType;

public class ActionConditionJsonSerializer implements IJsonSerializer<IActionCondition> {

	private String name;

	public ActionConditionJsonSerializer() {
		this("ActionCondition");
	}

	public ActionConditionJsonSerializer(String name) {
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
	public IActionCondition readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionCondition object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class));
		writer.writeObject(object.getExecute(), new EnumSerializer<ActionConditionExecute>(ActionConditionExecute.class));
		writer.writeObject(object.getConditionType(), new EnumSerializer<CreationConditionType>(CreationConditionType.class));
		writer.writeInt(object.getConditionId1());
		writer.writeLong(object.getConditionAmount1());
		writer.writeInt(object.getConditionId2());
		writer.writeLong(object.getConditionAmount2());
		writer.writeInt(object.getConditionId3());
		writer.writeLong(object.getConditionAmount3());
		writer.writeBoolean(object.getOptional());
		writer.closeObject();
	}
}
