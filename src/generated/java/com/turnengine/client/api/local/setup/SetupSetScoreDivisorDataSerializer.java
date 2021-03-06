package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupSetScoreDivisorDataSerializer extends ObjectSerializer<ISetupSetScoreDivisor> {

	public SetupSetScoreDivisorDataSerializer() {
		super(false);
	}

	public SetupSetScoreDivisorDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupSetScoreDivisor readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		long param4 = reader.readLong();
		return new SetupSetScoreDivisor(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupSetScoreDivisor object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer(false));
		writer.writeLong(object.getDivisor());
	}
}
