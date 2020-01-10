package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGoogleOpenIdFormReturnTypeDataSerializer extends ObjectSerializer<IGetGoogleOpenIdForm> {

	public GetGoogleOpenIdFormReturnTypeDataSerializer() {
		super(false);
	}

	public GetGoogleOpenIdFormReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGoogleOpenIdForm readValue(IDataReader reader) throws IOException {
		return new GetGoogleOpenIdForm();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGoogleOpenIdForm object) throws IOException {
	}
}
