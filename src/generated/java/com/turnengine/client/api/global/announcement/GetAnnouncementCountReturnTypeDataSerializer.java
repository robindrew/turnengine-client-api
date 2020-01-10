package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetAnnouncementCountReturnTypeDataSerializer extends ObjectSerializer<IGetAnnouncementCount> {

	public GetAnnouncementCountReturnTypeDataSerializer() {
		super(false);
	}

	public GetAnnouncementCountReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAnnouncementCount readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		return new GetAnnouncementCount(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAnnouncementCount object) throws IOException {
		writer.writeInt(object.getGameId());
	}
}
