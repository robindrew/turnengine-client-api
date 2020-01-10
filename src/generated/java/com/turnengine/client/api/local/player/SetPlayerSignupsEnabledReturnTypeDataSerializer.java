package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetPlayerSignupsEnabledReturnTypeDataSerializer extends ObjectSerializer<ISetPlayerSignupsEnabled> {

	public SetPlayerSignupsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public SetPlayerSignupsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetPlayerSignupsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		boolean param3 = reader.readBoolean();
		return new SetPlayerSignupsEnabled(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetPlayerSignupsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
	}
}
