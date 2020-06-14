package com.turnengine.client.api.local.score;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetScoreDivisorReturnTypeDataSerializer extends ObjectSerializer<ISetScoreDivisor> {

	public SetScoreDivisorReturnTypeDataSerializer() {
		super(false);
	}

	public SetScoreDivisorReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetScoreDivisor readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		long param4 = reader.readLong();
		return new SetScoreDivisor(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetScoreDivisor object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer(false));
		writer.writeLong(object.getDivisor());
	}
}
