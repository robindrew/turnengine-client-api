package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class SetUserAddressReturnTypeDataSerializer extends ObjectSerializer<ISetUserAddress> {

	public SetUserAddressReturnTypeDataSerializer() {
		super(false);
	}

	public SetUserAddressReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetUserAddress readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		return new SetUserAddress(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetUserAddress object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getAddress(), new StringSerializer(false));
	}
}
