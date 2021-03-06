package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetAllianceForumListReturnTypeJsonSerializer implements IJsonSerializer<List<IAllianceForum>> {

	private String name;

	public GetAllianceForumListReturnTypeJsonSerializer() {
		this("GetAllianceForumListReturnType");
	}

	public GetAllianceForumListReturnTypeJsonSerializer(String name) {
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
	public List<IAllianceForum> readObject(IJsonReader reader) {
		return new ListSerializer<IAllianceForum>(new AllianceForumJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IAllianceForum> object) {
		new ListSerializer<IAllianceForum>(new AllianceForumJsonSerializer()).writeObject(writer, object);
	}
}
