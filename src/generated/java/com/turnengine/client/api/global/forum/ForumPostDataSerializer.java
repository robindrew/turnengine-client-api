package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ForumPostDataSerializer extends ObjectSerializer<IForumPost> {

	public ForumPostDataSerializer() {
		super(false);
	}

	public ForumPostDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IForumPost readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		IForumUser param6 = reader.readObject(new ForumUserDataSerializer(false));
		String param7 = reader.readObject(new StringSerializer(false));
		String param8 = reader.readObject(new StringSerializer(false));
		boolean param9 = reader.readBoolean();
		return new ForumPost(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeValue(IDataWriter writer, IForumPost object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeInt(object.getThreadId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getDate());
		writer.writeInt(object.getLastEdited());
		writer.writeObject(object.getPoster(), new ForumUserDataSerializer(false));
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
		writer.writeBoolean(object.getDeleted());
	}
}
