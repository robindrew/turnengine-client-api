package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.EnumSerializer;
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
		TurnsEnabled param3 = reader.readObject(new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, false));
		return new SetTurnsEnabled(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetTurnsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getUpdating(), new EnumSerializer<TurnsEnabled>(TurnsEnabled.class, false));
	}
}
