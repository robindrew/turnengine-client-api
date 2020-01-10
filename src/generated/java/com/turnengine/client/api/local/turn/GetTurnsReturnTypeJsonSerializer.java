package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetTurnsReturnTypeJsonSerializer implements IJsonSerializer<List<ITurn>> {

	private String name;

	public GetTurnsReturnTypeJsonSerializer() {
		this("GetTurnsReturnType");
	}

	public GetTurnsReturnTypeJsonSerializer(String name) {
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
	public List<ITurn> readObject(IJsonReader reader) {
		return new ListSerializer<ITurn>(new TurnJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<ITurn> object) {
		new ListSerializer<ITurn>(new TurnJsonSerializer()).writeObject(writer, object);
	}
}
