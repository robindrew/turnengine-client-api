package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.turnengine.client.api.local.score.GroupScoreJsonSerializer;
import com.turnengine.client.api.local.score.IGroupScore;

public class GetPlayerScoreReturnTypeJsonSerializer implements IJsonSerializer<IGroupScore> {

	private String name;

	public GetPlayerScoreReturnTypeJsonSerializer() {
		this("GetPlayerScoreReturnType");
	}

	public GetPlayerScoreReturnTypeJsonSerializer(String name) {
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
	public IGroupScore readObject(IJsonReader reader) {
		return new GroupScoreJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGroupScore object) {
		new GroupScoreJsonSerializer().writeObject(writer, object);
	}
}
