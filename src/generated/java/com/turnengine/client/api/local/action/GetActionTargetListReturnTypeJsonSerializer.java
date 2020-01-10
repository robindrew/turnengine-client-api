package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetActionTargetListReturnTypeJsonSerializer implements IJsonSerializer<List<IActionTarget>> {

	private String name;

	public GetActionTargetListReturnTypeJsonSerializer() {
		this("GetActionTargetListReturnType");
	}

	public GetActionTargetListReturnTypeJsonSerializer(String name) {
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
	public List<IActionTarget> readObject(IJsonReader reader) {
		return new ListSerializer<IActionTarget>(new ActionTargetJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IActionTarget> object) {
		new ListSerializer<IActionTarget>(new ActionTargetJsonSerializer()).writeObject(writer, object);
	}
}
