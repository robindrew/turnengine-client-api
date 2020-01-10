package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ActionAvailableDataSerializer extends ObjectSerializer<IActionAvailable> {

	public ActionAvailableDataSerializer() {
		super(false);
	}

	public ActionAvailableDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IActionAvailable readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		return new ActionAvailable(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IActionAvailable object) throws IOException {
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
	}
}
