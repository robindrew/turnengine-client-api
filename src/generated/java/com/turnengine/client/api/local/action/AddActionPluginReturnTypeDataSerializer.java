package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AddActionPluginReturnTypeDataSerializer extends ObjectSerializer<IAddActionPlugin> {

	public AddActionPluginReturnTypeDataSerializer() {
		super(false);
	}

	public AddActionPluginReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddActionPlugin readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		return new AddActionPlugin(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddActionPlugin object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getPluginName(), new StringSerializer(false));
		writer.writeObject(object.getPlugin(), new StringSerializer(false));
	}
}
