package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CreateAllianceForumPostReturnTypeDataSerializer extends ObjectSerializer<ICreateAllianceForumPost> {

	public CreateAllianceForumPostReturnTypeDataSerializer() {
		super(false);
	}

	public CreateAllianceForumPostReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICreateAllianceForumPost readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		return new CreateAllianceForumPost(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ICreateAllianceForumPost object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getThreadId());
		writer.writeObject(object.getSubject(), new StringSerializer(false));
		writer.writeObject(object.getContent(), new StringSerializer(false));
	}
}
