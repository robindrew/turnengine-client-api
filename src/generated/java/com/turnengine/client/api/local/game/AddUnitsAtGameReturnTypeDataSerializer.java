package com.turnengine.client.api.local.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AddUnitsAtGameReturnTypeDataSerializer extends ObjectSerializer<IAddUnitsAtGame> {

	public AddUnitsAtGameReturnTypeDataSerializer() {
		super(false);
	}

	public AddUnitsAtGameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddUnitsAtGame readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		long param4 = reader.readLong();
		return new AddUnitsAtGame(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddUnitsAtGame object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeLong(object.getAmount());
	}
}
