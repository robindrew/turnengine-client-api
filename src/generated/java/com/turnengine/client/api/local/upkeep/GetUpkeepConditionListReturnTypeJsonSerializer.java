package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUpkeepConditionListReturnTypeJsonSerializer implements IJsonSerializer<List<IUpkeepCondition>> {

	private String name;

	public GetUpkeepConditionListReturnTypeJsonSerializer() {
		this("GetUpkeepConditionListReturnType");
	}

	public GetUpkeepConditionListReturnTypeJsonSerializer(String name) {
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
	public List<IUpkeepCondition> readObject(IJsonReader reader) {
		return new ListSerializer<IUpkeepCondition>(new UpkeepConditionJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUpkeepCondition> object) {
		new ListSerializer<IUpkeepCondition>(new UpkeepConditionJsonSerializer()).writeObject(writer, object);
	}
}
