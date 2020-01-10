package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class RenamePlayerReturnTypeDataSerializer extends ObjectSerializer<IRenamePlayer> {

	public RenamePlayerReturnTypeDataSerializer() {
		super(false);
	}

	public RenamePlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IRenamePlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new RenamePlayer(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IRenamePlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getFrom(), new StringSerializer(false));
		writer.writeObject(object.getTo(), new StringSerializer(false));
	}
}
