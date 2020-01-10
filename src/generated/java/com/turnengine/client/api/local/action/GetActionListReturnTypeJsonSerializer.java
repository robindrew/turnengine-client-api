package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetActionListReturnTypeJsonSerializer implements IJsonSerializer<List<IAction>> {

	private String name;

	public GetActionListReturnTypeJsonSerializer() {
		this("GetActionListReturnType");
	}

	public GetActionListReturnTypeJsonSerializer(String name) {
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
	public List<IAction> readObject(IJsonReader reader) {
		return new ListSerializer<IAction>(new ActionJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAction> object) {
		new ListSerializer<IAction>(new ActionJsonSerializer()).writeObject(writer, object);
	}
}
