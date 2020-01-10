package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.game.GameLevel;
import java.io.IOException;

public class GetAnnouncementListReturnTypeDataSerializer extends ObjectSerializer<IGetAnnouncementList> {

	public GetAnnouncementListReturnTypeDataSerializer() {
		super(false);
	}

	public GetAnnouncementListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAnnouncementList readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		GameLevel param2 = reader.readObject(new EnumSerializer<GameLevel>(GameLevel.class, false));
		return new GetAnnouncementList(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAnnouncementList object) throws IOException {
		writer.writeInt(object.getGameLevelId());
		writer.writeObject(object.getGameLevel(), new EnumSerializer<GameLevel>(GameLevel.class, false));
	}
}
