package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.turnengine.client.api.local.score.GroupScoreJsonSerializer;
import com.turnengine.client.api.local.score.IGroupScore;
import java.util.List;

public class GetPlayerScoreListReturnTypeJsonSerializer implements IJsonSerializer<List<IGroupScore>> {

	private String name;

	public GetPlayerScoreListReturnTypeJsonSerializer() {
		this("GetPlayerScoreListReturnType");
	}

	public GetPlayerScoreListReturnTypeJsonSerializer(String name) {
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
	public List<IGroupScore> readObject(IJsonReader reader) {
		return new ListSerializer<IGroupScore>(new GroupScoreJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGroupScore> object) {
		new ListSerializer<IGroupScore>(new GroupScoreJsonSerializer()).writeObject(writer, object);
	}
}
