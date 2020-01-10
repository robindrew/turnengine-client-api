package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetTurnSummaryReturnTypeJsonSerializer implements IJsonSerializer<ITurnSummary> {

	private String name;

	public GetTurnSummaryReturnTypeJsonSerializer() {
		this("GetTurnSummaryReturnType");
	}

	public GetTurnSummaryReturnTypeJsonSerializer(String name) {
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
	public ITurnSummary readObject(IJsonReader reader) {
		return new TurnSummaryJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, ITurnSummary object) {
		new TurnSummaryJsonSerializer().writeObject(writer, object);
	}
}
