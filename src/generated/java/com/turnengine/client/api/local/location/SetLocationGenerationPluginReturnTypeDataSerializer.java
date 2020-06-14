package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetLocationGenerationPluginReturnTypeDataSerializer extends ObjectSerializer<ISetLocationGenerationPlugin> {

	public SetLocationGenerationPluginReturnTypeDataSerializer() {
		super(false);
	}

	public SetLocationGenerationPluginReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetLocationGenerationPlugin readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new SetLocationGenerationPlugin(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetLocationGenerationPlugin object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPlugin(), new StringSerializer(false));
	}
}
