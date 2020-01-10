package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAlliancePostListReturnTypeJsonSerializer implements IJsonSerializer<List<IAllianceForumPost>> {

	private String name;

	public GetAlliancePostListReturnTypeJsonSerializer() {
		this("GetAlliancePostListReturnType");
	}

	public GetAlliancePostListReturnTypeJsonSerializer(String name) {
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
	public List<IAllianceForumPost> readObject(IJsonReader reader) {
		return new ListSerializer<IAllianceForumPost>(new AllianceForumPostJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAllianceForumPost> object) {
		new ListSerializer<IAllianceForumPost>(new AllianceForumPostJsonSerializer()).writeObject(writer, object);
	}
}
