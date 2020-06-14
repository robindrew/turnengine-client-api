package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetPlayerSignupPluginReturnTypeDataSerializer extends ObjectSerializer<ISetPlayerSignupPlugin> {

	public SetPlayerSignupPluginReturnTypeDataSerializer() {
		super(false);
	}

	public SetPlayerSignupPluginReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetPlayerSignupPlugin readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new SetPlayerSignupPlugin(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetPlayerSignupPlugin object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPlugin(), new StringSerializer(false));
	}
}
