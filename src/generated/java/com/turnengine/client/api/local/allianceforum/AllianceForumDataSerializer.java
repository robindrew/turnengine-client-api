package com.turnengine.client.api.local.allianceforum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;
import java.util.List;

public class AllianceForumDataSerializer extends ObjectSerializer<IAllianceForum> {

	public AllianceForumDataSerializer() {
		super(false);
	}

	public AllianceForumDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAllianceForum readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		boolean param4 = reader.readBoolean();
		boolean param5 = reader.readBoolean();
		boolean param6 = reader.readBoolean();
		int param7 = reader.readInt();
		int param8 = reader.readInt();
		List<IAllianceForum> param9 = reader.readObject(new ListSerializer<IAllianceForum>(new AllianceForumDataSerializer(false), false));
		List<IAllianceForumThread> param10 = reader.readObject(new ListSerializer<IAllianceForumThread>(new AllianceForumThreadDataSerializer(false), false));
		return new AllianceForum(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10);
	}

	@Override
	public void writeValue(IDataWriter writer, IAllianceForum object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getOrder());
		writer.writeBoolean(object.getLocked());
		writer.writeBoolean(object.getArchived());
		writer.writeBoolean(object.getDeleted());
		writer.writeInt(object.getThreads());
		writer.writeInt(object.getPosts());
		writer.writeObject(object.getForumList(), new ListSerializer<IAllianceForum>(new AllianceForumDataSerializer(false), false));
		writer.writeObject(object.getThreadList(), new ListSerializer<IAllianceForumThread>(new AllianceForumThreadDataSerializer(false), false));
	}
}
