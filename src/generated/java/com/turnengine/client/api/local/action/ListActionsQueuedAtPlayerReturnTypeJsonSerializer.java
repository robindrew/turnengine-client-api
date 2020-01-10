package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class ListActionsQueuedAtPlayerReturnTypeJsonSerializer implements IJsonSerializer<List<IActionQueued>> {

	private String name;

	public ListActionsQueuedAtPlayerReturnTypeJsonSerializer() {
		this("ListActionsQueuedAtPlayerReturnType");
	}

	public ListActionsQueuedAtPlayerReturnTypeJsonSerializer(String name) {
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
	public List<IActionQueued> readObject(IJsonReader reader) {
		return new ListSerializer<IActionQueued>(new ActionQueuedJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IActionQueued> object) {
		new ListSerializer<IActionQueued>(new ActionQueuedJsonSerializer()).writeObject(writer, object);
	}
}
