package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAllianceThreadReturnTypeJsonSerializer implements IJsonSerializer<IAllianceForumThread> {

	private String name;

	public GetAllianceThreadReturnTypeJsonSerializer() {
		this("GetAllianceThreadReturnType");
	}

	public GetAllianceThreadReturnTypeJsonSerializer(String name) {
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
	public IAllianceForumThread readObject(IJsonReader reader) {
		return new AllianceForumThreadJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceForumThread object) {
		new AllianceForumThreadJsonSerializer().writeObject(writer, object);
	}
}
