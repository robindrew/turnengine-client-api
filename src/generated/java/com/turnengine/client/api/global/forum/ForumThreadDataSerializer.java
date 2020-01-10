package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.collection.ListSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;
import java.util.List;

public class ForumThreadDataSerializer extends ObjectSerializer<IForumThread> {

	public ForumThreadDataSerializer() {
		super(false);
	}

	public ForumThreadDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IForumThread readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		String param5 = reader.readObject(new StringSerializer(false));
		IForumUser param6 = reader.readObject(new ForumUserDataSerializer(false));
		boolean param7 = reader.readBoolean();
		boolean param8 = reader.readBoolean();
		boolean param9 = reader.readBoolean();
		boolean param10 = reader.readBoolean();
		List<IForumPost> param11 = reader.readObject(new ListSerializer<IForumPost>(new ForumPostDataSerializer(false), false));
		return new ForumThread(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11);
	}

	@Override
	public void writeValue(IDataWriter writer, IForumThread object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getDate());
		writer.writeInt(object.getLastUpdated());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getPoster(), new ForumUserDataSerializer(false));
		writer.writeBoolean(object.getSticky());
		writer.writeBoolean(object.getLocked());
		writer.writeBoolean(object.getArchived());
		writer.writeBoolean(object.getDeleted());
		writer.writeObject(object.getPostList(), new ListSerializer<IForumPost>(new ForumPostDataSerializer(false), false));
	}
}
