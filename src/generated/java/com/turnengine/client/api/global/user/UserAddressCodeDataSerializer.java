package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.admin.AdminHostAddressDataSerializer;
import com.turnengine.client.api.global.admin.IAdminHostAddress;
import java.io.IOException;

public class UserAddressCodeDataSerializer extends ObjectSerializer<IUserAddressCode> {

	public UserAddressCodeDataSerializer() {
		super(false);
	}

	public UserAddressCodeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUserAddressCode readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		long param3 = reader.readLong();
		IAdminHostAddress param4 = reader.readObject(new AdminHostAddressDataSerializer(false));
		return new UserAddressCode(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IUserAddressCode object) throws IOException {
		writer.writeInt(object.getUserId());
		writer.writeObject(object.getCode(), new StringSerializer(false));
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getDetail(), new AdminHostAddressDataSerializer(false));
	}
}
