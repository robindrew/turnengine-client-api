package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ActionDataSerializer extends ObjectSerializer<IAction> {

	public ActionDataSerializer() {
		super(false);
	}

	public ActionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAction readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new Action(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IAction object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeInt(object.getTurns());
		writer.writeInt(object.getLimit());
	}
}
