package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class UpdateUserAddressCodeReturnTypeDataSerializer extends ObjectSerializer<IUpdateUserAddressCode> {

	public UpdateUserAddressCodeReturnTypeDataSerializer() {
		super(false);
	}

	public UpdateUserAddressCodeReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUpdateUserAddressCode readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		return new UpdateUserAddressCode(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IUpdateUserAddressCode object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getCode(), new StringSerializer(false));
	}
}
