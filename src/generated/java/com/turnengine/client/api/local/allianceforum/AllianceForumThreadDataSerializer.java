package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;
import java.util.List;

public class AllianceForumThreadDataSerializer extends ObjectSerializer<IAllianceForumThread> {

	public AllianceForumThreadDataSerializer() {
		super(false);
	}

	public AllianceForumThreadDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAllianceForumThread readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		String param5 = reader.readObject(new StringSerializer(false));
		IAllianceForumUser param6 = reader.readObject(new AllianceForumUserDataSerializer(false));
		boolean param7 = reader.readBoolean();
		boolean param8 = reader.readBoolean();
		boolean param9 = reader.readBoolean();
		boolean param10 = reader.readBoolean();
		List<IAllianceForumPost> param11 = reader.readObject(new ListSerializer<IAllianceForumPost>(new AllianceForumPostDataSerializer(false), false));
		return new AllianceForumThread(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
	}

	@Override
	public void writeValue(IDataWriter writer, IAllianceForumThread object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getDate());
		writer.writeInt(object.getLastUpdated());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getPoster(), new AllianceForumUserDataSerializer(false));
		writer.writeBoolean(object.getSticky());
		writer.writeBoolean(object.getLocked());
		writer.writeBoolean(object.getArchived());
		writer.writeBoolean(object.getDeleted());
		writer.writeObject(object.getPostList(), new ListSerializer<IAllianceForumPost>(new AllianceForumPostDataSerializer(false), false));
	}
}
