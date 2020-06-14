package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class LogoutUserReturnTypeDataSerializer extends ObjectSerializer<ILogoutUser> {

	public LogoutUserReturnTypeDataSerializer() {
		super(false);
	}

	public LogoutUserReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILogoutUser readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		return new LogoutUser(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, ILogoutUser object) throws IOException {
		writer.writeLong(object.getLoginId());
	}
}
