package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class StartActionAtLocationReturnTypeDataSerializer extends ObjectSerializer<IStartActionAtLocation> {

	public StartActionAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public StartActionAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStartActionAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		long param5 = reader.readLong();
		boolean param6 = reader.readBoolean();
		return new StartActionAtLocation(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IStartActionAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.writeBoolean(object.getAddToQueue());
	}
}
