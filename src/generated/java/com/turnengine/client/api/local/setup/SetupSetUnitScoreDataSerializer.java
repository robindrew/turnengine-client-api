package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupSetUnitScoreDataSerializer extends ObjectSerializer<ISetupSetUnitScore> {

	public SetupSetUnitScoreDataSerializer() {
		super(false);
	}

	public SetupSetUnitScoreDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupSetUnitScore readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		long param5 = reader.readLong();
		return new SetupSetUnitScore(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupSetUnitScore object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer(false));
		writer.writeObject(object.getUnit(), new StringSerializer(false));
		writer.writeLong(object.getScore());
	}
}
