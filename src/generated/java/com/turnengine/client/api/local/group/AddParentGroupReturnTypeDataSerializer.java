package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AddParentGroupReturnTypeDataSerializer extends ObjectSerializer<IAddParentGroup> {

	public AddParentGroupReturnTypeDataSerializer() {
		super(false);
	}

	public AddParentGroupReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddParentGroup readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new AddParentGroup(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddParentGroup object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeObject(object.getFactionName(), new StringSerializer(false));
	}
}
