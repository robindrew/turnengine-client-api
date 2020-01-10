package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class AllianceForumPostJsonSerializer implements IJsonSerializer<IAllianceForumPost> {

	private String name;

	public AllianceForumPostJsonSerializer() {
		this("AllianceForumPost");
	}

	public AllianceForumPostJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceForumPost object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeInt(object.getThreadId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getDate());
		writer.writeInt(object.getLastEdited());
		writer.writeObject(object.getPoster(), new AllianceForumUserJsonSerializer());
		writer.writeObject(object.getSubject(), new StringSerializer());
		writer.writeObject(object.getContent(), new StringSerializer());
		writer.writeBoolean(object.getDeleted());
		writer.closeObject();
	}
}
