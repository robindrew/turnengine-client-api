package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetUserAvatarReturnTypeDataSerializer extends ObjectSerializer<IGetUserAvatar> {

	public GetUserAvatarReturnTypeDataSerializer() {
		super(false);
	}

	public GetUserAvatarReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetUserAvatar readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		boolean param4 = reader.readBoolean();
		return new GetUserAvatar(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetUserAvatar object) throws IOException {
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getWidth());
		writer.writeInt(object.getHeight());
		writer.writeBoolean(object.getFill());
	}
}
