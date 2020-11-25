package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class AddMoveRegionReturnTypeDataSerializer extends ObjectSerializer<IAddMoveRegion> {

	public AddMoveRegionReturnTypeDataSerializer() {
		super(false);
	}

	public AddMoveRegionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAddMoveRegion readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new AddMoveRegion(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IAddMoveRegion object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getFrom());
		writer.writeInt(object.getTo());
	}
}
