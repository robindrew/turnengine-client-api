package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.array.ByteArraySerializer;
import java.io.IOException;

public class SetPlayerAvatarReturnTypeDataSerializer extends ObjectSerializer<ISetPlayerAvatar> {

	public SetPlayerAvatarReturnTypeDataSerializer() {
		super(false);
	}

	public SetPlayerAvatarReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetPlayerAvatar readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		byte[] param3 = reader.readObject(new ByteArraySerializer(false));
		return new SetPlayerAvatar(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetPlayerAvatar object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getImage(), new ByteArraySerializer(false));
	}
}
