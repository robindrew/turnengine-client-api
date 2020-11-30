package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class MobileCreationDataDataSerializer extends ObjectSerializer<IMobileCreationData> {

	public MobileCreationDataDataSerializer() {
		super(false);
	}

	public MobileCreationDataDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMobileCreationData readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		int param7 = reader.readInt();
		return new MobileCreationData(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, IMobileCreationData object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getPlayerId());
		writer.writeInt(object.getOriginId());
		writer.writeInt(object.getDestinationId());
		writer.writeInt(object.getMoveTurns());
		writer.writeInt(object.getWaitTurns());
	}
}
