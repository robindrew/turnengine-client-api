package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.LongSerializer;

public class GetTurnStartTimeReturnTypeJsonSerializer implements IJsonSerializer<Long> {

	private String name;

	public GetTurnStartTimeReturnTypeJsonSerializer() {
		this("GetTurnStartTimeReturnType");
	}

	public GetTurnStartTimeReturnTypeJsonSerializer(String name) {
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
	public Long readObject(IJsonReader reader) {
		return new LongSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, Long object) {
		new LongSerializer().writeObject(writer, object);
	}
}
