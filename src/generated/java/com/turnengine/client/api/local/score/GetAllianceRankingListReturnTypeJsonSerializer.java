package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceRankingListReturnTypeJsonSerializer implements IJsonSerializer<List<IAllianceRanking>> {

	private String name;

	public GetAllianceRankingListReturnTypeJsonSerializer() {
		this("GetAllianceRankingListReturnType");
	}

	public GetAllianceRankingListReturnTypeJsonSerializer(String name) {
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
	public List<IAllianceRanking> readObject(IJsonReader reader) {
		return new ListSerializer<IAllianceRanking>(new AllianceRankingJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAllianceRanking> object) {
		new ListSerializer<IAllianceRanking>(new AllianceRankingJsonSerializer()).writeObject(writer, object);
	}
}
