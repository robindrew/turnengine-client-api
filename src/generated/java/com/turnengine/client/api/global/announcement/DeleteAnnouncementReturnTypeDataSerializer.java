package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class DeleteAnnouncementReturnTypeDataSerializer extends ObjectSerializer<IDeleteAnnouncement> {

	public DeleteAnnouncementReturnTypeDataSerializer() {
		super(false);
	}

	public DeleteAnnouncementReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IDeleteAnnouncement readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new DeleteAnnouncement(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IDeleteAnnouncement object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
	}
}
