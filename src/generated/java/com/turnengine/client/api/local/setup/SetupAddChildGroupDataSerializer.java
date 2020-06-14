package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupAddChildGroupDataSerializer extends ObjectSerializer<ISetupAddChildGroup> {

	public SetupAddChildGroupDataSerializer() {
		super(false);
	}

	public SetupAddChildGroupDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddChildGroup readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new SetupAddChildGroup(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddChildGroup object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getParentName(), new StringSerializer(false));
		writer.writeObject(object.getFactionName(), new StringSerializer(false));
	}
}
