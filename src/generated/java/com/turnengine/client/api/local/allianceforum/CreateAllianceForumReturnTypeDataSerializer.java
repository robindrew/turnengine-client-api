package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CreateAllianceForumReturnTypeDataSerializer extends ObjectSerializer<ICreateAllianceForum> {

	public CreateAllianceForumReturnTypeDataSerializer() {
		super(false);
	}

	public CreateAllianceForumReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICreateAllianceForum readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		int param4 = reader.readInt();
		return new CreateAllianceForum(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ICreateAllianceForum object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getParent());
	}
}
