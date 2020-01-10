package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class LocationSetupInfoDataSerializer extends ObjectSerializer<ILocationSetupInfo> {

	public LocationSetupInfoDataSerializer() {
		super(false);
	}

	public LocationSetupInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILocationSetupInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		boolean param2 = reader.readBoolean();
		boolean param3 = reader.readBoolean();
		return new LocationSetupInfo(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ILocationSetupInfo object) throws IOException {
		writer.writeInt(object.getCount());
		writer.writeBoolean(object.getEnabled());
		writer.writeBoolean(object.getSignupsEnabled());
	}
}
