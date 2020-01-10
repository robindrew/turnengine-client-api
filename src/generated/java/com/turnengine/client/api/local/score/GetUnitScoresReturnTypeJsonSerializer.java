package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUnitScoresReturnTypeJsonSerializer implements IJsonSerializer<List<IUnitScore>> {

	private String name;

	public GetUnitScoresReturnTypeJsonSerializer() {
		this("GetUnitScoresReturnType");
	}

	public GetUnitScoresReturnTypeJsonSerializer(String name) {
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
	public List<IUnitScore> readObject(IJsonReader reader) {
		return new ListSerializer<IUnitScore>(new UnitScoreJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUnitScore> object) {
		new ListSerializer<IUnitScore>(new UnitScoreJsonSerializer()).writeObject(writer, object);
	}
}
