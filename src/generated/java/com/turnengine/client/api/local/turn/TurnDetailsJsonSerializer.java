package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class TurnDetailsJsonSerializer implements IJsonSerializer<ITurnDetails> {

	private String name;

	public TurnDetailsJsonSerializer() {
		this("TurnDetails");
	}

	public TurnDetailsJsonSerializer(String name) {
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
	public ITurnDetails readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ITurnDetails object) {
		writer.openObject();
		writer.writeObject(object.getTurn(), new TurnJsonSerializer());
		writer.writeObject(object.getComponents(), new ListSerializer<ITurnComponent>(new TurnComponentJsonSerializer()));
		writer.closeObject();
	}
}
