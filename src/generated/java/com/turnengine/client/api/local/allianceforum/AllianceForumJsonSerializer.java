package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import java.util.List;

public class AllianceForumJsonSerializer implements IJsonSerializer<IAllianceForum> {

	private String name;

	public AllianceForumJsonSerializer() {
		this("AllianceForum");
	}

	public AllianceForumJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAllianceForum object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getOrder());
		writer.writeBoolean(object.getLocked());
		writer.writeBoolean(object.getArchived());
		writer.writeBoolean(object.getDeleted());
		writer.writeInt(object.getThreads());
		writer.writeInt(object.getPosts());
		writer.writeObject(object.getForumList(), new ListSerializer<IAllianceForum>(new AllianceForumJsonSerializer()));
		writer.writeObject(object.getThreadList(), new ListSerializer<IAllianceForumThread>(new AllianceForumThreadJsonSerializer()));
		writer.closeObject();
	}
}
