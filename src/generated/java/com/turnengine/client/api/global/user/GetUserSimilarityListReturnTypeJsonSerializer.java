package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserSimilarityListReturnTypeJsonSerializer implements IJsonSerializer<List<IUserSimilarity>> {

	private String name;

	public GetUserSimilarityListReturnTypeJsonSerializer() {
		this("GetUserSimilarityListReturnType");
	}

	public GetUserSimilarityListReturnTypeJsonSerializer(String name) {
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
	public List<IUserSimilarity> readObject(IJsonReader reader) {
		return new ListSerializer<IUserSimilarity>(new UserSimilarityJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUserSimilarity> object) {
		new ListSerializer<IUserSimilarity>(new UserSimilarityJsonSerializer()).writeObject(writer, object);
	}
}
