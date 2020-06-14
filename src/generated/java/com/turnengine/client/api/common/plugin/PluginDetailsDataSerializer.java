package com.turnengine.client.api.common.plugin;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class PluginDetailsDataSerializer extends ObjectSerializer<IPluginDetails> {

	public PluginDetailsDataSerializer() {
		super(false);
	}

	public PluginDetailsDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPluginDetails readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		return new PluginDetails(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IPluginDetails object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getXml(), new StringSerializer(false));
	}
}
