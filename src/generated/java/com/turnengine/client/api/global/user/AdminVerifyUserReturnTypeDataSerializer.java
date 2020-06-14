package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class AdminVerifyUserReturnTypeDataSerializer extends ObjectSerializer<IAdminVerifyUser> {

	public AdminVerifyUserReturnTypeDataSerializer() {
		super(false);
	}

	public AdminVerifyUserReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IAdminVerifyUser readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new AdminVerifyUser(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IAdminVerifyUser object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
	}
}
