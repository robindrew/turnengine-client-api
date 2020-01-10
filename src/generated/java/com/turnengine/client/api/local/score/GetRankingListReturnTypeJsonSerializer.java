package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetRankingListReturnTypeJsonSerializer implements IJsonSerializer<List<IRanking>> {

	private String name;

	public GetRankingListReturnTypeJsonSerializer() {
		this("GetRankingListReturnType");
	}

	public GetRankingListReturnTypeJsonSerializer(String name) {
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
	public List<IRanking> readObject(IJsonReader reader) {
		return new ListSerializer<IRanking>(new RankingJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IRanking> object) {
		new ListSerializer<IRanking>(new RankingJsonSerializer()).writeObject(writer, object);
	}
}
