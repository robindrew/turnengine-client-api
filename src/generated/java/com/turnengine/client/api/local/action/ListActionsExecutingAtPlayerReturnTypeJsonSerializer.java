package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class ListActionsExecutingAtPlayerReturnTypeJsonSerializer implements IJsonSerializer<List<IActionExecuting>> {

	private String name;

	public ListActionsExecutingAtPlayerReturnTypeJsonSerializer() {
		this("ListActionsExecutingAtPlayerReturnType");
	}

	public ListActionsExecutingAtPlayerReturnTypeJsonSerializer(String name) {
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
	public List<IActionExecuting> readObject(IJsonReader reader) {
		return new ListSerializer<IActionExecuting>(new ActionExecutingJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IActionExecuting> object) {
		new ListSerializer<IActionExecuting>(new ActionExecutingJsonSerializer()).writeObject(writer, object);
	}
}
