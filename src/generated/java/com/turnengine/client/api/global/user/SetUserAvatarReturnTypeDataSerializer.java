package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.array.ByteArraySerializer;
import java.io.IOException;

public class SetUserAvatarReturnTypeDataSerializer extends ObjectSerializer<ISetUserAvatar> {

	public SetUserAvatarReturnTypeDataSerializer() {
		super(false);
	}

	public SetUserAvatarReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetUserAvatar readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		byte[] param2 = reader.readObject(new ByteArraySerializer(false));
		return new SetUserAvatar(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetUserAvatar object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getImage(), new ByteArraySerializer(false));
	}
}
