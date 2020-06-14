package com.turnengine.client.api.local.mobile;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class MobileSetupInfoDataSerializer extends ObjectSerializer<IMobileSetupInfo> {

	public MobileSetupInfoDataSerializer() {
		super(false);
	}

	public MobileSetupInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IMobileSetupInfo readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		boolean param2 = reader.readBoolean();
		return new MobileSetupInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IMobileSetupInfo object) throws IOException {
		writer.writeInt(object.getCount());
		writer.writeBoolean(object.getEnabled());
	}
}
