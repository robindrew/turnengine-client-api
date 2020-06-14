package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import java.io.IOException;
import java.util.List;

public class UserAdminInfoDataSerializer extends ObjectSerializer<IUserAdminInfo> {

	public UserAdminInfoDataSerializer() {
		super(false);
	}

	public UserAdminInfoDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUserAdminInfo readValue(IDataReader reader) throws IOException {
		IUser param1 = reader.readObject(new UserDataSerializer(false));
		List<IUserAddressCode> param2 = reader.readObject(new ListSerializer<IUserAddressCode>(new UserAddressCodeDataSerializer(false), false));
		return new UserAdminInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IUserAdminInfo object) throws IOException {
		writer.writeObject(object.getUser(), new UserDataSerializer(false));
		writer.writeObject(object.getAddresses(), new ListSerializer<IUserAddressCode>(new UserAddressCodeDataSerializer(false), false));
	}
}
