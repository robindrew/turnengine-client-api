package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class CreateAllianceForumThreadJsonSerializer implements IJsonSerializer<ICreateAllianceForumThread> {

	private String name;

	public CreateAllianceForumThreadJsonSerializer() {
		this("CreateAllianceForumThread");
	}

	public CreateAllianceForumThreadJsonSerializer(String name) {
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
	public ICreateAllianceForumThread readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ICreateAllianceForumThread object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getForumId());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.closeObject();
	}
}
