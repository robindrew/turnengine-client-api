package com.turnengine.client.api.local.turn;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetTurnsEnabledReturnTypeDataSerializer extends ObjectSerializer<ISetTurnsEnabled> {

	public SetTurnsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public SetTurnsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetTurnsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		boolean param3 = reader.readBoolean();
		return new SetTurnsEnabled(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetTurnsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
	}
}
