package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class ActionStatusDataSerializer extends ObjectSerializer<IActionStatus> {

	public ActionStatusDataSerializer() {
		super(false);
	}

	public ActionStatusDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IActionStatus readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new ActionStatus(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IActionStatus object) throws IOException {
		writer.writeLong(object.getAmount());
		writer.writeObject(object.getFormat(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
