package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetServiceStatusReturnTypeDataSerializer extends ObjectSerializer<IGetServiceStatus> {

	public GetServiceStatusReturnTypeDataSerializer() {
		super(false);
	}

	public GetServiceStatusReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetServiceStatus readValue(IDataReader reader) throws IOException {
		return new GetServiceStatus();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetServiceStatus object) throws IOException {
	}
}
