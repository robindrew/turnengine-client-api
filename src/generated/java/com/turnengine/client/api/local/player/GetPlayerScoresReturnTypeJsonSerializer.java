package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.score.ITurnScore;
import com.turnengine.client.api.local.score.TurnScoreJsonSerializer;
import java.util.List;

public class GetPlayerScoresReturnTypeJsonSerializer implements IJsonSerializer<List<ITurnScore>> {

	private String name;

	public GetPlayerScoresReturnTypeJsonSerializer() {
		this("GetPlayerScoresReturnType");
	}

	public GetPlayerScoresReturnTypeJsonSerializer(String name) {
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
	public List<ITurnScore> readObject(IJsonReader reader) {
		return new ListSerializer<ITurnScore>(new TurnScoreJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<ITurnScore> object) {
		new ListSerializer<ITurnScore>(new TurnScoreJsonSerializer()).writeObject(writer, object);
	}
}
