package com.turnengine.client.api.local.setup;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetupSetScoreUpdaterGroupDataSerializer extends ObjectSerializer<ISetupSetScoreUpdaterGroup> {

	public SetupSetScoreUpdaterGroupDataSerializer() {
		super(false);
	}

	public SetupSetScoreUpdaterGroupDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetupSetScoreUpdaterGroup readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new SetupSetScoreUpdaterGroup(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetupSetScoreUpdaterGroup object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer(false));
	}
}
