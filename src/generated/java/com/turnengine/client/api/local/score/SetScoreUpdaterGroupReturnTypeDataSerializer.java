package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetScoreUpdaterGroupReturnTypeDataSerializer extends ObjectSerializer<ISetScoreUpdaterGroup> {

	public SetScoreUpdaterGroupReturnTypeDataSerializer() {
		super(false);
	}

	public SetScoreUpdaterGroupReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetScoreUpdaterGroup readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new SetScoreUpdaterGroup(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetScoreUpdaterGroup object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer(false));
	}
}
