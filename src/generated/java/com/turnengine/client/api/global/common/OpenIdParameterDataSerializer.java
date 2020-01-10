package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class OpenIdParameterDataSerializer extends ObjectSerializer<IOpenIdParameter> {

	public OpenIdParameterDataSerializer() {
		super(false);
	}

	public OpenIdParameterDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IOpenIdParameter readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		String param2 = reader.readObject(new StringSerializer(false));
		return new OpenIdParameter(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IOpenIdParameter object) throws IOException {
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
