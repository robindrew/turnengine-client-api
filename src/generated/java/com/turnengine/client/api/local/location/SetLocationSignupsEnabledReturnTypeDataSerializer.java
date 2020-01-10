package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetLocationSignupsEnabledReturnTypeDataSerializer extends ObjectSerializer<ISetLocationSignupsEnabled> {

	public SetLocationSignupsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public SetLocationSignupsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetLocationSignupsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		boolean param3 = reader.readBoolean();
		return new SetLocationSignupsEnabled(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetLocationSignupsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
	}
}
