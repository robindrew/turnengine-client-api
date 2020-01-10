package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceThreadListReturnTypeJsonSerializer implements IJsonSerializer<List<IAllianceForumThread>> {

	private String name;

	public GetAllianceThreadListReturnTypeJsonSerializer() {
		this("GetAllianceThreadListReturnType");
	}

	public GetAllianceThreadListReturnTypeJsonSerializer(String name) {
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
	public List<IAllianceForumThread> readObject(IJsonReader reader) {
		return new ListSerializer<IAllianceForumThread>(new AllianceForumThreadJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAllianceForumThread> object) {
		new ListSerializer<IAllianceForumThread>(new AllianceForumThreadJsonSerializer()).writeObject(writer, object);
	}
}
