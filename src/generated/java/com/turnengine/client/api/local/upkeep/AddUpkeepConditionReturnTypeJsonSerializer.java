package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddUpkeepConditionReturnTypeJsonSerializer implements IJsonSerializer<IUpkeepCondition> {

	private String name;

	public AddUpkeepConditionReturnTypeJsonSerializer() {
		this("AddUpkeepConditionReturnType");
	}

	public AddUpkeepConditionReturnTypeJsonSerializer(String name) {
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
	public IUpkeepCondition readObject(IJsonReader reader) {
		return new UpkeepConditionJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IUpkeepCondition object) {
		new UpkeepConditionJsonSerializer().writeObject(writer, object);
	}
}
