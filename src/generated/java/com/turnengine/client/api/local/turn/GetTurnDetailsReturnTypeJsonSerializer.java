package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetTurnDetailsReturnTypeJsonSerializer implements IJsonSerializer<List<ITurnDetails>> {

	private String name;

	public GetTurnDetailsReturnTypeJsonSerializer() {
		this("GetTurnDetailsReturnType");
	}

	public GetTurnDetailsReturnTypeJsonSerializer(String name) {
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
	public List<ITurnDetails> readObject(IJsonReader reader) {
		return new ListSerializer<ITurnDetails>(new TurnDetailsJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<ITurnDetails> object) {
		new ListSerializer<ITurnDetails>(new TurnDetailsJsonSerializer()).writeObject(writer, object);
	}
}
