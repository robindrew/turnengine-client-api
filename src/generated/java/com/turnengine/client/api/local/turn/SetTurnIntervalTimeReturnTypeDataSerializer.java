package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SetTurnIntervalTimeReturnTypeDataSerializer extends ObjectSerializer<ISetTurnIntervalTime> {

	public SetTurnIntervalTimeReturnTypeDataSerializer() {
		super(false);
	}

	public SetTurnIntervalTimeReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetTurnIntervalTime readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		TimeUnit param4 = reader.readObject(new EnumSerializer<TimeUnit>(TimeUnit.class, false));
		return new SetTurnIntervalTime(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetTurnIntervalTime object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getInterval());
		writer.writeObject(object.getUnit(), new EnumSerializer<TimeUnit>(TimeUnit.class, false));
	}
}
