package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.IntegerSerializer;
import java.util.List;

public class GetRankingGroupListReturnTypeJsonSerializer implements IJsonSerializer<List<Integer>> {

	private String name;

	public GetRankingGroupListReturnTypeJsonSerializer() {
		this("GetRankingGroupListReturnType");
	}

	public GetRankingGroupListReturnTypeJsonSerializer(String name) {
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
	public List<Integer> readObject(IJsonReader reader) {
		return new ListSerializer<Integer>(new IntegerSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<Integer> object) {
		new ListSerializer<Integer>(new IntegerSerializer()).writeObject(writer, object);
	}
}
