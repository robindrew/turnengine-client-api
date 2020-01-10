package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class MoveMobileReturnTypeDataSerializer extends ObjectSerializer<IMoveMobile> {

	public MoveMobileReturnTypeDataSerializer() {
		super(false);
	}

	public MoveMobileReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMoveMobile readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		boolean param5 = reader.readBoolean();
		boolean param6 = reader.readBoolean();
		return new MoveMobile(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, IMoveMobile object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getLocationId());
		writer.writeBoolean(object.getAddToQueue());
		writer.writeBoolean(object.getRepeat());
	}
}
