package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetAdminHostAddressReturnTypeDataSerializer extends ObjectSerializer<IGetAdminHostAddress> {

	public GetAdminHostAddressReturnTypeDataSerializer() {
		super(false);
	}

	public GetAdminHostAddressReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetAdminHostAddress readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetAdminHostAddress(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetAdminHostAddress object) throws IOException {
		writer.writeObject(object.getCode(), new StringSerializer(false));
	}
}
