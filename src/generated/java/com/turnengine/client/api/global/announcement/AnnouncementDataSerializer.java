package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AnnouncementDataSerializer extends ObjectSerializer<IAnnouncement> {

	public AnnouncementDataSerializer() {
		super(false);
	}

	public AnnouncementDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAnnouncement readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		int param4 = reader.readInt();
		String param5 = reader.readObject(new StringSerializer(false));
		int param6 = reader.readInt();
		String param7 = reader.readObject(new StringSerializer(false));
		int param8 = reader.readInt();
		String param9 = reader.readObject(new StringSerializer(false));
		long param10 = reader.readLong();
		String param11 = reader.readObject(new StringSerializer(false));
		String param12 = reader.readObject(new StringSerializer(false));
		return new Announcement(param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12);
	}

	@Override
	public void writeValue(IDataWriter writer, IAnnouncement object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeInt(object.getGameId());
		writer.writeObject(object.getGameName(), new StringSerializer(false));
		writer.writeInt(object.getVersionId());
		writer.writeObject(object.getVersionName(), new StringSerializer(false));
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getInstanceName(), new StringSerializer(false));
		writer.writeInt(object.getUserId());
		writer.writeObject(object.getUserName(), new StringSerializer(false));
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getBody(), new StringSerializer(false));
	}
}
