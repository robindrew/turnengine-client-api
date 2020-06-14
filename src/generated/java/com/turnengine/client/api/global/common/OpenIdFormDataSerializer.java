package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.collection.ListSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;
import java.util.List;

public class OpenIdFormDataSerializer extends ObjectSerializer<IOpenIdForm> {

	public OpenIdFormDataSerializer() {
		super(false);
	}

	public OpenIdFormDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IOpenIdForm readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		List<IOpenIdParameter> param2 = reader.readObject(new ListSerializer<IOpenIdParameter>(new OpenIdParameterDataSerializer(false), false));
		return new OpenIdForm(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IOpenIdForm object) throws IOException {
		writer.writeObject(object.getUri(), new StringSerializer(false));
		writer.writeObject(object.getParameterList(), new ListSerializer<IOpenIdParameter>(new OpenIdParameterDataSerializer(false), false));
	}
}
