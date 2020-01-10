package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetMobileMoveReturnTypeDataSerializer extends ObjectSerializer<ISetMobileMove> {

	public SetMobileMoveReturnTypeDataSerializer() {
		super(false);
	}

	public SetMobileMoveReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetMobileMove readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		int param6 = reader.readInt();
		return new SetMobileMove(param1, param2, param3, param4, param5, param6);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetMobileMove object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getMobileId());
		writer.writeInt(object.getOriginId());
		writer.writeInt(object.getDestinationId());
		writer.writeInt(object.getTurns());
	}
}
