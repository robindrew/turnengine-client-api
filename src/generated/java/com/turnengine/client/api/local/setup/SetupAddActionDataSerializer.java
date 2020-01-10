package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupAddActionDataSerializer extends ObjectSerializer<ISetupAddAction> {

	public SetupAddActionDataSerializer() {
		super(false);
	}

	public SetupAddActionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddAction readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new SetupAddAction(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddAction object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getTurns());
		writer.writeInt(object.getLimit());
	}
}
