package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class StartActionAtLocationToLocationReturnTypeDataSerializer extends ObjectSerializer<IStartActionAtLocationToLocation> {

	public StartActionAtLocationToLocationReturnTypeDataSerializer() {
		super(false);
	}

	public StartActionAtLocationToLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStartActionAtLocationToLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		long param6 = reader.readLong();
		boolean param7 = reader.readBoolean();
		return new StartActionAtLocationToLocation(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeValue(IDataWriter writer, IStartActionAtLocationToLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getFromLocationId());
		writer.writeInt(object.getToLocationId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.writeBoolean(object.getAddToQueue());
	}
}
