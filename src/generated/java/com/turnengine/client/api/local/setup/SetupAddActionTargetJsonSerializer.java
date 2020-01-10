package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public class SetupAddActionTargetJsonSerializer implements IJsonSerializer<ISetupAddActionTarget> {

	private String name;

	public SetupAddActionTargetJsonSerializer() {
		this("SetupAddActionTarget");
	}

	public SetupAddActionTargetJsonSerializer(String name) {
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
	public ISetupAddActionTarget readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddActionTarget object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getTarget(), new EnumSerializer<ActionTargetType>(ActionTargetType.class));
		writer.writeObject(object.getType(), new EnumSerializer<UnitType>(UnitType.class));
		writer.writeObject(object.getRelation(), new EnumSerializer<UnitRelation>(UnitRelation.class));
		writer.closeObject();
	}
}
