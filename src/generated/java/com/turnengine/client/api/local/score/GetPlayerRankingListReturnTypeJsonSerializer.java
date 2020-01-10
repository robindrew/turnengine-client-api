package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetPlayerRankingListReturnTypeJsonSerializer implements IJsonSerializer<List<IPlayerRanking>> {

	private String name;

	public GetPlayerRankingListReturnTypeJsonSerializer() {
		this("GetPlayerRankingListReturnType");
	}

	public GetPlayerRankingListReturnTypeJsonSerializer(String name) {
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
	public List<IPlayerRanking> readObject(IJsonReader reader) {
		return new ListSerializer<IPlayerRanking>(new PlayerRankingJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IPlayerRanking> object) {
		new ListSerializer<IPlayerRanking>(new PlayerRankingJsonSerializer()).writeObject(writer, object);
	}
}
