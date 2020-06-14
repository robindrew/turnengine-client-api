package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupAddUpkeepDataSerializer extends ObjectSerializer<ISetupAddUpkeep> {

	public SetupAddUpkeepDataSerializer() {
		super(false);
	}

	public SetupAddUpkeepDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupAddUpkeep readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		long param2 = reader.readLong();
		return new SetupAddUpkeep(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupAddUpkeep object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeLong(object.getLimit());
	}
}
