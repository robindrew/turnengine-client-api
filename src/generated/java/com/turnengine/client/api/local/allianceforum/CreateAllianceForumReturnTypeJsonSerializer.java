package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class CreateAllianceForumReturnTypeJsonSerializer implements IJsonSerializer<IAllianceForum> {

	private String name;

	public CreateAllianceForumReturnTypeJsonSerializer() {
		this("CreateAllianceForumReturnType");
	}

	public CreateAllianceForumReturnTypeJsonSerializer(String name) {
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
	public IAllianceForum readObject(IJsonReader reader) {
		return new AllianceForumJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceForum object) {
		new AllianceForumJsonSerializer().writeObject(writer, object);
	}
}
