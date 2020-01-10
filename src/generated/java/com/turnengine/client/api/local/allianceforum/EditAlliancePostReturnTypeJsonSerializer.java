package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class EditAlliancePostReturnTypeJsonSerializer implements IJsonSerializer<IAllianceForumPost> {

	private String name;

	public EditAlliancePostReturnTypeJsonSerializer() {
		this("EditAlliancePostReturnType");
	}

	public EditAlliancePostReturnTypeJsonSerializer(String name) {
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
	public IAllianceForumPost readObject(IJsonReader reader) {
		return new AllianceForumPostJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceForumPost object) {
		new AllianceForumPostJsonSerializer().writeObject(writer, object);
	}
}
