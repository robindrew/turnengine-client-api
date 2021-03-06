package com.turnengine.client.api.global.user;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class LoginUserReturnTypeDataSerializer extends ObjectSerializer<ILoginUser> {

	public LoginUserReturnTypeDataSerializer() {
		super(false);
	}

	public LoginUserReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILoginUser readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new LoginUser(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ILoginUser object) throws IOException {
		writer.writeObject(object.getNameOrEmail(), new StringSerializer(false));
		writer.writeObject(object.getPassword(), new StringSerializer(false));
		writer.writeObject(object.getAddress(), new StringSerializer(false));
	}
}
