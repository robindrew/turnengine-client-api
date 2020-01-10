package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetActionConditionListReturnTypeJsonSerializer implements IJsonSerializer<List<IActionCondition>> {

	private String name;

	public GetActionConditionListReturnTypeJsonSerializer() {
		this("GetActionConditionListReturnType");
	}

	public GetActionConditionListReturnTypeJsonSerializer(String name) {
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
	public List<IActionCondition> readObject(IJsonReader reader) {
		return new ListSerializer<IActionCondition>(new ActionConditionJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IActionCondition> object) {
		new ListSerializer<IActionCondition>(new ActionConditionJsonSerializer()).writeObject(writer, object);
	}
}
