package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupAddParentGroupDataSerializer extends ObjectSerializer<ISetupAddParentGroup> {

	public SetupAddParentGroupDataSerializer() {
		super(false);
	}

	public SetupAddParentGroupDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddParentGroup readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		return new SetupAddParentGroup(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddParentGroup object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getFactionName(), new StringSerializer(false));
	}
}
