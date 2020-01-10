package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class ListActionsAvailableAtMobileReturnTypeJsonSerializer implements IJsonSerializer<List<IActionAvailable>> {

	private String name;

	public ListActionsAvailableAtMobileReturnTypeJsonSerializer() {
		this("ListActionsAvailableAtMobileReturnType");
	}

	public ListActionsAvailableAtMobileReturnTypeJsonSerializer(String name) {
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
	public List<IActionAvailable> readObject(IJsonReader reader) {
		return new ListSerializer<IActionAvailable>(new ActionAvailableJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IActionAvailable> object) {
		new ListSerializer<IActionAvailable>(new ActionAvailableJsonSerializer()).writeObject(writer, object);
	}
}
