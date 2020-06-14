package com.turnengine.client.api.global.forum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;
import java.util.List;

public class ForumDataSerializer extends ObjectSerializer<IForum> {

	public ForumDataSerializer() {
		super(false);
	}

	public ForumDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IForum readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		boolean param4 = reader.readBoolean();
		boolean param5 = reader.readBoolean();
		boolean param6 = reader.readBoolean();
		int param7 = reader.readInt();
		int param8 = reader.readInt();
		List<IForum> param9 = reader.readObject(new ListSerializer<IForum>(new ForumDataSerializer(false), false));
		List<IForumThread> param10 = reader.readObject(new ListSerializer<IForumThread>(new ForumThreadDataSerializer(false), false));
		return new Forum(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
	}

	@Override
	public void writeValue(IDataWriter writer, IForum object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getOrder());
		writer.writeBoolean(object.getLocked());
		writer.writeBoolean(object.getArchived());
		writer.writeBoolean(object.getDeleted());
		writer.writeInt(object.getThreads());
		writer.writeInt(object.getPosts());
		writer.writeObject(object.getForumList(), new ListSerializer<IForum>(new ForumDataSerializer(false), false));
		writer.writeObject(object.getThreadList(), new ListSerializer<IForumThread>(new ForumThreadDataSerializer(false), false));
	}
}
