package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public class ActionTargetJsonSerializer implements IJsonSerializer<IActionTarget> {

	private String name;

	public ActionTargetJsonSerializer() {
		this("ActionTarget");
	}

	public ActionTargetJsonSerializer(String name) {
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
	public IActionTarget readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IActionTarget object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getTargetType(), new EnumSerializer<ActionTargetType>(ActionTargetType.class));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class));
		writer.closeObject();
	}
}
