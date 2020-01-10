package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GroupDataSerializer extends ObjectSerializer<IGroup> {

	public GroupDataSerializer() {
		super(false);
	}

	public GroupDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGroup readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new Group(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGroup object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getFactionId());
		writer.writeInt(object.getParentId());
	}
}
