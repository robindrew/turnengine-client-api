package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AddUpkeepReturnTypeDataSerializer extends ObjectSerializer<IAddUpkeep> {

	public AddUpkeepReturnTypeDataSerializer() {
		super(false);
	}

	public AddUpkeepReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddUpkeep readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		long param4 = reader.readLong();
		return new AddUpkeep(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddUpkeep object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeLong(object.getLimit());
	}
}
