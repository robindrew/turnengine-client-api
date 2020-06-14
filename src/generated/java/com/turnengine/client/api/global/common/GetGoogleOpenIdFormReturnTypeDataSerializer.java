package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
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
