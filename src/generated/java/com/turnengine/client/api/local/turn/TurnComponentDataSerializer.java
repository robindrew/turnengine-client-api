package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class TurnComponentDataSerializer extends ObjectSerializer<ITurnComponent> {

	public TurnComponentDataSerializer() {
		super(false);
	}

	public TurnComponentDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ITurnComponent readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		long param2 = reader.readLong();
		return new TurnComponent(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ITurnComponent object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeLong(object.getDuration());
	}
}
