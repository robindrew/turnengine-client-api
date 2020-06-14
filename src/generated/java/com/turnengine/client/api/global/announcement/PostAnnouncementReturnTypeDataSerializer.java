package com.turnengine.client.api.global.announcement;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.EnumSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.game.GameLevel;
import java.io.IOException;

public class PostAnnouncementReturnTypeDataSerializer extends ObjectSerializer<IPostAnnouncement> {

	public PostAnnouncementReturnTypeDataSerializer() {
		super(false);
	}

	public PostAnnouncementReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPostAnnouncement readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		GameLevel param3 = reader.readObject(new EnumSerializer<GameLevel>(GameLevel.class, false));
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		return new PostAnnouncement(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IPostAnnouncement object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getGameLevelId());
		writer.writeObject(object.getGameLevel(), new EnumSerializer<GameLevel>(GameLevel.class, false));
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getBody(), new StringSerializer(false));
	}
}
