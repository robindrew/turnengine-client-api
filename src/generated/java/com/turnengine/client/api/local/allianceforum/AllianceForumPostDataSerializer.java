package com.turnengine.client.api.local.allianceforum;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AllianceForumPostDataSerializer extends ObjectSerializer<IAllianceForumPost> {

	public AllianceForumPostDataSerializer() {
		super(false);
	}

	public AllianceForumPostDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAllianceForumPost readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		IAllianceForumUser param6 = reader.readObject(new AllianceForumUserDataSerializer(false));
		String param7 = reader.readObject(new StringSerializer(false));
		String param8 = reader.readObject(new StringSerializer(false));
		boolean param9 = reader.readBoolean();
		return new AllianceForumPost(param1, param2, param3, param4, param5, param6, param7, param8, param9);
	}

	@Override
	public void writeValue(IDataWriter writer, IAllianceForumPost object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeInt(object.getThreadId());
		writer.writeInt(object.getForumId());
		writer.writeInt(object.getDate());
		writer.writeInt(object.getLastEdited());
		writer.writeObject(object.getPoster(), new AllianceForumUserDataSerializer(false));
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
		writer.writeBoolean(object.getDeleted());
	}
}
