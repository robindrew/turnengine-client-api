package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class StartActionMovementReturnTypeDataSerializer extends ObjectSerializer<IStartActionMovement> {

	public StartActionMovementReturnTypeDataSerializer() {
		super(false);
	}

	public StartActionMovementReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStartActionMovement readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		boolean param5 = reader.readBoolean();
		return new StartActionMovement(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IStartActionMovement object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getLocationId());
		writer.writeBoolean(object.getAddToQueue());
	}
}
