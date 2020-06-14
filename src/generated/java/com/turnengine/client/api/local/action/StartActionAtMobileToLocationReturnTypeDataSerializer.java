package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class StartActionAtMobileToLocationReturnTypeDataSerializer extends ObjectSerializer<IStartActionAtMobileToLocation> {

	public StartActionAtMobileToLocationReturnTypeDataSerializer() {
		super(false);
	}

	public StartActionAtMobileToLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStartActionAtMobileToLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		long param6 = reader.readLong();
		boolean param7 = reader.readBoolean();
		return new StartActionAtMobileToLocation(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, IStartActionAtMobileToLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.writeBoolean(object.getAddToQueue());
	}
}
