package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class CancelActionAtLocationReturnTypeDataSerializer extends ObjectSerializer<ICancelActionAtLocation> {

	public CancelActionAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public CancelActionAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICancelActionAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		long param5 = reader.readLong();
		return new CancelActionAtLocation(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ICancelActionAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
	}
}
